package com.mera.kalinina.lesson5.seasons;

public enum Season {

    WINTER(Games.GAME_1),
    SPRING(Games.GAME_2),
    SUMMER(Games.GAME_3),
    AUTUMN(Games.GAME_4);

    private Games seasonGame;

    Season(Games seasonGame) {
        this.seasonGame = seasonGame;
    }

    public String getSeasonGame() {
        return seasonGame.toString();
    }
}
