package com.mera.Lesson8;

public class Animal {
    @JsonName(key = "name")
    private String name;

    @JsonName(key = "age")
    private double age;

    @JsonName(key = "meal")
    @JsonIgnore
    private String meal;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double age, String meal) {
        this.name = name;
        this.age = age;
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", meal='" + meal + '\'' +
                '}';
    }
}