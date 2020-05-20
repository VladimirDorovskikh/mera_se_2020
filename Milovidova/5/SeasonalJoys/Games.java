package com.company.SeasonalJoys;

public enum Games {
    SNOWBALLS("Снежки"),

    SHIPS("Запуск корабликов по ручьям"),

    BERRIES("Собирание и поедание ягод"),

    PUDDLES("Измерение глубины луж методом \"сапога\"");
    final String gameDescription;


    Games(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameDescription() {
        return gameDescription;
    }
}
