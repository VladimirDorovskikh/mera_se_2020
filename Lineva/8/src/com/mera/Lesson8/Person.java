package com.mera.Lesson8;

public class Person {

    @JsonName(key = "FirstName")
    private String firstName;

    @JsonName(key = "LastName")
    private String lastName;

    @JsonName(key = "MiddleName")
    private String middleName;

    @JsonName(key = "Age")
    private double age;

    @JsonName(key = "Password")
    @JsonIgnore
    private String password;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String middleName, int age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}