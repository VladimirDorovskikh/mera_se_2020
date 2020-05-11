package com.company;

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}