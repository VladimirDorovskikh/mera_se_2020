package com.mera.training.task03;

import java.util.Random;

public class Person {
    private final String firstName;
    private final String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // Возвращает человека в формате "Фамилия, Имя"
    public String toString() {
        String string = getLastName() + ", " + getFirstName();
        return string;
    }

    public static void main(String[] args) {
        final String[] firstNames = new String[]{"F1", "F2", "F3", "F4", "F5"};
        final String[] lastNames = new String[]{"L1", "L2", "L3", "L4", "L5", "L6"};

        final int personCount = 50;
        Person[] persons = new Person[personCount];

        // Вывести всех людей из Person в формате "Человек №{индекс в массиве} - Фамилия, Имя"
        for (int i = 0; i < personCount; ++i) {
            persons[i] = new Person(firstNames[new Random().nextInt(firstNames.length)], lastNames[new Random().nextInt(lastNames.length)]);
            System.out.println(String.format("Человек №{%d} ", i + 1) + persons[i].toString());
        }
    }
}
