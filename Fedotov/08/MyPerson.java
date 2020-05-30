package com.mera.training.task08;

@EnclosingJson(jsonName = "MyPersons")

public class MyPerson {
    @JsonName(fieldJsonName = "name")
    public String firstName;
    @JsonIgnore(fieldJsonIgnore = "password")
    public String password;
    @JsonName(fieldJsonName = "age")
    public double age;

    public MyPerson(String firstName, String password, double age) {
        this.firstName = firstName;
        this.password = password;
        this.age = age;
    }

    public MyPerson() {

    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
