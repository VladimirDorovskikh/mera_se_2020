package com.mera.Lesson5;

class Person {

    private String name;

    private Season favoriteSeason;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    @Override
    public String toString() {
        return name + ", " + favoriteSeason.toString();
    }
}