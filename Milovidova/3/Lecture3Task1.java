package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String [] arrayFirstName = new String [] { "Platon" , "Filipp" , "Avvakum" , "Villi" , "Albert" };
        String [] arrayLastName = new String [] {"Zimin","Gusev","Fadeev", "Aleksandrov", "Dorofeev", "Rusakov"};
        Random random = new Random ();
        Person [] man= new Person[50];

        for (int i = 0; i < 50; i++)
        {
            man[i] = new Person (arrayFirstName[random.nextInt(5)],arrayLastName [random.nextInt(6)]);
            System.out.print("The man №: " + (i+1) );
            man[i].String();
        }


    }
}
class Person{

    String firstName;
    String lastName;

    Person(String x, String y)
    {
        firstName = x;
        lastName = y;
    }
        void String () {
        System.out.printf(" First name: %s \tLast name: %s\n", firstName, lastName);
    }
}