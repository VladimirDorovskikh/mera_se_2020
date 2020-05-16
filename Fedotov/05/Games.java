package com.mera.training.task05;

public enum Games {
    WINTER_GAME("Снежки"),
    SPRING_GAME("Запуск корабликов по ручьям"),
    SUMMER_GAME("Собирание и поедание ягод"),
    AUTUMN_GAME("Измерение глубины луж методом \"сапога\"");

    private String name;

    Games(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
