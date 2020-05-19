package com.pradedov.task2;

public enum Season {
    WINTER("Winter", Game.SNOW_BALLS),
    SPRING("Spring", Game.BOAT_SAILING),
    SUMMER("Summer", Game.BERRY_EATING),
    AUTUMN("Autumn", Game.PUDDLE_MEASURING);

    private final String seasonName;
    private final Game game;

    Season(String seasonName, Game game) {
        this.seasonName = seasonName;
        this.game = game;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public Game getGame() {
        return game;
    }
}
