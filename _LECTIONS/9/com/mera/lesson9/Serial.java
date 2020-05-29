package com.mera.lesson9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

class Person implements Serializable {
    String name;
    String surname;
    transient LocalDateTime objectCreationTime;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        objectCreationTime =  LocalDateTime.now();
        System.out.println("Конструктор человека вызван " + objectCreationTime);
    }

    public LocalDateTime getObjectCreationTime() {
        return objectCreationTime;
    }
}


public class Serial {


    /**
     * Пишет Васю
     * @param args
     * @throws IOException
  /*   *//*
    public static void main(String[] args) throws IOException {
        Person vasya = new Person("Вася","Пупкин");

        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("vasya.obj"));
        ous.writeObject(vasya);
        ous.close();
    }

*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ous = new ObjectInputStream(new FileInputStream("vasya.obj"));
        final Object vasyaAsObject = ous.readObject();
        ous.close();

        if (vasyaAsObject instanceof Person) {
            System.out.println(((Person) vasyaAsObject).surname);
            System.out.println(((Person) vasyaAsObject).getObjectCreationTime());
        }
    }
}
