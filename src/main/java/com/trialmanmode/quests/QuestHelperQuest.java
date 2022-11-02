/*
 * Copyright (c) 2020, Zoinkwiz
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
package com.trialmanmode.quests;

import lombok.Getter;
import net.runelite.api.*;

public enum QuestHelperQuest
{
	//Free Quests
	BELOW_ICE_MOUNTAIN(Quest.BELOW_ICE_MOUNTAIN, QuestDetails.Difficulty.NOVICE),
	BLACK_KNIGHTS_FORTRESS(Quest.BLACK_KNIGHTS_FORTRESS, QuestDetails.Difficulty.NOVICE),
	COOKS_ASSISTANT(Quest.COOKS_ASSISTANT, QuestDetails.Difficulty.NOVICE),
	THE_CORSAIR_CURSE(Quest.THE_CORSAIR_CURSE, QuestDetails.Difficulty.NOVICE),
	DEMON_SLAYER(Quest.DEMON_SLAYER, QuestDetails.Difficulty.NOVICE),
	DORICS_QUEST(Quest.DORICS_QUEST, QuestDetails.Difficulty.NOVICE),
	DRAGON_SLAYER_I(Quest.DRAGON_SLAYER_I, QuestDetails.Difficulty.EXPERIENCED),
	ERNEST_THE_CHICKEN(Quest.ERNEST_THE_CHICKEN, QuestDetails.Difficulty.NOVICE),
	GOBLIN_DIPLOMACY(Quest.GOBLIN_DIPLOMACY, QuestDetails.Difficulty.NOVICE),
	IMP_CATCHER(Quest.IMP_CATCHER, QuestDetails.Difficulty.NOVICE),
	THE_KNIGHTS_SWORD(Quest.THE_KNIGHTS_SWORD, QuestDetails.Difficulty.INTERMEDIATE),
	MISTHALIN_MYSTERY(Quest.MISTHALIN_MYSTERY, QuestDetails.Difficulty.NOVICE),
	PIRATES_TREASURE(Quest.PIRATES_TREASURE, QuestDetails.Difficulty.NOVICE),
	PRINCE_ALI_RESCUE(Quest.PRINCE_ALI_RESCUE, QuestDetails.Difficulty.INTERMEDIATE),
	THE_RESTLESS_GHOST(Quest.THE_RESTLESS_GHOST, QuestDetails.Difficulty.NOVICE),
	ROMEO__JULIET(Quest.ROMEO__JULIET, QuestDetails.Difficulty.NOVICE),
	RUNE_MYSTERIES(Quest.RUNE_MYSTERIES, QuestDetails.Difficulty.NOVICE),
	SHEEP_SHEARER(Quest.SHEEP_SHEARER, QuestDetails.Difficulty.NOVICE),
	SHIELD_OF_ARRAV_PHOENIX_GANG(Quest.SHIELD_OF_ARRAV, QuestDetails.Difficulty.NOVICE),
	VAMPYRE_SLAYER(Quest.VAMPYRE_SLAYER, QuestDetails.Difficulty.NOVICE),
	WITCHS_POTION(Quest.WITCHS_POTION, QuestDetails.Difficulty.NOVICE),
	X_MARKS_THE_SPOT(Quest.X_MARKS_THE_SPOT, QuestDetails.Difficulty.NOVICE),

	//Members' Quests
	ANIMAL_MAGNETISM(Quest.ANIMAL_MAGNETISM.getId(), "Animal Magnetism", QuestDetails.Difficulty.INTERMEDIATE),
	ANOTHER_SLICE_OF_HAM(Quest.ANOTHER_SLICE_OF_HAM, QuestDetails.Difficulty.INTERMEDIATE),
	BENEATH_CURSED_SANDS(Quest.BENEATH_CURSED_SANDS, QuestDetails.Difficulty.MASTER),
	BETWEEN_A_ROCK(Quest.BETWEEN_A_ROCK, QuestDetails.Difficulty.EXPERIENCED),
	BIG_CHOMPY_BIRD_HUNTING(Quest.BIG_CHOMPY_BIRD_HUNTING, QuestDetails.Difficulty.INTERMEDIATE),
	BIOHAZARD(Quest.BIOHAZARD, QuestDetails.Difficulty.NOVICE),
	CABIN_FEVER(Quest.CABIN_FEVER, QuestDetails.Difficulty.EXPERIENCED),
	CLOCK_TOWER(Quest.CLOCK_TOWER, QuestDetails.Difficulty.NOVICE),
	COLD_WAR(Quest.COLD_WAR, QuestDetails.Difficulty.INTERMEDIATE),
	CONTACT(Quest.CONTACT, QuestDetails.Difficulty.MASTER),
	CREATURE_OF_FENKENSTRAIN(Quest.CREATURE_OF_FENKENSTRAIN, QuestDetails.Difficulty.INTERMEDIATE),
	DARKNESS_OF_HALLOWVALE(Quest.DARKNESS_OF_HALLOWVALE, QuestDetails.Difficulty.INTERMEDIATE),
	DEATH_PLATEAU(Quest.DEATH_PLATEAU, QuestDetails.Difficulty.NOVICE),
	DEATH_TO_THE_DORGESHUUN(Quest.DEATH_TO_THE_DORGESHUUN, QuestDetails.Difficulty.INTERMEDIATE),
	THE_DEPTHS_OF_DESPAIR(Quest.THE_DEPTHS_OF_DESPAIR, QuestDetails.Difficulty.NOVICE),
	DESERT_TREASURE(Quest.DESERT_TREASURE, QuestDetails.Difficulty.MASTER),
	DEVIOUS_MINDS(Quest.DEVIOUS_MINDS, QuestDetails.Difficulty.EXPERIENCED),
	THE_DIG_SITE(Quest.THE_DIG_SITE, QuestDetails.Difficulty.INTERMEDIATE),
	DRAGON_SLAYER_II(Quest.DRAGON_SLAYER_II, QuestDetails.Difficulty.GRANDMASTER),
	DREAM_MENTOR(Quest.DREAM_MENTOR, QuestDetails.Difficulty.MASTER),
	DRUIDIC_RITUAL(Quest.DRUIDIC_RITUAL, QuestDetails.Difficulty.NOVICE),
	DWARF_CANNON(Quest.DWARF_CANNON, QuestDetails.Difficulty.NOVICE),
	EADGARS_RUSE(Quest.EADGARS_RUSE, QuestDetails.Difficulty.EXPERIENCED),
	EAGLES_PEAK(Quest.EAGLES_PEAK, QuestDetails.Difficulty.NOVICE),
	ELEMENTAL_WORKSHOP_I(Quest.ELEMENTAL_WORKSHOP_I, QuestDetails.Difficulty.NOVICE),
	ELEMENTAL_WORKSHOP_II(Quest.ELEMENTAL_WORKSHOP_II, QuestDetails.Difficulty.INTERMEDIATE),
	ENAKHRAS_LAMENT(Quest.ENAKHRAS_LAMENT, QuestDetails.Difficulty.EXPERIENCED),
	ENLIGHTENED_JOURNEY(Quest.ENLIGHTENED_JOURNEY, QuestDetails.Difficulty.INTERMEDIATE),
	THE_EYES_OF_GLOUPHRIE(Quest.THE_EYES_OF_GLOUPHRIE, QuestDetails.Difficulty.INTERMEDIATE),
	FAIRYTALE_I__GROWING_PAINS(Quest.FAIRYTALE_I__GROWING_PAINS, QuestDetails.Difficulty.EXPERIENCED),
	FAIRYTALE_II__CURE_A_QUEEN(Quest.FAIRYTALE_II__CURE_A_QUEEN, QuestDetails.Difficulty.EXPERIENCED),
	FAMILY_CREST(Quest.FAMILY_CREST, QuestDetails.Difficulty.EXPERIENCED),
	THE_FEUD(Quest.THE_FEUD, QuestDetails.Difficulty.INTERMEDIATE),
	FIGHT_ARENA(Quest.FIGHT_ARENA, QuestDetails.Difficulty.EXPERIENCED),
	FISHING_CONTEST(Quest.FISHING_CONTEST, QuestDetails.Difficulty.NOVICE),
	FORGETTABLE_TALE(Quest.FORGETTABLE_TALE, QuestDetails.Difficulty.INTERMEDIATE),
	BONE_VOYAGE(Quest.BONE_VOYAGE, QuestDetails.Difficulty.INTERMEDIATE),
	THE_FREMENNIK_ISLES(Quest.THE_FREMENNIK_ISLES, QuestDetails.Difficulty.EXPERIENCED),
	THE_FREMENNIK_TRIALS(Quest.THE_FREMENNIK_TRIALS, QuestDetails.Difficulty.INTERMEDIATE),
	GARDEN_OF_TRANQUILLITY(Quest.GARDEN_OF_TRANQUILLITY, QuestDetails.Difficulty.INTERMEDIATE),
	GERTRUDES_CAT(Quest.GERTRUDES_CAT, QuestDetails.Difficulty.NOVICE),
	GHOSTS_AHOY(Quest.GHOSTS_AHOY, QuestDetails.Difficulty.INTERMEDIATE),
	THE_GIANT_DWARF(Quest.THE_GIANT_DWARF, QuestDetails.Difficulty.INTERMEDIATE),
	THE_GOLEM(Quest.THE_GOLEM, QuestDetails.Difficulty.INTERMEDIATE),
	THE_GRAND_TREE(Quest.THE_GRAND_TREE, QuestDetails.Difficulty.EXPERIENCED),
	THE_GREAT_BRAIN_ROBBERY(Quest.THE_GREAT_BRAIN_ROBBERY, QuestDetails.Difficulty.EXPERIENCED),
	GRIM_TALES(Quest.GRIM_TALES, QuestDetails.Difficulty.MASTER),
	THE_HAND_IN_THE_SAND(Quest.THE_HAND_IN_THE_SAND, QuestDetails.Difficulty.INTERMEDIATE),
	HAUNTED_MINE(Quest.HAUNTED_MINE, QuestDetails.Difficulty.EXPERIENCED),
	HAZEEL_CULT(Quest.HAZEEL_CULT, QuestDetails.Difficulty.NOVICE),
	HEROES_QUEST(Quest.HEROES_QUEST, QuestDetails.Difficulty.EXPERIENCED),
	HOLY_GRAIL(Quest.HOLY_GRAIL, QuestDetails.Difficulty.INTERMEDIATE),
	HORROR_FROM_THE_DEEP(Quest.HORROR_FROM_THE_DEEP, QuestDetails.Difficulty.EXPERIENCED),
	ICTHLARINS_LITTLE_HELPER(Quest.ICTHLARINS_LITTLE_HELPER, QuestDetails.Difficulty.INTERMEDIATE),
	IN_AID_OF_THE_MYREQUE(Quest.IN_AID_OF_THE_MYREQUE, QuestDetails.Difficulty.INTERMEDIATE),
	IN_SEARCH_OF_THE_MYREQUE(Quest.IN_SEARCH_OF_THE_MYREQUE, QuestDetails.Difficulty.INTERMEDIATE),
	JUNGLE_POTION(Quest.JUNGLE_POTION, QuestDetails.Difficulty.NOVICE),
	KINGS_RANSOM(Quest.KINGS_RANSOM, QuestDetails.Difficulty.EXPERIENCED),
	LAND_OF_THE_GOBLINS(Quest.LAND_OF_THE_GOBLINS, QuestDetails.Difficulty.EXPERIENCED),
	LEGENDS_QUEST(Quest.LEGENDS_QUEST, QuestDetails.Difficulty.MASTER),
	LOST_CITY(Quest.LOST_CITY, QuestDetails.Difficulty.EXPERIENCED),
	THE_LOST_TRIBE(Quest.THE_LOST_TRIBE, QuestDetails.Difficulty.INTERMEDIATE),
	LUNAR_DIPLOMACY(Quest.LUNAR_DIPLOMACY, QuestDetails.Difficulty.EXPERIENCED),
	MAKING_FRIENDS_WITH_MY_ARM(Quest.MAKING_FRIENDS_WITH_MY_ARM, QuestDetails.Difficulty.MASTER),
	MAKING_HISTORY(Quest.MAKING_HISTORY, QuestDetails.Difficulty.INTERMEDIATE),
	MERLINS_CRYSTAL(Quest.MERLINS_CRYSTAL, QuestDetails.Difficulty.INTERMEDIATE),
	MONKEY_MADNESS_I(Quest.MONKEY_MADNESS_I, QuestDetails.Difficulty.MASTER),
	MONKEY_MADNESS_II(Quest.MONKEY_MADNESS_II, QuestDetails.Difficulty.GRANDMASTER),
	MONKS_FRIEND(Quest.MONKS_FRIEND, QuestDetails.Difficulty.NOVICE),
	MOUNTAIN_DAUGHTER(Quest.MOUNTAIN_DAUGHTER, QuestDetails.Difficulty.INTERMEDIATE),
	MOURNINGS_END_PART_I(Quest.MOURNINGS_END_PART_I, QuestDetails.Difficulty.MASTER),
	MOURNINGS_END_PART_II(Quest.MOURNINGS_END_PART_II, QuestDetails.Difficulty.MASTER),
	MURDER_MYSTERY(Quest.MURDER_MYSTERY, QuestDetails.Difficulty.NOVICE),
	MY_ARMS_BIG_ADVENTURE(Quest.MY_ARMS_BIG_ADVENTURE, QuestDetails.Difficulty.INTERMEDIATE),
	NATURE_SPIRIT(Quest.NATURE_SPIRIT, QuestDetails.Difficulty.NOVICE),
	OBSERVATORY_QUEST(Quest.OBSERVATORY_QUEST, QuestDetails.Difficulty.NOVICE),
	OLAFS_QUEST(Quest.OLAFS_QUEST, QuestDetails.Difficulty.INTERMEDIATE),
	ONE_SMALL_FAVOUR(Quest.ONE_SMALL_FAVOUR, QuestDetails.Difficulty.EXPERIENCED),
	PLAGUE_CITY(Quest.PLAGUE_CITY, QuestDetails.Difficulty.NOVICE),
	PRIEST_IN_PERIL(Quest.PRIEST_IN_PERIL, QuestDetails.Difficulty.NOVICE),
	THE_QUEEN_OF_THIEVES(Quest.THE_QUEEN_OF_THIEVES, QuestDetails.Difficulty.NOVICE),
	RAG_AND_BONE_MAN_I(Quest.RAG_AND_BONE_MAN_I, QuestDetails.Difficulty.NOVICE),
	RAG_AND_BONE_MAN_II(Quest.RAG_AND_BONE_MAN_II, QuestDetails.Difficulty.INTERMEDIATE),
	RATCATCHERS(Quest.RATCATCHERS, QuestDetails.Difficulty.INTERMEDIATE),
	RECIPE_FOR_DISASTER(Quest.RECIPE_FOR_DISASTER, QuestDetails.Difficulty.GRANDMASTER),
	RECIPE_FOR_DISASTER_START(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER, 3, QuestDetails.Difficulty.NOVICE),
	RECIPE_FOR_DISASTER_DWARF(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF, 60, QuestDetails.Difficulty.NOVICE),
	RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE, 40, QuestDetails.Difficulty.NOVICE),
	RECIPE_FOR_DISASTER_PIRATE_PETE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_PIRATE_PETE, 110, QuestDetails.Difficulty.INTERMEDIATE),
	RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE, 5, QuestDetails.Difficulty.INTERMEDIATE),
	RECIPE_FOR_DISASTER_EVIL_DAVE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_EVIL_DAVE, 5, QuestDetails.Difficulty.INTERMEDIATE),
	RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR, 50, QuestDetails.Difficulty.MASTER),
	RECIPE_FOR_DISASTER_SIR_AMIK_VARZE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_SIR_AMIK_VARZE, 20, QuestDetails.Difficulty.MASTER),
	RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE(QuestDetails.QuestVarbits.QUEST_RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE, 170, QuestDetails.Difficulty.INTERMEDIATE),
	RECRUITMENT_DRIVE(Quest.RECRUITMENT_DRIVE, QuestDetails.Difficulty.NOVICE),
	REGICIDE(Quest.REGICIDE, QuestDetails.Difficulty.MASTER),
	ROVING_ELVES(Quest.ROVING_ELVES, QuestDetails.Difficulty.MASTER),
	ROYAL_TROUBLE(Quest.ROYAL_TROUBLE, QuestDetails.Difficulty.EXPERIENCED),
	RUM_DEAL(Quest.RUM_DEAL, QuestDetails.Difficulty.EXPERIENCED),
	SCORPION_CATCHER(Quest.SCORPION_CATCHER, QuestDetails.Difficulty.INTERMEDIATE),
	SEA_SLUG(Quest.SEA_SLUG, QuestDetails.Difficulty.INTERMEDIATE),
	SHADES_OF_MORTTON(Quest.SHADES_OF_MORTTON, QuestDetails.Difficulty.INTERMEDIATE),
	SHADOW_OF_THE_STORM(Quest.SHADOW_OF_THE_STORM, QuestDetails.Difficulty.INTERMEDIATE),
	SHEEP_HERDER(Quest.SHEEP_HERDER, QuestDetails.Difficulty.NOVICE),
	SHILO_VILLAGE(Quest.SHILO_VILLAGE, QuestDetails.Difficulty.EXPERIENCED),
	SLEEPING_GIANTS(169, "Sleeping Giants", QuestDetails.Difficulty.NOVICE),
	THE_SLUG_MENACE(Quest.THE_SLUG_MENACE, QuestDetails.Difficulty.INTERMEDIATE),
	A_SOULS_BANE(Quest.A_SOULS_BANE, QuestDetails.Difficulty.NOVICE),
	SPIRITS_OF_THE_ELID(Quest.SPIRITS_OF_THE_ELID, QuestDetails.Difficulty.INTERMEDIATE),
	SWAN_SONG(Quest.SWAN_SONG, QuestDetails.Difficulty.MASTER),
	TAI_BWO_WANNAI_TRIO(Quest.TAI_BWO_WANNAI_TRIO, QuestDetails.Difficulty.INTERMEDIATE),
	A_TAIL_OF_TWO_CATS(Quest.A_TAIL_OF_TWO_CATS, QuestDetails.Difficulty.INTERMEDIATE),
	TALE_OF_THE_RIGHTEOUS(Quest.TALE_OF_THE_RIGHTEOUS, QuestDetails.Difficulty.NOVICE),
	A_TASTE_OF_HOPE(Quest.A_TASTE_OF_HOPE, QuestDetails.Difficulty.EXPERIENCED),
	TEARS_OF_GUTHIX(Quest.TEARS_OF_GUTHIX, QuestDetails.Difficulty.INTERMEDIATE),
	TEMPLE_OF_IKOV(Quest.TEMPLE_OF_IKOV, QuestDetails.Difficulty.EXPERIENCED),
	TEMPLE_OF_THE_EYE(Quest.TEMPLE_OF_THE_EYE, QuestDetails.Difficulty.INTERMEDIATE),
	THRONE_OF_MISCELLANIA(Quest.THRONE_OF_MISCELLANIA, QuestDetails.Difficulty.EXPERIENCED),
	THE_TOURIST_TRAP(Quest.THE_TOURIST_TRAP, QuestDetails.Difficulty.INTERMEDIATE),
	TOWER_OF_LIFE(Quest.TOWER_OF_LIFE, QuestDetails.Difficulty.NOVICE),
	TREE_GNOME_VILLAGE(Quest.TREE_GNOME_VILLAGE, QuestDetails.Difficulty.INTERMEDIATE),
	TRIBAL_TOTEM(Quest.TRIBAL_TOTEM, QuestDetails.Difficulty.INTERMEDIATE),
	TROLL_ROMANCE(Quest.TROLL_ROMANCE, QuestDetails.Difficulty.EXPERIENCED),
	TROLL_STRONGHOLD(Quest.TROLL_STRONGHOLD, QuestDetails.Difficulty.EXPERIENCED),
	UNDERGROUND_PASS(Quest.UNDERGROUND_PASS, QuestDetails.Difficulty.EXPERIENCED),
	CLIENT_OF_KOUREND(Quest.CLIENT_OF_KOUREND, QuestDetails.Difficulty.NOVICE),
	WANTED(Quest.WANTED, QuestDetails.Difficulty.INTERMEDIATE),
	WATCHTOWER(Quest.WATCHTOWER, QuestDetails.Difficulty.INTERMEDIATE),
	WATERFALL_QUEST(Quest.WATERFALL_QUEST, QuestDetails.Difficulty.INTERMEDIATE),
	WHAT_LIES_BELOW(Quest.WHAT_LIES_BELOW, QuestDetails.Difficulty.INTERMEDIATE),
	WITCHS_HOUSE(Quest.WITCHS_HOUSE, QuestDetails.Difficulty.INTERMEDIATE),
	ZOGRE_FLESH_EATERS(Quest.ZOGRE_FLESH_EATERS, QuestDetails.Difficulty.INTERMEDIATE),
	THE_ASCENT_OF_ARCEUUS(Quest.THE_ASCENT_OF_ARCEUUS, QuestDetails.Difficulty.NOVICE),
	THE_FORSAKEN_TOWER(Quest.THE_FORSAKEN_TOWER, QuestDetails.Difficulty.NOVICE),
	SONG_OF_THE_ELVES(Quest.SONG_OF_THE_ELVES, QuestDetails.Difficulty.GRANDMASTER),
	THE_FREMENNIK_EXILES(Quest.THE_FREMENNIK_EXILES, QuestDetails.Difficulty.MASTER),
	SINS_OF_THE_FATHER(Quest.SINS_OF_THE_FATHER, QuestDetails.Difficulty.MASTER),
	GETTING_AHEAD(Quest.GETTING_AHEAD, QuestDetails.Difficulty.INTERMEDIATE),
	A_PORCINE_OF_INTEREST(Quest.A_PORCINE_OF_INTEREST, QuestDetails.Difficulty.NOVICE),
	A_KINGDOM_DIVIDED(Quest.A_KINGDOM_DIVIDED, QuestDetails.Difficulty.EXPERIENCED),
	A_NIGHT_AT_THE_THEATRE(Quest.A_NIGHT_AT_THE_THEATRE, QuestDetails.Difficulty.MASTER),


	//Miniquests
	ENTER_THE_ABYSS(Quest.ENTER_THE_ABYSS, QuestDetails.Difficulty.MINIQUEST),
	ARCHITECTURAL_ALLIANCE(Quest.ARCHITECTURAL_ALLIANCE, QuestDetails.Difficulty.MINIQUEST),
	BEAR_YOUR_SOUL(Quest.BEAR_YOUR_SOUL, QuestDetails.Difficulty.MINIQUEST),
	ALFRED_GRIMHANDS_BARCRAWL(Quest.ALFRED_GRIMHANDS_BARCRAWL, QuestDetails.Difficulty.MINIQUEST),
	CURSE_OF_THE_EMPTY_LORD(Quest.CURSE_OF_THE_EMPTY_LORD, QuestDetails.Difficulty.MINIQUEST),
	ENCHANTED_KEY(Quest.THE_ENCHANTED_KEY, QuestDetails.Difficulty.MINIQUEST),
	THE_GENERALS_SHADOW(Quest.THE_GENERALS_SHADOW, QuestDetails.Difficulty.MINIQUEST),
	SKIPPY_AND_THE_MOGRES(Quest.SKIPPY_AND_THE_MOGRES, QuestDetails.Difficulty.MINIQUEST),
	THE_MAGE_ARENA(Quest.MAGE_ARENA_I, QuestDetails.Difficulty.MINIQUEST),
	LAIR_OF_TARN_RAZORLOR(Quest.LAIR_OF_TARN_RAZORLOR, QuestDetails.Difficulty.MINIQUEST),
	FAMILY_PEST(Quest.FAMILY_PEST, QuestDetails.Difficulty.MINIQUEST),
	THE_MAGE_ARENA_II(Quest.MAGE_ARENA_II, QuestDetails.Difficulty.MINIQUEST),
	IN_SEARCH_OF_KNOWLEDGE(Quest.IN_SEARCH_OF_KNOWLEDGE, QuestDetails.Difficulty.MINIQUEST),
	DADDYS_HOME(Quest.DADDYS_HOME, QuestDetails.Difficulty.MINIQUEST),
	HOPESPEARS_WILL(Quest.HOPESPEARS_WILL, QuestDetails.Difficulty.MINIQUEST),
;

	@Getter
	public final int id;

	@Getter
	private final QuestDetails.Difficulty difficulty;

	@Getter
	private QuestDetails.QuestVarbits varbits;

	@Getter
	private int completionState;

	QuestHelperQuest(int id, String name, QuestDetails.Difficulty difficulty)
	{
		this.id = id;
		this.difficulty = difficulty;
	}

	QuestHelperQuest(Quest quest, QuestDetails.Difficulty difficulty)
	{
		this.id = quest.getId();
		this.difficulty = difficulty;
	}

	QuestHelperQuest(QuestDetails.QuestVarbits varbits, int completionState, QuestDetails.Difficulty difficulty) {
		this.id = -1;
		this.varbits = varbits;
		this.completionState = completionState;
		this.difficulty = difficulty;
	}

	public boolean isComplete(Client client) {
		if (id == -1) {
			return client.getVarbitValue(varbits.getId()) >= completionState;
		}
		client.runScript(ScriptID.QUEST_STATUS_GET, id);
		return client.getIntStack()[0] == 2;
	}
}
