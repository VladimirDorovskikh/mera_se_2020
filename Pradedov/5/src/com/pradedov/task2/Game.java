package com.pradedov.task2;

public enum Game {
    SNOW_BALLS("Snow Balls"),
    BOAT_SAILING("Boat Sailing"),
    BERRY_EATING("Berry Eating"),
    PUDDLE_MEASURING("Puddle Measuring of Wellingtons method");

    private final String gameName;

    Game(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }
}
