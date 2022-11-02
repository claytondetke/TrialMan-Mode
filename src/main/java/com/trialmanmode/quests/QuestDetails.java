/*
 *  * Copyright (c) 2021, Senmori
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

package com.trialmanmode.quests;

import lombok.AllArgsConstructor;
import lombok.Getter;

public interface QuestDetails
{
	/**
	 * Describes the difficulty of a {@link QuestHelperQuest}
	 */
	public enum Difficulty
	{
		NOVICE,
		INTERMEDIATE,
		EXPERIENCED,
		MASTER,
		GRANDMASTER,
		MINIQUEST,
		;
	}

	@AllArgsConstructor
	@Getter
	public enum QuestVarbits {
		QUEST_RECIPE_FOR_DISASTER(1850),
		QUEST_RECIPE_FOR_DISASTER_DWARF(1892),
		QUEST_RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE(1867),
		QUEST_RECIPE_FOR_DISASTER_PIRATE_PETE(1895),
		QUEST_RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE(1896),
		QUEST_RECIPE_FOR_DISASTER_EVIL_DAVE(1878),
		QUEST_RECIPE_FOR_DISASTER_SIR_AMIK_VARZE(1910),
		QUEST_RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE(1904),
		QUEST_RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR(1914),
		;
		private final int id;
	}
}
