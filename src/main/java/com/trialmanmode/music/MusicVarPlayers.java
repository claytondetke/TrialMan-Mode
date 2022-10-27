package com.trialmanmode.music;

import net.runelite.api.VarPlayer;

public enum MusicVarPlayers {
    ONE(VarPlayer.MUSIC_TRACKS_UNLOCKED_1.getId()),
    TWO(VarPlayer.MUSIC_TRACKS_UNLOCKED_2.getId()),
    THREE(VarPlayer.MUSIC_TRACKS_UNLOCKED_3.getId()),
    FOUR(VarPlayer.MUSIC_TRACKS_UNLOCKED_4.getId()),
    FIVE(VarPlayer.MUSIC_TRACKS_UNLOCKED_5.getId()),
    SIX(VarPlayer.MUSIC_TRACKS_UNLOCKED_6.getId()),
    SEVEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_7.getId()),
    EIGHT(VarPlayer.MUSIC_TRACKS_UNLOCKED_8.getId()),
    NINE(VarPlayer.MUSIC_TRACKS_UNLOCKED_9.getId()),
    TEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_10.getId()),
    ELEVEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_11.getId()),
    TWELVE(VarPlayer.MUSIC_TRACKS_UNLOCKED_12.getId()),
    THIRTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_13.getId()),
    FOURTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_14.getId()),
    FIFTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_15.getId()),
    SIXTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_16.getId()),
    SEVENTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_17.getId()),
    EIGHTEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_18.getId()),
    NINETEEN(VarPlayer.MUSIC_TRACKS_UNLOCKED_19.getId()),
    TWENTY(2237),
    TWENTY_ONE(2950),
    TWENTY_TWO(3418),
    TWENTY_THREE(3575);
    private final int varPlayerId;

    MusicVarPlayers(int varPlayerId) {
        this.varPlayerId = varPlayerId;
    };

    public int getVarPlayerId() {
        return varPlayerId;
    }
}
