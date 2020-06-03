package com.mera.kalinina.lesson8.annotation;


@JsonEnclosing(jsonEnclosingName = "persons")
public class Person {

    @JsonName("name")
    public String firstName;

    @JsonName("years")
    public double age;

    @JsonIgnore
    public String password;

    public Person(String firstName, double age, String password) {
        this.firstName = firstName;
        this.age = age;
        this.password = password;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
