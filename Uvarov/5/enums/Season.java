package mera.enums;

import java.util.Random;

public enum Season {
    SPRING(Game.STREAM_SHIPS),
    SUMMER(Game.EATING_BERRIES),
    AUTUMN(Game.PUDDLES_MEASURING),
    WINTER(Game.SNOWBALLS);

    private final Game gameForSeason;

    Season(Game game) {
        this.gameForSeason = game;
    }

    public Game getGameForSeason() {
        return gameForSeason;
    }
}
