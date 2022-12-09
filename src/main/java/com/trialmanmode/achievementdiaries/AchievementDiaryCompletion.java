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
package com.trialmanmode.achievementdiaries;

import lombok.Getter;
import net.runelite.api.*;

public enum AchievementDiaryCompletion
{
	// Ardougne
	ARDOUGNE_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_ARDOUGNE_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	ARDOUGNE_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_ARDOUGNE_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	ARDOUGNE_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_ARDOUGNE_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	ARDOUGNE_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_ARDOUGNE_ELITE,
			AchievementDiaryDetails.Difficulty.ELITE),

	// Desert
	DESERT_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_DESERT_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	DESERT_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_DESERT_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	DESERT_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_DESERT_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	DESERT_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_DESERT_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Falador
	FALADOR_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FALADOR_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	FALADOR_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FALADOR_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	FALADOR_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FALADOR_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	FALADOR_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FALADOR_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Fremennik
	FREMENNIK_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FREMENNIK_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	FREMENNIK_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FREMENNIK_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	FREMENNIK_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FREMENNIK_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	FREMENNIK_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_FREMENNIK_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Kandarin
	KANDARIN_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KANDARIN_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	KANDARIN_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KANDARIN_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	KANDARIN_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KANDARIN_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	KANDARIN_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KANDARIN_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Karamja
	KARAMJA_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KARAMJA_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	KARAMJA_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KARAMJA_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	KARAMJA_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KARAMJA_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	KARAMJA_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KARAMJA_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Kourend & Kebos
	KOUREND_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KOUREND_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	KOUREND_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KOUREND_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	KOUREND_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KOUREND_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	KOUREND_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_KOUREND_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Lumbridge & Draynor
	LUMBRIDGE_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_LUMBRIDGE_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	LUMBRIDGE_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_LUMBRIDGE_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	LUMBRIDGE_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_LUMBRIDGE_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	LUMBRIDGE_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_LUMBRIDGE_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Morytania
	MORYTANIA_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_MORYTANIA_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	MORYTANIA_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_MORYTANIA_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	MORYTANIA_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_MORYTANIA_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	MORYTANIA_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_MORYTANIA_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Varrock
	VARROCK_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_VARROCK_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	VARROCK_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_VARROCK_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	VARROCK_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_VARROCK_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	VARROCK_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_VARROCK_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Western Provinces
	WESTERN_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WESTERN_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	WESTERN_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WESTERN_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	WESTERN_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WESTERN_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	WESTERN_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WESTERN_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE),

	// Wilderness
	WILDERNESS_EASY(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WILDERNESS_EASY,
		AchievementDiaryDetails.Difficulty.EASY),
	WILDERNESS_MEDIUM(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WILDERNESS_MEDIUM,
		AchievementDiaryDetails.Difficulty.MEDIUM),
	WILDERNESS_HARD(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WILDERNESS_HARD,
		AchievementDiaryDetails.Difficulty.HARD),
	WILDERNESS_ELITE(AchievementDiaryVarbits.ACHIEVEMENT_DIARY_WILDERNESS_ELITE,
		AchievementDiaryDetails.Difficulty.ELITE);

	@Getter
	public final AchievementDiaryDetails.Difficulty difficulty;

	private final AchievementDiaryVarbits varbit;

	AchievementDiaryCompletion(AchievementDiaryVarbits varbit, AchievementDiaryDetails.Difficulty difficulty)
	{
		this.varbit = varbit;
		this.difficulty = difficulty;
	}

	public boolean isComplete(Client client)
	{
		return client.getVarbitValue(varbit.getId()) == 1;
	}
}
