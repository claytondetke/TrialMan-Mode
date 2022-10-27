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

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("trialManMode")
public interface TrialManModeConfig extends Config {
    @ConfigSection(
            name = "Settings",
            description = "Settings'",
            position = 1
    )
    String settingsSection = "settings";

    @ConfigSection(
            name = "Tile Acquisition Rules",
            description = "Rules around acquiring additional tiles.",
            position = 2,
            closedByDefault = true
    )
    String tileRulesSection = "tileRules";

    /***   Settings section   ***/
    @Alpha
    @ConfigItem(
            keyName = "automarkTiles",
            name = "Auto-mark tiles",
            section = settingsSection,
            description = "Automatically mark tiles as you walk.",
            position = 2
    )
    default boolean automarkTiles() {
        return false;
    }

    @Range(
            min = Integer.MIN_VALUE
    )
    @ConfigItem(
            keyName = "warningLimit",
            name = "Unspent tiles warning",
            section = settingsSection,
            description = "Highlights overlay when limit reached",
            position = 3
    )
    default int warningLimit() {
        return 20;
    }

    @ConfigItem(
            keyName = "enableTilesWarning",
            name = "Enable Tiles Warning",
            section = settingsSection,
            description = "Turns on tile warnings when you reach your set limit or 0.",
            position = 4
    )
    default boolean enableTileWarnings() {
        return false;
    }

    @ConfigItem(
            keyName = "allowTileDeficit",
            name = "Allow Tile Deficit",
            section = settingsSection,
            description = "Allows you to place tiles after you have none left.",
            position = 5
    )
    default boolean allowTileDeficit() {
        return false;
    }

    @ConfigItem(
            keyName = "drawOnMinimap",
            name = "Draw tiles on minimap",
            section = settingsSection,
            description = "Configures whether marked tiles should be drawn on minimap",
            position = 6
    )
    default boolean drawTilesOnMinimap() {
        return false;
    }

    @ConfigItem(
            keyName = "drawTilesOnWorldMap",
            name = "Draw tiles on world map",
            section = settingsSection,
            description = "Configures whether marked tiles should be drawn on world map",
            position = 5
    )
    default boolean drawTilesOnWorldMap() {
        return false;
    }

    @Alpha
    @ConfigItem(
            keyName = "markerColor",
            name = "Tile Color",
            section = settingsSection,
            description = "Configures the color of the tiles",
            position = 6
    )
    default Color markerColor() {
        return Color.YELLOW;
    }

    /***   Tile Acquisition Rules section   ***/
    @Range(
            min = Integer.MIN_VALUE
    )
    @ConfigItem(
            keyName = "extraTiles",
            name = "Bonus tiles",
            description = "Add more tiles to your limit, set to 0 for off",
            section = tileRulesSection,
            position = 1
    )
    default int extraTiles() {
        return 9;
    }

    @ConfigItem(
            keyName = "includeMusic",
            name = "Include music unlocks",
            description = "Gain 5 tiles upon unlocking a new music track.",
            section = tileRulesSection,
            position = 2
    )
    default boolean includeMusic() {
        return true;
    }

    @ConfigItem(
            keyName = "excludeTutorialMusic",
            name = "Exclude tutorial music unlocks",
            description = "Exclude gaining tiles from the 7 music tracks unlocked by completing the tutorial.",
            section = tileRulesSection,
            position = 3
    )
    default boolean excludeTutorialMusic() {
        return true;
    }

    @ConfigItem(
            keyName = "includeSkillLevels",
            name = "Include skill levels",
            description = "Gain 5 tiles upon gaining a level in any skill.",
            section = tileRulesSection,
            position = 4
    )
    default boolean includeSkillLevels() {
        return true;
    }

    @ConfigItem(
            keyName = "includeSkillLevelMilestones",
            name = "Include skill level milestones",
            description = "Gain additional tiles upon reaching milestones at the levels of 20, 40, 60, 80, 90, or 99.",
            section = tileRulesSection,
            position = 5
    )
    default boolean includeSkillLevelMilestones() {
        return true;
    }

    @ConfigItem(
            keyName = "includeExp",
            name = "Include Experience",
            description = "Includes experience / 1000 in usable tiles",
            section = tileRulesSection,
            position = 6
    )
    default boolean includeExp() {
        return false;
    }

    @Range(
            min = 500
    )
    @ConfigItem(
            keyName = "expPerTile",
            name = "Exp per Tile",
            description = "Determines how much exp you require per tile",
            section = tileRulesSection,
            position = 7
    )
    default int expPerTile() {
        return 1000;
    }
}
