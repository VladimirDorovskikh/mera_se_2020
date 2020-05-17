package com.mera.training.task05;

public enum Season {
    WINTER(Games.WINTER_GAME),
    SPRING(Games.SPRING_GAME),
    SUMMER(Games.SUMMER_GAME),
    AUTUMN(Games.AUTUMN_GAME);

    public Games gameOfSeason;

    Season(Games gameOfSeason) {
        this.gameOfSeason = gameOfSeason;
     }
}
