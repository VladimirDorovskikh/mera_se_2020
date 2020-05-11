package com.company;

import java.util.Random;

public class Main {

    private final static int TOTAL_PERSONS = 50;
    private final static String name[] = {"Дмитрий", "Константин", "Сергей", "Ярослав", "Роман"};
    private final static String surname[] = {"Иванов", "Кузнецов", "Петров", "Степанов", "Захаров", "Алексеев"};
    private static Person persons[] = new Person[TOTAL_PERSONS];

    public static void main(String[] args) {
        generatePersons();
        getPersons();
    }

    private static void generatePersons() {
        Random rand = new Random();
        for(int i = 0; i < TOTAL_PERSONS; i++) {
            persons[i] = new Person(name[rand.nextInt(5)], surname[rand.nextInt(6)]);
        }
    }

    private static void getPersons() {
        for(int i = 0; i < TOTAL_PERSONS; i++) {
            System.out.println("Человек №" + i + " - " + persons[i].toString());
        }
    }
}