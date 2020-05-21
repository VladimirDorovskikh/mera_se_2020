package com.mera.lection7.reflection;

public class ReflectionMain {
    public static void main(String[] args) {

        final Class<Person> personClass = Person.class;
        try {
            final Class<?> anotherPersonClass = Class.forName("com.mera.lection7.reflection.Person");
        } catch (ClassNotFoundException e) {
            System.out.println("Нет такого класса");
        }

        PersonWithMiddleName p = new PersonWithMiddleName();


        if (p instanceof Person) {
            System.out.println("Это человек!");
        }
        final Class<? extends Person> classFromObject = p.getClass();



    }
}
