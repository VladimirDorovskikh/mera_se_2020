package com.pradedov.task2;


import java.util.Random;

public class Person {
    private final Name name;
    private final Season favoriteSeason;

    public Person () {
        Random random = new Random();

        int nameIdx = random.nextInt(Name.values().length);
        this.name = Name.values()[nameIdx];

        int seasonIdx = random.nextInt(Season.values().length);
        this.favoriteSeason = Season.values()[seasonIdx];
    }

    @Override
    public String toString() {
        return "I'm " + name.getName() + ". I love " + favoriteSeason.getGame().getGameName()
                + " in " + favoriteSeason.getSeasonName();
    }
}
