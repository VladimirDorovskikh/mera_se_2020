package com.mera.lection7.reflection;

public class ReflectionMain {
    public static void main(String[] args) {

        final Class personClass = Person.class;
        try {
            final Class<?> anotherPersonClass = Class.forName("com.mera.lection7.reflection.Person");
        } catch (ClassNotFoundException e) {
            System.out.println("Нет такого класса");
        }

        PersonWithMiddleName p = new PersonWithMiddleName();


        if (p instanceof Person) {
            System.out.println("Это человек!");
        }
        final Class classFromObject = new Person().getClass();

        if (personClass == classFromObject) {
            System.out.println("Классы одинаковые!");
        }



    }
}
