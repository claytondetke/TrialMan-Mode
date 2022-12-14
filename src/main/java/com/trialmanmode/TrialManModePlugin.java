/*
 * Copyright (c) 2018, TheLonelyDev <https://github.com/TheLonelyDev>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ConorLeckey <https://github.com/ConorLeckey>
 * Copyright (c) 2022, Clayton Detke <https://github.com/claytondetke>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.trialmanmode;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Provides;
import com.trialmanmode.achievementdiaries.AchievementDiaryCompletion;
import com.trialmanmode.achievementdiaries.AchievementDiaryTasks;
import com.trialmanmode.music.MusicVarPlayers;
import com.trialmanmode.quests.QuestHelperQuest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@PluginDescriptor(
        name = "TrialMan Mode",
        description = "Automatically draws tiles where you walk, and calculates available tiles based on completed trials.",
        tags = {"overlay", "tiles"}
)
public class TrialManModePlugin extends Plugin {
    private static final String CONFIG_GROUP = "trialManMode";
    private static final String MARK = "Unlock TrialMan tile";
    private static final String UNMARK = "Clear TrialMan tile";
    private static final String WALK_HERE = "Walk here";
    private static final String REGION_PREFIX = "region_";

    private static final Gson GSON = new Gson();

    @Getter(AccessLevel.PACKAGE)
    private final List<WorldPoint> points = new ArrayList<>();

    @Inject
    private Client client;

    @Getter
    @Inject
    private ClientThread clientThread;

    @Inject
    private TrialManModeConfig config;

    @Inject
    private ConfigManager configManager;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private TilemanModeOverlay overlay;

    @Inject
    private TilemanModeMinimapOverlay minimapOverlay;

    @Inject
    private TilemanModeWorldMapOverlay worldMapOverlay;

    @Inject
    private TileInfoOverlay infoOverlay;

    @Inject
    private ClientToolbar clientToolbar;

    @Provides
    TrialManModeConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(TrialManModeConfig.class);
    }

    private final MovementFlag[] fullBlock = new MovementFlag[]
            {MovementFlag.BLOCK_MOVEMENT_FLOOR,
                    MovementFlag.BLOCK_MOVEMENT_FLOOR_DECORATION,
                    MovementFlag.BLOCK_MOVEMENT_OBJECT,
                    MovementFlag.BLOCK_MOVEMENT_FULL};

    private final MovementFlag[] allDirections = new MovementFlag[]
            {
                    MovementFlag.BLOCK_MOVEMENT_NORTH_WEST,
                    MovementFlag.BLOCK_MOVEMENT_NORTH,
                    MovementFlag.BLOCK_MOVEMENT_NORTH_EAST,
                    MovementFlag.BLOCK_MOVEMENT_EAST,
                    MovementFlag.BLOCK_MOVEMENT_SOUTH_EAST,
                    MovementFlag.BLOCK_MOVEMENT_SOUTH,
                    MovementFlag.BLOCK_MOVEMENT_SOUTH_WEST,
                    MovementFlag.BLOCK_MOVEMENT_WEST
            };

    private final HashSet<Integer> tutorialIslandRegionIds = new HashSet<Integer>();

    private int totalTilesUsed, remainingTiles, xpUntilNextTile;
    private LocalPoint lastTile;
    private int lastPlane;
    private boolean lastAutoTilesConfig = false;
    private boolean inHouse = false;
    private long totalXp;

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event) {
        if (event.getMenuAction().getId() != MenuAction.RUNELITE.getId() ||
                !(event.getMenuOption().equals(MARK) || event.getMenuOption().equals(UNMARK))) {
            return;
        }

        Tile target = client.getSelectedSceneTile();
        if (target == null) {
            return;
        }
        handleMenuOption(target.getLocalLocation(), event.getMenuOption().equals(MARK));
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {
        final boolean hotKeyPressed = client.isKeyPressed(KeyCode.KC_SHIFT);
        if (hotKeyPressed && event.getOption().equals(WALK_HERE)) {
            final Tile selectedSceneTile = client.getSelectedSceneTile();

            if (selectedSceneTile == null) {
                return;
            }


            final WorldPoint worldPoint = WorldPoint.fromLocalInstance(client, selectedSceneTile.getLocalLocation());
            final int regionId = worldPoint.getRegionID();
            final TrialManModeTile point = new TrialManModeTile(regionId, worldPoint.getRegionX(), worldPoint.getRegionY(), client.getPlane());

            client.createMenuEntry(-1)
                    .setOption(getTiles(regionId).contains(point) ? UNMARK : MARK)
                    .setTarget(event.getTarget())
                    .setType(MenuAction.RUNELITE);

        }
    }

    @Subscribe
    public void onGameTick(GameTick tick) {
        autoMark();
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() != GameState.LOGGED_IN) {
            lastTile = null;
            return;
        }
        loadPoints();
        clientThread.invoke(this::updateTileCounter);
        inHouse = false;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        // Check if automark tiles is on, and if so attempt to step on current tile
        final WorldPoint playerPos = client.getLocalPlayer().getWorldLocation();
        final LocalPoint playerPosLocal = LocalPoint.fromWorld(client, playerPos);
        if (playerPosLocal != null && config.automarkTiles() && !lastAutoTilesConfig) {
            handleWalkedToTile(playerPosLocal);
        }
        lastAutoTilesConfig = config.automarkTiles();
        clientThread.invoke(this::updateTileCounter);
    }


    @Subscribe
    public void onGameObjectSpawned(GameObjectSpawned event) {
        GameObject gameObject = event.getGameObject();

        if (gameObject.getId() == 4525) {
            inHouse = true;
        }
    }

    @Override
    protected void startUp() {
        tutorialIslandRegionIds.add(12079);
        tutorialIslandRegionIds.add(12080);
        tutorialIslandRegionIds.add(12335);
        tutorialIslandRegionIds.add(12336);
        tutorialIslandRegionIds.add(12592);
        overlayManager.add(overlay);
        overlayManager.add(minimapOverlay);
        overlayManager.add(worldMapOverlay);
        overlayManager.add(infoOverlay);
        loadPoints();
        clientThread.invoke(this::updateTileCounter);
        log.debug("startup");
        TrialManModeImportPanel panel = new TrialManModeImportPanel(this);
        NavigationButton navButton = NavigationButton.builder()
                .tooltip("TrialMan Import")
                .icon(ImageUtil.getResourceStreamFromClass(getClass(), "/icon.png"))
                .priority(70)
                .panel(panel)
                .build();

        clientToolbar.addNavigation(navButton);
    }

    @Override
    protected void shutDown() {
        tutorialIslandRegionIds.clear();
        overlayManager.remove(overlay);
        overlayManager.remove(minimapOverlay);
        overlayManager.remove(worldMapOverlay);
        overlayManager.remove(infoOverlay);
        points.clear();
    }

    private void autoMark() {
        final WorldPoint playerPos = client.getLocalPlayer().getWorldLocation();
        if (playerPos == null) {
            return;
        }

        final LocalPoint playerPosLocal = LocalPoint.fromWorld(client, playerPos);
        if (playerPosLocal == null) {
            return;
        }

        long currentTotalXp = client.getOverallExperience();

        // If we have no last tile, we probably just spawned in, so make sure we walk on our current tile
        if ((lastTile == null
                || (lastTile.distanceTo(playerPosLocal) != 0 && lastPlane == playerPos.getPlane())
                || lastPlane != playerPos.getPlane()) && !regionIsOnTutorialIsland(playerPos.getRegionID())) {
            // Player moved
            handleWalkedToTile(playerPosLocal);
            lastTile = playerPosLocal;
            lastPlane = client.getPlane();
            clientThread.invoke(this::updateTileCounter);
            log.debug("player moved");
            log.debug("last tile={}  distance={}", lastTile, lastTile == null ? "null" : lastTile.distanceTo(playerPosLocal));
        } else if (totalXp != currentTotalXp) {
            clientThread.invoke(this::updateTileCounter);
            totalXp = currentTotalXp;
        }
    }

    public void importGroundMarkerTiles() {
        // Get and store all the Ground Markers Regions
        List<String> groundMarkerRegions = getAllRegionIds("groundMarker");
        // If none, Exit function

        // Get and store array list of existing Tileman World Regions (like updateTileCounter does)
        List<String> tilemanModeRegions = getAllRegionIds(CONFIG_GROUP);

        // CONVERSION
        // Loop through Ground Marker Regions
        for (String region : groundMarkerRegions) {
            // Get Ground Markers Region's Tiles
            ArrayList<TrialManModeTile> groundMarkerTiles =
                    new ArrayList<>(getConfiguration("groundMarker", REGION_PREFIX + region));
            // If region already exists in Tileman World Regions Array:
            if (tilemanModeRegions.contains(region)) {
                // Create Empty ArrayList for Region;
                // Get Tileman Region's tiles and add them to the region array list
                ArrayList<TrialManModeTile> regionTiles = new ArrayList<>(getTiles(region));

                // Create int for regionOriginalSize;
                // Set regionOriginalSize to arraylists length
                int regionOriginalSize = regionTiles.size();

                // Loop through Ground Markers Points
                for (TrialManModeTile groundMarkerTile : groundMarkerTiles) {
                    // If Ground Marker point already exists in Tileman World Region: Break loop iteration
                    if (regionTiles.contains(groundMarkerTile)) {
                        continue;
                    }
                    // Add point to array list
                    regionTiles.add(groundMarkerTile);
                }
                // If regionOriginalSize != current size
                if (regionOriginalSize != regionTiles.size()) {
                    // Save points for arrayList
                    savePoints(Integer.parseInt(region), regionTiles);
                }
            } else {
                // Save points for that region
                savePoints(Integer.parseInt(region), groundMarkerTiles);
            }
        }
        loadPoints();
    }

    public void importTilemanModeTiles() {
        // Get and store all the TilemanMode Regions
        List<String> tilemanRegions = getAllRegionIds("tilemanMode");
        // If none, Exit function

        // Get and store array list of existing TrialMan World Regions (like updateTileCounter does)
        List<String> trialManModeRegions = getAllRegionIds(CONFIG_GROUP);

        // CONVERSION
        // Loop through Tileman Regions
        for (String region : tilemanRegions) {
            // Get Tileman Region's Tiles
            ArrayList<TrialManModeTile> tilemanTiles =
                    new ArrayList<>(getConfiguration("tilemanMode", REGION_PREFIX + region));
            // If region already exists in TrialMan World Regions Array:
            if (trialManModeRegions.contains(region)) {
                // Create Empty ArrayList for Region;
                // Get Tileman Region's tiles and add them to the region array list
                ArrayList<TrialManModeTile> regionTiles = new ArrayList<>(getTiles(region));

                // Create int for regionOriginalSize;
                // Set regionOriginalSize to arraylists length
                int regionOriginalSize = regionTiles.size();

                // Loop through Tileman Points
                for (TrialManModeTile tilemanTile : tilemanTiles) {
                    // If Tileman point already exists in TrialMan World Region: Break loop iteration
                    if (regionTiles.contains(tilemanTile)) {
                        continue;
                    }
                    // Add point to array list
                    regionTiles.add(tilemanTile);
                }
                // If regionOriginalSize != current size
                if (regionOriginalSize != regionTiles.size()) {
                    // Save points for arrayList
                    savePoints(Integer.parseInt(region), regionTiles);
                }
            } else {
                // Save points for that region
                savePoints(Integer.parseInt(region), tilemanTiles);
            }
        }
        loadPoints();
    }

    List<String> getAllRegionIds(String configGroup) {
        return removeRegionPrefixes(configManager.getConfigurationKeys(configGroup + ".region"));
    }

    private List<String> removeRegionPrefixes(List<String> regions) {
        List<String> trimmedRegions = new ArrayList<String>();
        for (String region : regions) {
            trimmedRegions.add(removeRegionPrefix(region));
        }
        return trimmedRegions;
    }

    private String removeRegionPrefix(String region) {
        return region.substring(region.indexOf('_') + 1);
    }

    Collection<TrialManModeTile> getTiles(int regionId) {
        return getConfiguration(CONFIG_GROUP, REGION_PREFIX + regionId);
    }

    private Collection<TrialManModeTile> getTiles(String regionId) {
        return getConfiguration(CONFIG_GROUP, REGION_PREFIX + regionId);
    }

    private void updateTileCounter() {
        List<String> regions = configManager.getConfigurationKeys(CONFIG_GROUP + ".region");
        int placedTiles = 0;
        for (String region : regions) {
            Collection<TrialManModeTile> regionTiles = getTiles(removeRegionPrefix(region));

            placedTiles += regionTiles.size();
        }

        log.debug("Updating tile counter");

        updateTotalTilesUsed(placedTiles);
        updateRemainingTiles(placedTiles);
        updateXpUntilNextTile();
    }

    private void updateTotalTilesUsed(int totalTilesCount) {
        totalTilesUsed = totalTilesCount;
    }

    private final int skillTier = 5;
    private final int beginnerTier = 10;
    private final int easyTier = 25;
    private final int mediumTier = 50;
    private final int hardTier = 100;
    private final int eliteTier = 250;
    private final int masterTier = 500;
    private final int grandmasterTier = 1000;
    private final int heroTier = 2500;
    private final int legendTier = 5000;
    private final int mythTier = 10000;

    private void updateRemainingTiles(int placedTiles) {
        // Start with player-specified quantity of bonus tiles.
        int unlockedTiles = config.extraTiles();

        unlockedTiles += unlockedTilesFromExp();
        unlockedTiles += unlockedTilesFromMusicTracks();
        unlockedTiles += unlockedTilesFromLevels();
        unlockedTiles += unlockedTilesFromLevelMilestones();
        unlockedTiles += unlockedTilesFromQuests();
        unlockedTiles += unlockedTilesFromAchievementDiaryCompletions();
        unlockedTiles += unlockedTilesFromAchievementDiaryTasks();

        remainingTiles = unlockedTiles - placedTiles;
    }

    // If including exp, the total number of unlocked tiles from exp.
    private int unlockedTilesFromExp() {
        if (config.includeExp()) {
            return (int) client.getOverallExperience() / config.expPerTile();
        }
        return 0;
    }

    private int unlockedTilesFromMusicTracks() {
        if (config.includeMusic()) {
            int unlockedMusicTracks = 0;
            for (MusicVarPlayers musicVar : MusicVarPlayers.values()) {
                unlockedMusicTracks += convertToBits(client.getVarpValue(musicVar.getVarPlayerId()));
            }
            if (config.excludeTutorialMusic()) {
                final int tutorialMusicTracksUnlocked = 7;
                unlockedMusicTracks -= tutorialMusicTracksUnlocked;
            }
            return unlockedMusicTracks * skillTier;
        }
        return 0;
    }

    private int convertToBits(int sourceInt) {
        String binaryString = Long.toBinaryString(sourceInt & 0xffffffffL | 0x100000000L ).substring(1);
        return StringUtils.countMatches(binaryString, '1');
    }

    private int unlockedTilesFromLevels() {
        if (config.includeSkillLevels()) {
            final int startingTotalLevel = 32;
            return skillTier * (client.getTotalLevel() - startingTotalLevel);
        }
        return 0;
    }

    private int unlockedTilesFromLevelMilestones() {
        int unlockedTiles = 0;
        if (config.includeSkillLevelMilestones()) {
            int[] skillLevels = client.getRealSkillLevels();
            for (int skillLevel : skillLevels) {
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 20, beginnerTier);
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 40, easyTier);
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 60, mediumTier);
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 80, hardTier);
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 90, eliteTier);
                unlockedTiles += unlockedTilesFromLevelMilestone(skillLevel, 99, masterTier);
            }
        }
        return unlockedTiles;
    }

    private int unlockedTilesFromLevelMilestone(int currentLevel, int milestone, int rewardTier) {
        if (currentLevel >= milestone) {
            return rewardTier - skillTier;
        }
        return 0;
    }

    private int unlockedTilesFromQuests() {
        int unlockedTiles = 0;
        if (config.includeQuestCompletions()) {
            for (QuestHelperQuest quest : QuestHelperQuest.values()) {
                if (quest.isComplete(client)) {
                    switch(quest.getDifficulty()) {
                        case NOVICE:
                            unlockedTiles += mediumTier;
                            break;
                        case INTERMEDIATE:
                            unlockedTiles += hardTier;
                            break;
                        case EXPERIENCED:
                            unlockedTiles += eliteTier;
                            break;
                        case MASTER:
                            unlockedTiles += masterTier;
                            break;
                        case GRANDMASTER:
                            unlockedTiles += grandmasterTier;
                            break;
                        case MINIQUEST:
                            if (config.includeMiniquestCompletions()) {
                                unlockedTiles += easyTier;
                            }
                            break;
                    }
                }
            }
        }
        return unlockedTiles;
    }

    private int unlockedTilesFromAchievementDiaryCompletions() {
        int unlockedTiles = 0;
        if (config.includeAchievementDiaries()) {
            int totalDiariesCompleted = 0;
            for (AchievementDiaryCompletion diary : AchievementDiaryCompletion.values()) {
                if (diary.isComplete(client)) {
                    totalDiariesCompleted++;
                    switch(diary.getDifficulty()) {
                        case EASY:
                            unlockedTiles += hardTier;
                            break;
                        case MEDIUM:
                            unlockedTiles += eliteTier;
                            break;
                        case HARD:
                            unlockedTiles += masterTier;
                            break;
                        case ELITE:
                            unlockedTiles += grandmasterTier;
                            break;
                    }
                }
            }
            // 12 locations, 4 tiers
            if (totalDiariesCompleted == 48) {
                unlockedTiles += heroTier;
            }
        }
        return unlockedTiles;
    }

    private int unlockedTilesFromAchievementDiaryTasks() {
        int unlockedTiles = 0;
        if (config.includeAchievementDiaries()) {
            for (AchievementDiaryTasks task : AchievementDiaryTasks.values()) {
                if (task.isComplete(client)) {
                    switch(task.getDifficulty()) {
                        case EASY:
                            unlockedTiles += easyTier;
                            break;
                        case MEDIUM:
                            unlockedTiles += mediumTier;
                            break;
                        case HARD:
                            unlockedTiles += hardTier;
                            break;
                        case ELITE:
                            unlockedTiles += eliteTier;
                            break;
                    }
                }
            }
        }
        return unlockedTiles;
    }

    private void updateXpUntilNextTile() {
        xpUntilNextTile = config.expPerTile() - Integer.parseInt(Long.toString(client.getOverallExperience() % config.expPerTile()));
    }

    private Collection<TrialManModeTile> getConfiguration(String configGroup, String key) {
        String json = configManager.getConfiguration(configGroup, key);

        if (Strings.isNullOrEmpty(json)) {
            return Collections.emptyList();
        }

        return GSON.fromJson(json, new TypeToken<List<TrialManModeTile>>() {
        }.getType());
    }

    private void loadPoints() {
        points.clear();

        int[] regions = client.getMapRegions();

        if (regions == null) {
            return;
        }

        for (int regionId : regions) {
            // load points for region
            log.debug("Loading points for region {}", regionId);
            Collection<WorldPoint> worldPoint = translateToWorldPoint(getTiles(regionId));
            points.addAll(worldPoint);
        }
        clientThread.invoke(this::updateTileCounter);
    }

    private void savePoints(int regionId, Collection<TrialManModeTile> points) {
        if (points == null || points.isEmpty()) {
            configManager.unsetConfiguration(CONFIG_GROUP, REGION_PREFIX + regionId);
            return;
        }

        String json = GSON.toJson(points);
        configManager.setConfiguration(CONFIG_GROUP, REGION_PREFIX + regionId, json);
    }

    private Collection<WorldPoint> translateToWorldPoint(Collection<TrialManModeTile> points) {
        if (points.isEmpty()) {
            return Collections.emptyList();
        }

        return points.stream()
                .map(point -> WorldPoint.fromRegion(point.getRegionId(), point.getRegionX(), point.getRegionY(), point.getZ()))
                .flatMap(worldPoint ->
                {
                    final Collection<WorldPoint> localWorldPoints = WorldPoint.toLocalInstance(client, worldPoint);
                    return localWorldPoints.stream();
                })
                .collect(Collectors.toList());
    }

    int getTotalTiles() {
        return totalTilesUsed;
    }

    int getRemainingTiles() {
        return remainingTiles;
    }

    private void handleMenuOption(LocalPoint selectedPoint, boolean markedValue) {
        if (selectedPoint == null) {
            return;
        }
        updateTileMark(selectedPoint, markedValue);
    }

    private void handleWalkedToTile(LocalPoint currentPlayerPoint) {
        if (currentPlayerPoint == null ||
                inHouse ||
                !config.automarkTiles()) {
            return;
        }

        // Mark the tile they walked to
        updateTileMark(currentPlayerPoint, true);

        // If player moves 2 tiles in a straight line, fill in the middle tile
        // TODO Fill path between last point and current point. This will fix missing tiles that occur when you lag
        // TODO   and rendered frames are skipped. See if RL has an api that mimic's OSRS's pathing. If so, use that to
        // TODO   set all tiles between current tile and lastTile as marked
        if(lastTile != null){
            int xDiff = currentPlayerPoint.getX() - lastTile.getX();
            int yDiff = currentPlayerPoint.getY() - lastTile.getY();
            int yModifier = yDiff / 2;
            int xModifier = xDiff / 2;

            switch(lastTile.distanceTo(currentPlayerPoint)) {
                case 0: // Haven't moved
                case 128: // Moved 1 tile
                    return;
                case 181: // Moved 1 tile diagonally
                    handleCornerMovement(xDiff, yDiff);
                    break;
                case 256: // Moved 2 tiles straight
                case 362: // Moved 2 tiles diagonally
                    fillTile(new LocalPoint(lastTile.getX() + xModifier, lastTile.getY() + yModifier));
                    break;
                case 286: // Moved in an 'L' shape
                    handleLMovement(xDiff, yDiff);
                    break;
            }
        }
    }

    private void handleLMovement(int xDiff, int yDiff) {
        int xModifier = xDiff / 2;
        int yModifier = yDiff / 2;
        int tileBesideXDiff, tileBesideYDiff;

        // Whichever direction has moved only one, keep it 0. This is the translation to the potential 'problem' gameObject
        if (Math.abs(yDiff) == 128) {
            tileBesideXDiff = xDiff;
            tileBesideYDiff = 0;
        } else {
            tileBesideXDiff = 0;
            tileBesideYDiff = yDiff;
        }

        MovementFlag[] tileBesideFlagsArray = getTileMovementFlags(lastTile.getX() + tileBesideXDiff, lastTile.getY() + tileBesideYDiff);

        if (tileBesideFlagsArray.length == 0) {
            fillTile(new LocalPoint(lastTile.getX() + tileBesideXDiff / 2, lastTile.getY() + tileBesideYDiff / 2));
        } else if (containsAnyOf(fullBlock, tileBesideFlagsArray)) {
            if (yModifier == 64) {
                yModifier = 128;
            } else if (xModifier == 64) {
                xModifier = 128;
            }
            fillTile(new LocalPoint(lastTile.getX() + xModifier, lastTile.getY() + yModifier));
        } else if (containsAnyOf(allDirections, tileBesideFlagsArray)){
            MovementFlag direction1, direction2;
            if (yDiff == 256 || yDiff == -128) {
                // Moving 2 North or 1 South
                direction1 = MovementFlag.BLOCK_MOVEMENT_SOUTH;
            } else {
                // Moving 2 South or 1 North
                direction1 = MovementFlag.BLOCK_MOVEMENT_NORTH;
            }
            if (xDiff == 256 || xDiff == -128) {
                // Moving 2 East or 1 West
                direction2 = MovementFlag.BLOCK_MOVEMENT_WEST;
            } else {
                // Moving 2 West or 1 East
                direction2 = MovementFlag.BLOCK_MOVEMENT_EAST;
            }

            if (containsAnyOf(tileBesideFlagsArray, new MovementFlag[]{direction1, direction2})) {
                // Interrupted
                if (yModifier == 64) {
                    yModifier = 128;
                } else if (xModifier == 64) {
                    xModifier = 128;
                }
                fillTile(new LocalPoint(lastTile.getX() + xModifier, lastTile.getY() + yModifier));
            } else {
                // Normal Pathing
                fillTile(new LocalPoint(lastTile.getX() + tileBesideXDiff / 2, lastTile.getY() + tileBesideYDiff / 2));
            }
        }
    }

    private void handleCornerMovement(int xDiff, int yDiff) {
        LocalPoint northPoint;
        LocalPoint southPoint;
        if(yDiff > 0) {
            northPoint = new LocalPoint(lastTile.getX(), lastTile.getY() + yDiff);
            southPoint = new LocalPoint(lastTile.getX() + xDiff, lastTile.getY());
        } else {
            northPoint = new LocalPoint(lastTile.getX() + xDiff, lastTile.getY());
            southPoint = new LocalPoint(lastTile.getX(), lastTile.getY() + yDiff);
        }

        MovementFlag[] northTile = getTileMovementFlags(northPoint);
        MovementFlag[] southTile = getTileMovementFlags(southPoint);

        if (xDiff + yDiff == 0) {
            // Diagonal tilts north west
            if(containsAnyOf(fullBlock, northTile)
                    || containsAnyOf(northTile, new MovementFlag[]{MovementFlag.BLOCK_MOVEMENT_SOUTH, MovementFlag.BLOCK_MOVEMENT_WEST})){
                fillTile(southPoint);
            } else if (containsAnyOf(fullBlock, southTile)
                    || containsAnyOf(southTile, new MovementFlag[]{MovementFlag.BLOCK_MOVEMENT_NORTH, MovementFlag.BLOCK_MOVEMENT_EAST})){
                fillTile(northPoint);
            }
        } else {
            // Diagonal tilts north east
            if(containsAnyOf(fullBlock, northTile)
                    || containsAnyOf(northTile, new MovementFlag[]{MovementFlag.BLOCK_MOVEMENT_SOUTH, MovementFlag.BLOCK_MOVEMENT_EAST})){
                fillTile(southPoint);
            } else if (containsAnyOf(fullBlock, southTile)
                    || containsAnyOf(southTile, new MovementFlag[]{MovementFlag.BLOCK_MOVEMENT_NORTH, MovementFlag.BLOCK_MOVEMENT_WEST})){
                fillTile(northPoint);
            }
        }
    }

    private MovementFlag[] getTileMovementFlags(int x, int y) {
        LocalPoint pointBeside = new LocalPoint(x, y);

        CollisionData[] collisionData = client.getCollisionMaps();
        assert collisionData != null;
        int[][] collisionDataFlags = collisionData[client.getPlane()].getFlags();

        Set<MovementFlag> tilesBesideFlagsSet = MovementFlag.getSetFlags(collisionDataFlags[pointBeside.getSceneX()][pointBeside.getSceneY()]);
        MovementFlag[] tileBesideFlagsArray = new MovementFlag[tilesBesideFlagsSet.size()];
        tilesBesideFlagsSet.toArray(tileBesideFlagsArray);

        return tileBesideFlagsArray;
    }

    private MovementFlag[] getTileMovementFlags(LocalPoint localPoint) {
        return  getTileMovementFlags(localPoint.getX(), localPoint.getY());
    }

    private boolean containsAnyOf(MovementFlag[] comparisonFlags, MovementFlag[] flagsToCompare) {
        if (comparisonFlags.length == 0 || flagsToCompare.length == 0) {
            return false;
        }
        for (MovementFlag flag : flagsToCompare) {
            if (Arrays.asList(comparisonFlags).contains(flag)) {
                return true;
            }
        }
        return false;
    }

    private boolean regionIsOnTutorialIsland(int regionId) {
        return tutorialIslandRegionIds.contains(regionId);
    }

    private void fillTile(LocalPoint localPoint){
        if(lastPlane != client.getPlane()) {
            return;
        }
        updateTileMark(localPoint, true);
    }

    private void updateTileMark(LocalPoint localPoint, boolean markedValue) {
        if(containsAnyOf(getTileMovementFlags(localPoint), fullBlock)) {
            return;
        }

        WorldPoint worldPoint = WorldPoint.fromLocalInstance(client, localPoint);

        int regionId = worldPoint.getRegionID();
        TrialManModeTile point = new TrialManModeTile(regionId, worldPoint.getRegionX(), worldPoint.getRegionY(), client.getPlane());
        log.debug("Updating point: {} - {}", point, worldPoint);

        List<TrialManModeTile> tilemanModeTiles = new ArrayList<>(getTiles(regionId));

        if (markedValue) {
            // Try add tile
            if (!tilemanModeTiles.contains(point) && (config.allowTileDeficit() || remainingTiles > 0)) {
                tilemanModeTiles.add(point);
            }
        } else {
            // Try remove tile
            tilemanModeTiles.remove(point);
        }

        savePoints(regionId, tilemanModeTiles);
        loadPoints();
    }

    int getXpUntilNextTile() {
        return xpUntilNextTile;
    }

    @AllArgsConstructor
    enum MovementFlag {
        BLOCK_MOVEMENT_NORTH_WEST(CollisionDataFlag.BLOCK_MOVEMENT_NORTH_WEST),
        BLOCK_MOVEMENT_NORTH(CollisionDataFlag.BLOCK_MOVEMENT_NORTH),
        BLOCK_MOVEMENT_NORTH_EAST(CollisionDataFlag.BLOCK_MOVEMENT_NORTH_EAST),
        BLOCK_MOVEMENT_EAST(CollisionDataFlag.BLOCK_MOVEMENT_EAST),
        BLOCK_MOVEMENT_SOUTH_EAST(CollisionDataFlag.BLOCK_MOVEMENT_SOUTH_EAST),
        BLOCK_MOVEMENT_SOUTH(CollisionDataFlag.BLOCK_MOVEMENT_SOUTH),
        BLOCK_MOVEMENT_SOUTH_WEST(CollisionDataFlag.BLOCK_MOVEMENT_SOUTH_WEST),
        BLOCK_MOVEMENT_WEST(CollisionDataFlag.BLOCK_MOVEMENT_WEST),

        BLOCK_MOVEMENT_OBJECT(CollisionDataFlag.BLOCK_MOVEMENT_OBJECT),
        BLOCK_MOVEMENT_FLOOR_DECORATION(CollisionDataFlag.BLOCK_MOVEMENT_FLOOR_DECORATION),
        BLOCK_MOVEMENT_FLOOR(CollisionDataFlag.BLOCK_MOVEMENT_FLOOR),
        BLOCK_MOVEMENT_FULL(CollisionDataFlag.BLOCK_MOVEMENT_FULL);

        @Getter
        private int flag;

        /**
         * @param collisionData The tile collision flags.
         * @return The set of {@link MovementFlag}s that have been set.
         */
        public static Set<MovementFlag> getSetFlags(int collisionData) {
            return Arrays.stream(values())
                    .filter(movementFlag -> (movementFlag.flag & collisionData) != 0)
                    .collect(Collectors.toSet());
        }
    }

}
