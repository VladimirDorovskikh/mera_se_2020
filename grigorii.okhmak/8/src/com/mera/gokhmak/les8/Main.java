package com.mera.gokhmak.les8;

import com.mera.gokhmak.les8.annotations.JsonName;

public class Main {
    public static void main(String[] args) {
        SimpleJson sj = new SimpleJson();
        Person p = new Person("John", 23);
        String s = sj.serialize(p, p.getClass());
        // Test 1: deserialize by object
        System.out.println(sj.deserialize(s));
        // Test 2: deserialize by type
        Person p1 = new CustomPerson("Marta", 31);
        //System.out.println(sj.serialize(p1, p1.getClass())); // {gender:"female",name:"Marta",years:31,password:null}
        System.out.println(sj.deserialize(sj.serialize(p1, p1.getClass()), Person.class));
        System.out.println(sj.deserialize1(sj.serialize(p1, p1.getClass()), CustomPerson.class, new CustomPerson()));
    }
}

class CustomPerson extends Person {
    @JsonName("gender")
    public String gender = "female";

    public CustomPerson(String firstName, int age) {
        super(firstName, age);
    }

    public CustomPerson() {
        super("", 0);
    }

    @Override
    public String toString() {
        return "CustomPerson{" +
                "gender=\"" + gender + '\"' +
                ", firstName=\"" + firstName + '\"' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }
}
