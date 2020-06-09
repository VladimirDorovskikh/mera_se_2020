package com.mera.gokhmak.les8;

import com.mera.gokhmak.les8.annotations.JsonIgnore;
import com.mera.gokhmak.les8.annotations.JsonName;

public class Person {

    @JsonName("name")
    public String firstName;

    @JsonName("years")
    public double age;

    @JsonIgnore
    public String password = null;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=\"" + firstName + '\"' +
                ", age=" + age +
                ", password="  + password +
                '}';
    }
}
