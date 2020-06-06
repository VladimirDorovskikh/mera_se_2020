package com.mera.training.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1101 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Name17", 5));
        persons.add(new Person("Name02", 26));
        persons.add(new Person("Name36", 3));
        persons.add(new Person("Name14", 27));
        persons.add(new Person("Name05", 13));

        Comparator<Person> compareByName = (Person o1, Person o2) -> o1.getName().compareTo( o2.getName() );
        Collections.sort(persons, compareByName);
        for (Person person: persons) {
            System.out.println("Name" + person.getName() + ", age " + person.getAge());
        }
        Collections.sort(persons, compareByName.reversed());
        for (Person person: persons) {
            System.out.println("Reversed order. Name" + person.getName() + ", age " + person.getAge());
        }

        Comparator<Person> compareByAge = (Person o1, Person o2) -> o1.getAge() - ( o2.getAge() );
        Collections.sort(persons, compareByAge);
        for (Person person: persons) {
            System.out.println("Name" + person.getName() + ", age " + person.getAge());
        }
        Collections.sort(persons, compareByAge.reversed());
        for (Person person: persons) {
            System.out.println("Reversed order. Name" + person.getName() + ", age " + person.getAge());
        }
    }
}
