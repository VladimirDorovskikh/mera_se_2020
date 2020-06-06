package com.mera.training.task11;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
