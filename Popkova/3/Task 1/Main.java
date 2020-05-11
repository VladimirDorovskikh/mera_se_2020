package com.company;

import java.util.Random;

public class Main {

    private final static int PERSON_ARRAY_SIZE = 50;

    public static void main(String[] args) {
        String[] names = {"Владимир", "Алесандр", "Илья", "Даниил", "Никита"};
        String[] surnames = {"Петров", "Сидоров", "Антипов", "Соколов", "Никитин"};
        Person[] persons = new Person[PERSON_ARRAY_SIZE];

        fillPersonArr(persons, names, surnames);
        printPersons(persons);
    }

    public static void fillPersonArr(Person[] persons, String[] names, String[] surnames) {
        Random random = new Random();
        for(int i = 0; i < persons.length; i++) {
            int nameIndex = random.nextInt(5);
            int surnameIndex = random.nextInt(5);
            persons[i] = new Person(names[nameIndex], surnames[surnameIndex]);
        }
    }

    public static void printPersons(Person[] persons) {
        for(int i = 0; i < persons.length; i++) {
            System.out.println("Человек №" + i + " - " + persons[i].toString());
        }
    }
}
