package com.pradedov.task1;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ", " + lastName;
    }
}


enum FirstName {
    ALEXEY("Alexey"),
    ANDREY("Andrey"),
    VALENTINA("Valentina"),
    MAXIM("Maxim"),
    MIKHAIL("Nataly");

    private final String name;

    FirstName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

enum LastName {
    NILSON("Nilson"),
    SMITH("Smith"),
    VAZQUEZ("Vazquez"),
    WESSON("Wesson"),
    BUSH("Bush"),
    JOHNSON("Johnson");

    private final String lastName;

    LastName (String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return  lastName;
    }
}
