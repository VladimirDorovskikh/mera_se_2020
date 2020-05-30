package com.mera.Lesson5;

import java.util.Random;

class SeasonFun {

    private final static int PERSONS_NUMBER = 10;

    private static String[] names = {"Kate", "Ann", "John", "James", "Tom", "Jack", "Emma", "Ethan", "Lily", "Oliver"};

    public static void main(String[] args) {

        Person[] persons = new Person[PERSONS_NUMBER];

        Random random = new Random();

        for (int i = 0; i < persons.length; i++) {
            int namesIndex = random.nextInt(names.length);
            int seasonIndex = random.nextInt(Season.values().length);
            persons[i] = new Person(names[namesIndex], Season.values()[seasonIndex]);
            System.out.println(persons[i].toString());
        }

    }
}