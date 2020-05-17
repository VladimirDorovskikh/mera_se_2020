package com.mera.gokhmak.les5.task2;

public class Person {
    private String name;
    private Season favoriteSeason;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    @Override
    public String toString() {
        return name;
    }
}
