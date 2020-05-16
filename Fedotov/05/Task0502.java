package com.mera.training.task05;

import java.util.Random;

public class Task0502 {

    public static void main(String[] args) {
        try {
            final int PERSON_COUNT = 10;

            Person[] people = new Person[PERSON_COUNT];
            final String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10"};
            final Season[] seasons = {Season.WINTER, Season.SPRING, Season.SUMMER, Season.AUTUMN};

            for (int i = 0; i < PERSON_COUNT; ++i) {
                people[i] = new Person();
                people[i].name = names[i];
                people[i].favoriteSeason = seasons[new Random().nextInt(seasons.length)];
                System.out.println("Человек: " + people[i].name + ", любимая игра: " + people[i].favoriteSeason.gameOfSeason);
            }
        } catch (Exception e) {
            // Prints line numbers + call stack
            e.printStackTrace();

            // Prints what exception has been thrown
            System.err.println();
        }
    }
}
