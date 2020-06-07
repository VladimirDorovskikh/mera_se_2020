package com.katepopkova;

import java.util.*;

public class Main {
    private static final int MIN_AGE = 15;
    private static final int MAX_INT = 45;
    private static final List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        addElementsToCollection();
        personList.forEach((person) -> System.out.println(person));

        Collections.sort(personList, (Person firstPerson, Person secondPerson) -> firstPerson.getName().compareTo(secondPerson.getName()));
        personList.forEach((person) -> System.out.println(person));
        System.out.println();

        Collections.sort(personList, (Person firstPerson, Person secondName) -> firstPerson.getAge().compareTo(secondName.getAge()));
        personList.forEach((person) -> System.out.println(person));
    }

    private static void addElementsToCollection() {
        Random random = new Random();
        personList.add(new Person(Names.VLAD.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.KARL.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.ANNA.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.SOFIA.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.MIKE.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
    }
}