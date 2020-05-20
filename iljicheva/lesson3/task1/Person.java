package iljicheva.lesson3.task1;

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName();
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void main(String[] args) {
        String[] firstNameArray = {"Aleksandr", "Dmitrii", "Andrey", "Alexey", "Roman"};
        String[] lastNameArray = {"Ivanov", "Petrov", "Sidorov", "Sorokin", "Galkin", "Vorobyev"};
        Person[] persons = new Person[50];
        Random rnd = new Random(10);
        int i = 1;

        for (Person pers : persons){
            pers = new Person(firstNameArray[rnd.nextInt(firstNameArray.length)],
                    lastNameArray[rnd.nextInt(lastNameArray.length)]);
            System.out.println("Person №" + i++ + ": " + pers.toString());
        }

    }
}
