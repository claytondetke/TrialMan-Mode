/*
 *
 *  * Copyright (c) 2021, Zoinkwiz <https://github.com/Zoinkwiz>
 *  * All rights reserved.
 *  *
 *  * Redistribution and use in source and binary forms, with or without
 *  * modification, are permitted provided that the following conditions are met:
 *  *
 *  * 1. Redistributions of source code must retain the above copyright notice, this
 *  *    list of conditions and the following disclaimer.
 *  * 2. Redistributions in binary form must reproduce the above copyright notice,
 *  *    this list of conditions and the following disclaimer in the documentation
 *  *    and/or other materials provided with the distribution.
 *  *
 *  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package com.trialmanmode.achievementdiaries;

import java.math.BigInteger;
import lombok.Getter;
import net.runelite.api.Client;

public enum AchievementDiaryTasks {
    // Ardougne Easy
    EssMine(1196, 0, AchievementDiaryDetails.Difficulty.EASY),
    StealCake(1196, 1, AchievementDiaryDetails.Difficulty.EASY),
    SellSilk(1196, 2, AchievementDiaryDetails.Difficulty.EASY),
    EastArdyAltar(1196, 4, AchievementDiaryDetails.Difficulty.EASY),
    FishingTrawler(1196, 5, AchievementDiaryDetails.Difficulty.EASY),
    EnterCombatCamp(1196, 6, AchievementDiaryDetails.Difficulty.EASY),
    IdentifySword(1196, 7, AchievementDiaryDetails.Difficulty.EASY),
    WildyLeverArdougne(1196, 9, AchievementDiaryDetails.Difficulty.EASY),
    AlecksEmporium(1196, 11, AchievementDiaryDetails.Difficulty.EASY),
    ProbitaPet(1196, 12, AchievementDiaryDetails.Difficulty.EASY),

    // Ardougne Medium
    UniPen(1196, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    GrapYan(1196, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    ArdyStraw(1196, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPArdy(1196, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    BalloonCW(1196, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    ClaimSand(1196, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    FishOnPlatform(1196, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    PickMasterFarmer(1196, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    CaveNightshade(1196, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    KillSwordchick(1196, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    IbanUpgrade(1196, 24, AchievementDiaryDetails.Difficulty.MEDIUM),
    NecroTower(1196, 25, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Ardougne Hard
    Recharge(1196, 26, AchievementDiaryDetails.Difficulty.HARD),
    MagicGuild(1196, 27, AchievementDiaryDetails.Difficulty.HARD),
    StealChest(1196, 28, AchievementDiaryDetails.Difficulty.HARD),
    MonkeyCage(1196, 29, AchievementDiaryDetails.Difficulty.HARD),
    TPWatchtower(1196, 30, AchievementDiaryDetails.Difficulty.HARD),
    RedSally(1196, 31, AchievementDiaryDetails.Difficulty.HARD),
    PalmTree(1197, 0, AchievementDiaryDetails.Difficulty.HARD),
    PoisonIvy(1197, 1, AchievementDiaryDetails.Difficulty.HARD),
    MithPlate(1197, 2, AchievementDiaryDetails.Difficulty.HARD),
    YanPOH(1197, 3, AchievementDiaryDetails.Difficulty.HARD),
    DragSquare(1197, 4, AchievementDiaryDetails.Difficulty.HARD),
    DeathRune(1197, 5, AchievementDiaryDetails.Difficulty.HARD),

    // Ardougne Elite
    TrawlerRay(1197, 6, AchievementDiaryDetails.Difficulty.ELITE),
    YanAgi(1197, 7, AchievementDiaryDetails.Difficulty.ELITE),
    PickHero(1197, 9, AchievementDiaryDetails.Difficulty.ELITE),
    RuneCrossbow(1197, 8, AchievementDiaryDetails.Difficulty.ELITE),
    ImbueSalve(1197, 10, AchievementDiaryDetails.Difficulty.ELITE),
    PickTorstol(1197, 11, AchievementDiaryDetails.Difficulty.ELITE),
    ArdyRooftops(1197, 12, AchievementDiaryDetails.Difficulty.ELITE),
    IceBarrageArdougne(1197, 13, AchievementDiaryDetails.Difficulty.ELITE),

    // Desert Easy
    GoldWarbler(1198, 1, AchievementDiaryDetails.Difficulty.EASY),
    FiveClay(1198, 2, AchievementDiaryDetails.Difficulty.EASY),
    EnterKalph(1198, 3, AchievementDiaryDetails.Difficulty.EASY),
    EnterDesert(1198, 4, AchievementDiaryDetails.Difficulty.EASY),
    KillVulture(1198, 5, AchievementDiaryDetails.Difficulty.EASY),
    NardahHerb(1198, 6, AchievementDiaryDetails.Difficulty.EASY),
    CollectCacti(1198, 7, AchievementDiaryDetails.Difficulty.EASY),
    SellArtefact(1198, 8, AchievementDiaryDetails.Difficulty.EASY),
    OpenSarc(1198, 9, AchievementDiaryDetails.Difficulty.EASY),
    CutCactus(1198, 10, AchievementDiaryDetails.Difficulty.EASY),
    MagicCarpetEasy(1198, 11, AchievementDiaryDetails.Difficulty.EASY),

    // Desert Medium
    AgiPyramid(1198, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    DesertLizard(1198, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    OrangeSally(1198, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    PhoenixFeather(1198, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    MagicCarpetMedium(1198, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    EagleTravel(1198, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    PrayElidinis(1198, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    CombatPot(1198, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPEnakhra(1198, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    VisitGenie(1198, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPPollnivneach(1198, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChopTeak(1198, 23, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Desert Hard
    MenaThug(1198, 24, AchievementDiaryDetails.Difficulty.HARD),
    Granite(1198, 25, AchievementDiaryDetails.Difficulty.HARD),
    RefillWaterskin(1198, 26, AchievementDiaryDetails.Difficulty.HARD),
    KalphQueen(1198, 27, AchievementDiaryDetails.Difficulty.HARD),
    PollRooftop(1198, 28, AchievementDiaryDetails.Difficulty.HARD),
    KillDust(1198, 29, AchievementDiaryDetails.Difficulty.HARD),
    AncientMagicks(1198, 30, AchievementDiaryDetails.Difficulty.HARD),
    KillLocustRider(1198, 31, AchievementDiaryDetails.Difficulty.HARD),
    BurnYew(1199, 0, AchievementDiaryDetails.Difficulty.HARD),
    MithPlatebody(1199, 1, AchievementDiaryDetails.Difficulty.HARD),

    // Desert Elite
    WildPie(1199, 2, AchievementDiaryDetails.Difficulty.ELITE),
    IceBarrageDesert(1199, 4, AchievementDiaryDetails.Difficulty.ELITE),
    DragonDarts(1199, 5, AchievementDiaryDetails.Difficulty.ELITE),
    TalkKQHead(1199, 6, AchievementDiaryDetails.Difficulty.ELITE),
    GrandGoldChest(1199, 7, AchievementDiaryDetails.Difficulty.ELITE),
    RestorePrayerDesert(1199, 8, AchievementDiaryDetails.Difficulty.ELITE),

    // Falador Easy
    FamilyCrest(1186, 0, AchievementDiaryDetails.Difficulty.EASY),
    ClimbedWall(1186, 1, AchievementDiaryDetails.Difficulty.EASY),
    SarahFarmingShop(1186, 2, AchievementDiaryDetails.Difficulty.EASY),
    GotHaircut(1186, 3, AchievementDiaryDetails.Difficulty.EASY),
    FilledWater(1186, 4, AchievementDiaryDetails.Difficulty.EASY),
    KilledDuck(1186, 5, AchievementDiaryDetails.Difficulty.EASY),
    MindTiara(1186, 6, AchievementDiaryDetails.Difficulty.EASY),
    Entrana(1186, 7, AchievementDiaryDetails.Difficulty.EASY),
    MotherloadMine(1186, 8, AchievementDiaryDetails.Difficulty.EASY),
    GotSecurityBook(1186, 9, AchievementDiaryDetails.Difficulty.EASY),
    BluriteLimbs(1186, 10, AchievementDiaryDetails.Difficulty.EASY),

    // Falador Medium
    LitLantern(1186, 11, AchievementDiaryDetails.Difficulty.MEDIUM),
    TelegrabbedWine(1186, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    UnlockedCrystalChest(1186, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    PlacedScarecrow(1186, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    KilledMogre(1186, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    VisitRatPits(1186, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    GrappleNorthWall(1186, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    PickpocketGuard(1186, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    PrayAtAltar(1186, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineGoldFalador(1186, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    DwarfShortcut(1186, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChopBurnWillowTav(1186, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    BasketFalLoom(1186, 24, AchievementDiaryDetails.Difficulty.MEDIUM),
    TeleportFalador(1186, 25, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Falador Hard
    CraftedMindRunes(1186, 26, AchievementDiaryDetails.Difficulty.HARD),
    ChangedFamilyCrest(1186, 27, AchievementDiaryDetails.Difficulty.HARD),
    KilledMole(1186, 28, AchievementDiaryDetails.Difficulty.HARD),
    KilledWyvern(1186, 29, AchievementDiaryDetails.Difficulty.HARD),
    CompleteAgiCourse(1186, 30, AchievementDiaryDetails.Difficulty.HARD),
    EnterMiningGuildWithProspector(1186, 31, AchievementDiaryDetails.Difficulty.HARD),
    KilledBlueDragon(1187, 0, AchievementDiaryDetails.Difficulty.HARD),
    CrackedWallSafe(1187, 1, AchievementDiaryDetails.Difficulty.HARD),
    PraySarimAltarProsy(1187, 2, AchievementDiaryDetails.Difficulty.HARD),
    EnterWarriorsGuild(1187, 3, AchievementDiaryDetails.Difficulty.HARD),
    DwarvenHelmetDwarvenMines(1187, 4, AchievementDiaryDetails.Difficulty.HARD),

    // Falador Elite
    CraftedAirRunes(1187, 5, AchievementDiaryDetails.Difficulty.ELITE),
    PurchasedWhite2hSword(1187, 6, AchievementDiaryDetails.Difficulty.ELITE),
    GotMagicRoots(1187, 7, AchievementDiaryDetails.Difficulty.ELITE),
    PerformedSkillCapeEmote(1187, 8, AchievementDiaryDetails.Difficulty.ELITE),
    JumpedOverStrangeFloor(1187, 9, AchievementDiaryDetails.Difficulty.ELITE),
    MadeSaraBrew(1187, 10, AchievementDiaryDetails.Difficulty.ELITE),

    // Fremennik Easy
    CatchCerulean(1184, 1, AchievementDiaryDetails.Difficulty.EASY),
    ChangeBoots(1184, 2, AchievementDiaryDetails.Difficulty.EASY),
    KilledCrabs(1184, 3, AchievementDiaryDetails.Difficulty.EASY),
    CraftTiara(1184, 4, AchievementDiaryDetails.Difficulty.EASY),
    BrowseStonemason(1184, 5, AchievementDiaryDetails.Difficulty.EASY),
    CollectSnapeGrass(1184, 6, AchievementDiaryDetails.Difficulty.EASY),
    StealStall(1184, 7, AchievementDiaryDetails.Difficulty.EASY),
    FillBucket(1184, 8, AchievementDiaryDetails.Difficulty.EASY),
    EnterTrollStronghold(1184, 9, AchievementDiaryDetails.Difficulty.EASY),
    ChopAndBurnOak(1184, 10, AchievementDiaryDetails.Difficulty.EASY),

    // Fremennik Medium
    SlayBrineRat(1184, 11, AchievementDiaryDetails.Difficulty.MEDIUM),
    SnowyHunter(1184, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineCoalFremennik(1184, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    StealFish(1184, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    TravelMisc(1184, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    SnowyKnight(1184, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    PetRockPOH(1184, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    Lighthouse(1184, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineGoldFremennik(1184, 20, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Fremennik Hard
    TPTroll(1184, 21, AchievementDiaryDetails.Difficulty.HARD),
    CatchKyatt(1184, 23, AchievementDiaryDetails.Difficulty.HARD),
    MixSuperDef(1184, 24, AchievementDiaryDetails.Difficulty.HARD),
    StealGem(1184, 25, AchievementDiaryDetails.Difficulty.HARD),
    CraftShield(1184, 26, AchievementDiaryDetails.Difficulty.HARD),
    MineAddy(1184, 27, AchievementDiaryDetails.Difficulty.HARD),
    MiscSupport(1184, 28, AchievementDiaryDetails.Difficulty.HARD),
    TPWaterbirth(1184, 29, AchievementDiaryDetails.Difficulty.HARD),
    FreeBlast(1184, 30, AchievementDiaryDetails.Difficulty.HARD),

    // Fremennik Elite
    DagKings(1184, 31, AchievementDiaryDetails.Difficulty.ELITE),
    AstralRunes(1185, 0, AchievementDiaryDetails.Difficulty.ELITE),
    DragonAmulet(1185, 1, AchievementDiaryDetails.Difficulty.ELITE),
    RellRooftop(1185, 2, AchievementDiaryDetails.Difficulty.ELITE),
    GodwarsGenerals(1185, 3, AchievementDiaryDetails.Difficulty.ELITE),
    SpiritualMage(1185, 4, AchievementDiaryDetails.Difficulty.ELITE),

    // Kandarin Easy
    CatchMackerel(1178, 1, AchievementDiaryDetails.Difficulty.EASY),
    BuyCandle(1178, 2, AchievementDiaryDetails.Difficulty.EASY),
    CollectFlax(1178, 3, AchievementDiaryDetails.Difficulty.EASY),
    PlayOrgan(1178, 4, AchievementDiaryDetails.Difficulty.EASY),
    PlantJute(1178, 5, AchievementDiaryDetails.Difficulty.EASY),
    CupTea(1178, 6, AchievementDiaryDetails.Difficulty.EASY),
    KillEle(1178, 7, AchievementDiaryDetails.Difficulty.EASY),
    PetFish(1178, 8, AchievementDiaryDetails.Difficulty.EASY),
    BuyStew(1178, 9, AchievementDiaryDetails.Difficulty.EASY),
    TalkSherlock(1178, 10, AchievementDiaryDetails.Difficulty.EASY),
    LogShortcut(1178, 11, AchievementDiaryDetails.Difficulty.EASY),

    // Kandarin Medium
    BarbAgi(1178, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    SuperAnti(1178, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    EnterRange(1178, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    GrapOb(1178, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    CatchCookBass(1178, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPCam(1178, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    StringMaple(1178, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    PickLimp(1178, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    MindHelm(1178, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    FireGiant(1178, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    BarbAss(1178, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    StealHemen(1178, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    TravelMcGrubor(1178, 24, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineCoalKandarin(1178, 25, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Kandarin Hard
    CatchStur(1178, 26, AchievementDiaryDetails.Difficulty.HARD),
    SeersRooftop(1178, 27, AchievementDiaryDetails.Difficulty.HARD),
    YewLong(1178, 28, AchievementDiaryDetails.Difficulty.HARD),
    PietyCourt(1178, 29, AchievementDiaryDetails.Difficulty.HARD),
    WaterOrb(1178, 30, AchievementDiaryDetails.Difficulty.HARD),
    BurnMaple(1178, 31, AchievementDiaryDetails.Difficulty.HARD),
    ShadowHound(1179, 0, AchievementDiaryDetails.Difficulty.HARD),
    MithrilDrag(1179, 1, AchievementDiaryDetails.Difficulty.HARD),
    BuyGranite(1179, 2, AchievementDiaryDetails.Difficulty.HARD),
    FancyStoneKandarin(1179, 3, AchievementDiaryDetails.Difficulty.HARD),
    AddySpear(1179, 4, AchievementDiaryDetails.Difficulty.HARD),

    // Kandarin Elite
    barb5(1179, 5, AchievementDiaryDetails.Difficulty.ELITE),
    PickDwarf(1179, 6, AchievementDiaryDetails.Difficulty.ELITE),
    Shark5(1179, 7, AchievementDiaryDetails.Difficulty.ELITE),
    StamMix(1179, 8, AchievementDiaryDetails.Difficulty.ELITE),
    RuneHasta(1179, 9, AchievementDiaryDetails.Difficulty.ELITE),
    Pyre(1179, 10, AchievementDiaryDetails.Difficulty.ELITE),
    TPCath(1179, 11, AchievementDiaryDetails.Difficulty.ELITE),

    // Karamja Easy
    PickedBananas(3566, 4, false, AchievementDiaryDetails.Difficulty.EASY),
    SwungOnRope(3567, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    MinedGoldKaramja(3568, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    GoneToSarim(3569, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    GoneToArdougne(3570, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    GoneToCairn(3571, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    Fished(3572, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    PickedUpSeaweed(3573, 4, false, AchievementDiaryDetails.Difficulty.EASY),
    EnteredFightCave(3574, 0, true, AchievementDiaryDetails.Difficulty.EASY),
    KilledJogre(3575, 0, true, AchievementDiaryDetails.Difficulty.EASY),

    // Karamja Medium
    ClaimedTicket(3579, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    EnteredWall(3580, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    EnteredCrandor(3581, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    UsedCart(3582, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    Earned100(3583, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CookedSpider(3584, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    MinedRedRopaz(3585, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CutTeak(3586, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CutMahog(3587, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CaughtKarambwan(3588, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    ExchangedGems(3589, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    UsedGlider(3590, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    GrownFruitTree(3591, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    TrappedGraahk(3592, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CutVine(3593, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CrossedLava(3594, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    ClimbedStairs(3595, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    TraveledToKhazard(3596, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),
    CharteredFromShipyard(3597, 0, true, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Karamja Hard
    BecomeChampion(3600, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    KilledZek(3601, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    EatenWrap(3602, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    CraftedNature(3603, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    CookedKarambwan(3604, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    KilledDeathwing(3605, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    UsedShortcut(3606, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    CollectedLeaves(3607, 5, false, AchievementDiaryDetails.Difficulty.HARD),
    AssignedTask(3608, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    KilledDragon(3609, 0, true, AchievementDiaryDetails.Difficulty.HARD),
    
    // Karamja Elite
    CraftedRunes(1200, 1, AchievementDiaryDetails.Difficulty.ELITE),
    EquippedFireCape(1200, 2, AchievementDiaryDetails.Difficulty.ELITE),
    CheckedPalm(1200, 3, AchievementDiaryDetails.Difficulty.ELITE),
    MadePotion(1200, 4, AchievementDiaryDetails.Difficulty.ELITE),
    CheckedCalquat(1200, 5, AchievementDiaryDetails.Difficulty.ELITE),

    // Kourend & Kebos Easy
    MineIronKourend(2085, 1, AchievementDiaryDetails.Difficulty.EASY),
    SandCrab(2085, 2, AchievementDiaryDetails.Difficulty.EASY),
    ArceuusBook(2085, 3, AchievementDiaryDetails.Difficulty.EASY),
    StealFruit(2085, 4, AchievementDiaryDetails.Difficulty.EASY),
    WarrensStore(2085, 5, AchievementDiaryDetails.Difficulty.EASY),
    BoatLandsEnd(2085, 6, AchievementDiaryDetails.Difficulty.EASY),
    PrayCastle(2085, 7, AchievementDiaryDetails.Difficulty.EASY),
    DigSaltpetre(2085, 8, AchievementDiaryDetails.Difficulty.EASY),
    EnterPoh(2085, 9, AchievementDiaryDetails.Difficulty.EASY),
    HealSoldier(2085, 10, AchievementDiaryDetails.Difficulty.EASY),
    StrengthPotion(2085, 11, AchievementDiaryDetails.Difficulty.EASY),
    FishTrout(2085, 12, AchievementDiaryDetails.Difficulty.EASY),

    // Kourend & Kebos Medium
    FairyRing(2085, 25, AchievementDiaryDetails.Difficulty.MEDIUM),
    KillLizardman(2085, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    TravelWithMemoirs(2085, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineSulphur(2085, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    EnterFarmingGuild(2085, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    SwitchSpellbooks(2085, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    RepairCrane(2085, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    DeliverIntelligence(2085, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    CatchBluegill(2085, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    UseBoulderShortcut(2085, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    SubdueWintertodt(2085, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    CatchChinchompa(2085, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChopMahoganyTree(2085, 24, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Kourend & Kebos Hard
    WoodcuttingGuild(2085, 26, AchievementDiaryDetails.Difficulty.HARD),
    SmeltAddyBar(2085, 27, AchievementDiaryDetails.Difficulty.HARD),
    KillLizardmanShaman(2085, 28, AchievementDiaryDetails.Difficulty.HARD),
    MineLovakite(2085, 29, AchievementDiaryDetails.Difficulty.HARD),
    PlantLogavano(2085, 31, AchievementDiaryDetails.Difficulty.HARD),
    KillZombieKourend(2085, 30, AchievementDiaryDetails.Difficulty.HARD),
    TeleportHeart(2086, 0, AchievementDiaryDetails.Difficulty.HARD),
    DeliverArtifact(2086, 1, AchievementDiaryDetails.Difficulty.HARD),
    KillWyrm(2086, 2, AchievementDiaryDetails.Difficulty.HARD),
    ExamineMonster(2086, 3, AchievementDiaryDetails.Difficulty.HARD),

    // Kourend & Kebos Elite
    CraftBloodRune(2086, 4, AchievementDiaryDetails.Difficulty.ELITE),
    ChopRedwood(2086, 5, AchievementDiaryDetails.Difficulty.ELITE),
    DefeatSkotizo(2086, 6, AchievementDiaryDetails.Difficulty.ELITE),
    CatchAngler(2086, 7, AchievementDiaryDetails.Difficulty.ELITE),
    KillHydra(2086, 8, AchievementDiaryDetails.Difficulty.ELITE),
    CreateTeleport(2086, 9, AchievementDiaryDetails.Difficulty.ELITE),
    CompleteRaid(2086, 10, AchievementDiaryDetails.Difficulty.ELITE),
    FletchBattlestaff(2086, 11, AchievementDiaryDetails.Difficulty.ELITE),

    // Lumbridge & Draynor Easy
    DrayAgi(1194, 1, AchievementDiaryDetails.Difficulty.EASY),
    KillCaveBug(1194, 2, AchievementDiaryDetails.Difficulty.EASY),
    Sedridor(1194, 3, AchievementDiaryDetails.Difficulty.EASY),
    WaterRune(1194, 4, AchievementDiaryDetails.Difficulty.EASY),
    Hans(1194, 5, AchievementDiaryDetails.Difficulty.EASY),
    Pickpocket(1194, 6, AchievementDiaryDetails.Difficulty.EASY),
    Oak(1194, 7, AchievementDiaryDetails.Difficulty.EASY),
    KillZombieDraynor(1194, 8, AchievementDiaryDetails.Difficulty.EASY),
    FishAnchovies(1194, 9, AchievementDiaryDetails.Difficulty.EASY),
    Bread(1194, 10, AchievementDiaryDetails.Difficulty.EASY),
    IronLumbridge(1194, 11, AchievementDiaryDetails.Difficulty.EASY),
    EnterHAM(1194, 12, AchievementDiaryDetails.Difficulty.EASY),

    // Lumbridge & Draynor Medium
    AlKaridRooftop(1194, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    GrappleLum(1194, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    UpgradeDevice(1194, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    WizardFairy(1194, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPlumb(1194, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    CatchSalmon(1194, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    CraftCoif(1194, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChopWillow(1194, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    PickGardener(1194, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChaeldarTask(1194, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    PuroImp(1194, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    CraftLava(1194, 24, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Lumbridge & Draynor Hard
    BonesToPeachesPalace(1194, 25, AchievementDiaryDetails.Difficulty.HARD),
    JuttingWall(1194, 26, AchievementDiaryDetails.Difficulty.HARD),
    Cosmics(1194, 27, AchievementDiaryDetails.Difficulty.HARD),
    WakaToEdge(1194, 28, AchievementDiaryDetails.Difficulty.HARD),
    HundredTears(1194, 29, AchievementDiaryDetails.Difficulty.HARD),
    TrainToKeld(1194, 30, AchievementDiaryDetails.Difficulty.HARD),
    BarrowsGloves(1194, 31, AchievementDiaryDetails.Difficulty.HARD),
    Belladonna(1195, 0, AchievementDiaryDetails.Difficulty.HARD),
    LightMiningHelm(1195, 1, AchievementDiaryDetails.Difficulty.HARD),
    SmiteAltarLumbridge(1195, 2, AchievementDiaryDetails.Difficulty.HARD),
    PowerAmmy(1195, 3, AchievementDiaryDetails.Difficulty.HARD),

    // Lumbridge & Draynor Elite
    RichChest(1195, 4, AchievementDiaryDetails.Difficulty.ELITE),
    Movario(1195, 5, AchievementDiaryDetails.Difficulty.ELITE),
    ChopMagic(1195, 6, AchievementDiaryDetails.Difficulty.ELITE),
    AddyPlatebody(1195, 7, AchievementDiaryDetails.Difficulty.ELITE),
    WaterRunes(1195, 8, AchievementDiaryDetails.Difficulty.ELITE),
    QCEmote(1195, 9, AchievementDiaryDetails.Difficulty.ELITE),

    // Morytania Easy
    CraftSnelm(1180, 1, AchievementDiaryDetails.Difficulty.EASY),
    CookSnail(1180, 2, AchievementDiaryDetails.Difficulty.EASY),
    Mazchna(1180, 3, AchievementDiaryDetails.Difficulty.EASY),
    KillBanshee(1180, 4, AchievementDiaryDetails.Difficulty.EASY),
    SbottTan(1180, 5, AchievementDiaryDetails.Difficulty.EASY),
    EnterSwamp(1180, 6, AchievementDiaryDetails.Difficulty.EASY),
    KillGhoul(1180, 7, AchievementDiaryDetails.Difficulty.EASY),
    PlaceScarecrow(1180, 8, AchievementDiaryDetails.Difficulty.EASY),
    OfferBonemeal(1180, 9, AchievementDiaryDetails.Difficulty.EASY),
    KillWerewolf(1180, 10, AchievementDiaryDetails.Difficulty.EASY),
    RestorePrayerMorytania(1180, 11, AchievementDiaryDetails.Difficulty.EASY),

    // Morytania Medium
    SwampLizard(1180, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    CanifisAgi(1180, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    HollowTree(1180, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    DragontoothIsland(1180, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    TerrorDog(1180, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    TroubleBrewing(1180, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    SwampBoaty(1180, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    CannonBall(1180, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    FeverSpider(1180, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    EctophialTP(1180, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    GuthBalance(1180, 22, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Morytania Hard
    Kharyrll(1180, 23, AchievementDiaryDetails.Difficulty.HARD),
    AdvancedSpikes(1180, 24, AchievementDiaryDetails.Difficulty.HARD),
    HarvestWatermelon(1180, 25, AchievementDiaryDetails.Difficulty.HARD),
    BurnMaho(1180, 26, AchievementDiaryDetails.Difficulty.HARD),
    HardTempleTrekk(1180, 27, AchievementDiaryDetails.Difficulty.HARD),
    CaveHorror(1180, 28, AchievementDiaryDetails.Difficulty.HARD),
    BittercapMush(1180, 29, AchievementDiaryDetails.Difficulty.HARD),
    PietyAltar(1180, 30, AchievementDiaryDetails.Difficulty.HARD),
    BridgeSalve(1181, 1, AchievementDiaryDetails.Difficulty.HARD),
    MithOre(1181, 2, AchievementDiaryDetails.Difficulty.HARD),

    // Morytania Elite
    BareHandShark(1181, 3, AchievementDiaryDetails.Difficulty.ELITE),
    CremateShade(1181, 4, AchievementDiaryDetails.Difficulty.ELITE),
    FertilizeHerb(1181, 5, AchievementDiaryDetails.Difficulty.ELITE),
    CraftBlackDhideBody(1181, 6, AchievementDiaryDetails.Difficulty.ELITE),
    AbyssalDemon(1181, 7, AchievementDiaryDetails.Difficulty.ELITE),
    BarrowsChest(1181, 8, AchievementDiaryDetails.Difficulty.ELITE),

    // Varrock Easy
    Thessalia(1176, 1, AchievementDiaryDetails.Difficulty.EASY),
    Aubury(1176, 2, AchievementDiaryDetails.Difficulty.EASY),
    IronVarrock(1176, 3, AchievementDiaryDetails.Difficulty.EASY),
    Plank(1176, 4, AchievementDiaryDetails.Difficulty.EASY),
    StrongholdSecond(1176, 5, AchievementDiaryDetails.Difficulty.EASY),
    Fence(1176, 6, AchievementDiaryDetails.Difficulty.EASY),
    DyingTree(1176, 7, AchievementDiaryDetails.Difficulty.EASY),
    News(1176, 8, AchievementDiaryDetails.Difficulty.EASY),
    DogBone(1176, 9, AchievementDiaryDetails.Difficulty.EASY),
    Bowl(1176, 10, AchievementDiaryDetails.Difficulty.EASY),
    Kudos(1176, 11, AchievementDiaryDetails.Difficulty.EASY),
    EarthRuneEasy(1176, 12, AchievementDiaryDetails.Difficulty.EASY),
    Trout(1176, 13, AchievementDiaryDetails.Difficulty.EASY),
    TeaStall(1176, 14, AchievementDiaryDetails.Difficulty.EASY),

    // Varrock Medium
    ApothStr(1176, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    Champs(1176, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    CatColour(1176, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    GESpirit(1176, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    StrongholdEmote(1176, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    Tolna(1176, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPDigsite(1176, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    TPVarrock(1176, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    Vannaka(1176, 24, AchievementDiaryDetails.Difficulty.MEDIUM),
    Maho20(1176, 25, AchievementDiaryDetails.Difficulty.MEDIUM),
    WhiteFruit(1176, 26, AchievementDiaryDetails.Difficulty.MEDIUM),
    Balloon(1176, 27, AchievementDiaryDetails.Difficulty.MEDIUM),
    VarrAgi(1176, 28, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Varrock Hard
    SpottyCape(1176, 29, AchievementDiaryDetails.Difficulty.HARD),
    Kudos153(1176, 30, AchievementDiaryDetails.Difficulty.HARD),
    WakkaEdge(1176, 31, AchievementDiaryDetails.Difficulty.HARD),
    PaddewwaTP(1177, 0, AchievementDiaryDetails.Difficulty.HARD),
    SkullSceptre(1177, 1, AchievementDiaryDetails.Difficulty.HARD),
    YewChurch(1177, 2, AchievementDiaryDetails.Difficulty.HARD),
    FancyStoneVarrock(1177, 3, AchievementDiaryDetails.Difficulty.HARD),
    YewRoots(1177, 4, AchievementDiaryDetails.Difficulty.HARD),
    SmiteAltarVarrock(1177, 5, AchievementDiaryDetails.Difficulty.HARD),
    Pipe(1177, 6, AchievementDiaryDetails.Difficulty.HARD),

    // Varrock Elite
    SuperCombat(1177, 7, AchievementDiaryDetails.Difficulty.ELITE),
    PlankMake(1177, 8, AchievementDiaryDetails.Difficulty.ELITE),
    SummerPie(1177, 9, AchievementDiaryDetails.Difficulty.ELITE),
    RuneDart(1177, 10, AchievementDiaryDetails.Difficulty.ELITE),
    EarthRuneElite(1177, 11, AchievementDiaryDetails.Difficulty.ELITE),

    // Western Provinces Easy
    CopperLongtail(1182, 1, AchievementDiaryDetails.Difficulty.EASY),
    NovicePest(1182, 2, AchievementDiaryDetails.Difficulty.EASY),
    MineIronWestern(1182, 3, AchievementDiaryDetails.Difficulty.EASY),
    GnomeAgi(1182, 4, AchievementDiaryDetails.Difficulty.EASY),
    GnomeBall(1182, 5, AchievementDiaryDetails.Difficulty.EASY),
    ChompyHatEasy(1182, 6, AchievementDiaryDetails.Difficulty.EASY),
    TPPest(1182, 7, AchievementDiaryDetails.Difficulty.EASY),
    SwampToadCollect(1182, 8, AchievementDiaryDetails.Difficulty.EASY),
    BrimstailEssence(1182, 9, AchievementDiaryDetails.Difficulty.EASY),
    OakShortbow(1182, 10, AchievementDiaryDetails.Difficulty.EASY),
    Terrorbird(1182, 11, AchievementDiaryDetails.Difficulty.EASY),

    // Western Provinces Medium
    AgiShortcut(1182, 12, AchievementDiaryDetails.Difficulty.MEDIUM),
    SpiritToStronghold(1182, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    SpinedLarupia(1182, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    ApeBass(1182, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    ApeTeak(1182, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    InterPest(1182, 17, AchievementDiaryDetails.Difficulty.MEDIUM),
    GliderToFeldip(1182, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChompyHatMedium(1182, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    EagleFeldip(1182, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    ChocolateBomb(1182, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    GnomeDelivery(1182, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    CrystalSaw(1182, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    MineGoldWestern(1182, 24, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Western Provinces Hard
    ElfCystalBow(1182, 25, AchievementDiaryDetails.Difficulty.HARD),
    MonkfishPisc(1182, 26, AchievementDiaryDetails.Difficulty.HARD),
    VetPest(1182, 27, AchievementDiaryDetails.Difficulty.HARD),
    DashingKebbit(1182, 28, AchievementDiaryDetails.Difficulty.HARD),
    ApeAtollAgi(1182, 29, AchievementDiaryDetails.Difficulty.HARD),
    MahoganyBurned(1182, 30, AchievementDiaryDetails.Difficulty.HARD),
    MineAddyOre(1182, 31, AchievementDiaryDetails.Difficulty.HARD),
    LletyaPalm(1183, 0, AchievementDiaryDetails.Difficulty.HARD),
    ChompyHatHard(1183, 1, AchievementDiaryDetails.Difficulty.HARD),
    IsafdarPainting(1183, 2, AchievementDiaryDetails.Difficulty.HARD),
    KillZulrah(1183, 3, AchievementDiaryDetails.Difficulty.HARD),
    TPApe(1183, 4, AchievementDiaryDetails.Difficulty.HARD),
    PickpocketGnome(1183, 5, AchievementDiaryDetails.Difficulty.HARD),

    // Western Provinces Elite
    MagicLong(1183, 6, AchievementDiaryDetails.Difficulty.ELITE),
    KillThermy(1183, 7, AchievementDiaryDetails.Difficulty.ELITE),
    PrissyScilla(1183, 8, AchievementDiaryDetails.Difficulty.ELITE),
    AdvancedAgi(1183, 9, AchievementDiaryDetails.Difficulty.ELITE),
    FullVoid(1183, 12, AchievementDiaryDetails.Difficulty.ELITE),
    ChompyHatElite(1183, 13, AchievementDiaryDetails.Difficulty.ELITE),
    PickpocketElf(1183, 14, AchievementDiaryDetails.Difficulty.ELITE),

    // Wilderness Easy
    LowAlch(1192, 1, AchievementDiaryDetails.Difficulty.EASY),
    WildyLeverWilderness(1192, 2, AchievementDiaryDetails.Difficulty.EASY),
    ChaosAltar(1192, 3, AchievementDiaryDetails.Difficulty.EASY),
    ChaosTemple(1192, 4, AchievementDiaryDetails.Difficulty.EASY),
    KillMammoth(1192, 5, AchievementDiaryDetails.Difficulty.EASY),
    EarthWarrior(1192, 6, AchievementDiaryDetails.Difficulty.EASY),
    DemonicPrayer(1192, 7, AchievementDiaryDetails.Difficulty.EASY),
    EnterKBDLair(1192, 8, AchievementDiaryDetails.Difficulty.EASY),
    SpiderEggs(1192, 9, AchievementDiaryDetails.Difficulty.EASY),
    IronOre(1192, 10, AchievementDiaryDetails.Difficulty.EASY),
    EnterAbyss(1192, 11, AchievementDiaryDetails.Difficulty.EASY),
    EquipTeamCape(1192, 12, AchievementDiaryDetails.Difficulty.EASY),

    // Wilderness Medium
    MineMith(1192, 13, AchievementDiaryDetails.Difficulty.MEDIUM),
    EntYew(1192, 14, AchievementDiaryDetails.Difficulty.MEDIUM),
    WildyGodWars(1192, 15, AchievementDiaryDetails.Difficulty.MEDIUM),
    WildyAgi(1192, 16, AchievementDiaryDetails.Difficulty.MEDIUM),
    KillGreenDrag(1192, 18, AchievementDiaryDetails.Difficulty.MEDIUM),
    KillAnkou(1192, 19, AchievementDiaryDetails.Difficulty.MEDIUM),
    EarthOrb(1192, 20, AchievementDiaryDetails.Difficulty.MEDIUM),
    WildyGWBloodveld(1192, 21, AchievementDiaryDetails.Difficulty.MEDIUM),
    EmblemTrader(1192, 22, AchievementDiaryDetails.Difficulty.MEDIUM),
    GoldHelm(1192, 23, AchievementDiaryDetails.Difficulty.MEDIUM),
    MuddyChest(1192, 24, AchievementDiaryDetails.Difficulty.MEDIUM),

    // Wilderness Hard
    GodSpells(1192, 25, AchievementDiaryDetails.Difficulty.HARD),
    AirOrb(1192, 26, AchievementDiaryDetails.Difficulty.HARD),
    BlackSally(1192, 27, AchievementDiaryDetails.Difficulty.HARD),
    AddyScim(1192, 28, AchievementDiaryDetails.Difficulty.HARD),
    LavaDrag(1192, 29, AchievementDiaryDetails.Difficulty.HARD),
    ChaosEle(1192, 30, AchievementDiaryDetails.Difficulty.HARD),
    ThreeBossesHard(1192, 31, AchievementDiaryDetails.Difficulty.HARD),
    TrollWildy(1193, 0, AchievementDiaryDetails.Difficulty.HARD),
    SprirtualWarrior(1193, 1, AchievementDiaryDetails.Difficulty.HARD),
    RawLavaEel(1193, 2, AchievementDiaryDetails.Difficulty.HARD),

    // Wilderness Elite
    ThreeBossesElite(1193, 3, AchievementDiaryDetails.Difficulty.ELITE),
    TPGhorrock(1193, 5, AchievementDiaryDetails.Difficulty.ELITE),
    DarkCrab(1193, 7, AchievementDiaryDetails.Difficulty.ELITE),
    RuneScim(1193, 8, AchievementDiaryDetails.Difficulty.ELITE),
    RoguesChest(1193, 9, AchievementDiaryDetails.Difficulty.ELITE),
    SpiritMage(1193, 10, AchievementDiaryDetails.Difficulty.ELITE),
    MagicLogs(1193, 11, AchievementDiaryDetails.Difficulty.ELITE),
    ;

    private final int varId;
    private final int bitPosition;
    private final int expectedValue;
    private final boolean isBinaryCompletion;

    @Getter
    public final AchievementDiaryDetails.Difficulty difficulty;

    AchievementDiaryTasks(int varbitId, int value, boolean isBinaryCompletion, AchievementDiaryDetails.Difficulty difficulty) {
        this.varId = varbitId;
        this.bitPosition = -1;
        this.expectedValue = value;
        this.isBinaryCompletion = isBinaryCompletion;
        this.difficulty = difficulty;
    }

    AchievementDiaryTasks(int varplayerId, int bitPosition, AchievementDiaryDetails.Difficulty difficulty)
    {
        this.varId = varplayerId;
        this.bitPosition = bitPosition;
        this.expectedValue = -1;
        this.isBinaryCompletion = true;
        this.difficulty = difficulty;
    }

    public boolean isComplete(Client client)
    {
        // Most tasks
        if (bitPosition >= 0) {
            return BigInteger.valueOf(client.getVarpValue(varId)).testBit(bitPosition);
        }

        // Most Karamja tasks
        if (isBinaryCompletion) {
            return client.getVarbitValue(varId) != 0;
        }
        // A few Karamja tasks
        return expectedValue >= client.getVarbitValue(varId);
    }
}
