package com.mera.kalinina.lesson5.seasons;

public class Person {

    private String name;
    private Season favoriteSeason;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public String getName() {
        return name;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }
}
