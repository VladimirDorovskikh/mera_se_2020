package com.mera.kalinina.lesson5.seasons;

public enum Games {
    GAME_1("Снежки"),
    GAME_2("Запуск корабликов по ручьям"),
    GAME_3("Собирание и поедание ягод"),
    GAME_4("Измерение глубины луж методом \"сапога\"");

    private String gameName;

    Games(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return gameName;
    }
}

