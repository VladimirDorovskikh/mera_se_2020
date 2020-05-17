package mera.enums;

import java.util.Random;

public class MainEnums {
    public static void main(String[] args) {
        int numberOfPeople = 10;

        String[] names = {"Аркадий", "Борис", "Валерий", "Георгий", "Джонни", "Евграф"};

        Person[] people = getRandomPersonArray(numberOfPeople, names);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static Person[] getRandomPersonArray(int len, String[] names) {
        Person[] people = new Person[len];
        Random rnd = new Random();
        Season[] season = Season.values();

        for (int i = 0; i < people.length; i++) {
            int nameIndex = rnd.nextInt(names.length);
            int seasonIndex = rnd.nextInt(season.length);
            people[i] = new Person(names[nameIndex], season[seasonIndex]);
        }

        return people;
    }
}
