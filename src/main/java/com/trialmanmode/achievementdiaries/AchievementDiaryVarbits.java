package com.trialmanmode.achievementdiaries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AchievementDiaryVarbits
{
	// Ardougne
	ACHIEVEMENT_DIARY_ARDOUGNE_EASY(4499),
	ACHIEVEMENT_DIARY_ARDOUGNE_MEDIUM(4500),
	ACHIEVEMENT_DIARY_ARDOUGNE_HARD(4501),
	ACHIEVEMENT_DIARY_ARDOUGNE_ELITE(4502),

	// Desert
	ACHIEVEMENT_DIARY_DESERT_EASY(4523),
	ACHIEVEMENT_DIARY_DESERT_MEDIUM(4524),
	ACHIEVEMENT_DIARY_DESERT_HARD(4525),
	ACHIEVEMENT_DIARY_DESERT_ELITE(4526),

	// Falador
	ACHIEVEMENT_DIARY_FALADOR_EASY(4503),
	ACHIEVEMENT_DIARY_FALADOR_MEDIUM(4504),
	ACHIEVEMENT_DIARY_FALADOR_HARD(4505),
	ACHIEVEMENT_DIARY_FALADOR_ELITE(4506),

	// Fremennik
	ACHIEVEMENT_DIARY_FREMENNIK_EASY(4531),
	ACHIEVEMENT_DIARY_FREMENNIK_MEDIUM(4532),
	ACHIEVEMENT_DIARY_FREMENNIK_HARD(4533),
	ACHIEVEMENT_DIARY_FREMENNIK_ELITE(4534),

	// Kandarin
	ACHIEVEMENT_DIARY_KANDARIN_EASY(4515),
	ACHIEVEMENT_DIARY_KANDARIN_MEDIUM(4516),
	ACHIEVEMENT_DIARY_KANDARIN_HARD(4517),
	ACHIEVEMENT_DIARY_KANDARIN_ELITE(4518),

	// Karamja
	ACHIEVEMENT_DIARY_KARAMJA_EASY(3577),
	ACHIEVEMENT_DIARY_KARAMJA_MEDIUM(3598),
	ACHIEVEMENT_DIARY_KARAMJA_HARD(3610),
	ACHIEVEMENT_DIARY_KARAMJA_ELITE(4567),

	// Kourend & Kebos
	ACHIEVEMENT_DIARY_KOUREND_EASY(7929),
	ACHIEVEMENT_DIARY_KOUREND_MEDIUM(7930),
	ACHIEVEMENT_DIARY_KOUREND_HARD(7931),
	ACHIEVEMENT_DIARY_KOUREND_ELITE(7932),

	// Lumbridge & Draynor
	ACHIEVEMENT_DIARY_LUMBRIDGE_EASY(4535),
	ACHIEVEMENT_DIARY_LUMBRIDGE_MEDIUM(4536),
	ACHIEVEMENT_DIARY_LUMBRIDGE_HARD(4537),
	ACHIEVEMENT_DIARY_LUMBRIDGE_ELITE(4538),

	// Morytania
	ACHIEVEMENT_DIARY_MORYTANIA_EASY(4527),
	ACHIEVEMENT_DIARY_MORYTANIA_MEDIUM(4528),
	ACHIEVEMENT_DIARY_MORYTANIA_HARD(4529),
	ACHIEVEMENT_DIARY_MORYTANIA_ELITE(4530),

	// Varrock
	ACHIEVEMENT_DIARY_VARROCK_EASY(4519),
	ACHIEVEMENT_DIARY_VARROCK_MEDIUM(4520),
	ACHIEVEMENT_DIARY_VARROCK_HARD(4521),
	ACHIEVEMENT_DIARY_VARROCK_ELITE(4522),

	// Western Provinces
	ACHIEVEMENT_DIARY_WESTERN_EASY(4511),
	ACHIEVEMENT_DIARY_WESTERN_MEDIUM(4512),
	ACHIEVEMENT_DIARY_WESTERN_HARD(4513),
	ACHIEVEMENT_DIARY_WESTERN_ELITE(4514),

	// Wilderness
	ACHIEVEMENT_DIARY_WILDERNESS_EASY(4507),
	ACHIEVEMENT_DIARY_WILDERNESS_MEDIUM(4508),
	ACHIEVEMENT_DIARY_WILDERNESS_HARD(4509),
	ACHIEVEMENT_DIARY_WILDERNESS_ELITE(4510);
	private final int id;
}