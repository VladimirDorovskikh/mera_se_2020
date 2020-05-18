package com.mera.lection6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorsTest {

    static class Person implements Comparable<Person> {
        String name;
        String surname;
        int age;

        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", surname='").append(surname).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(surname, person.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, age);
        }

        @Override
        public int compareTo(Person o) {
            return surname.compareTo(o.surname);
        }
    }


    public static void main(String[] args) {
     /*   ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasya", "Pupkin", 18));
        persons.add(new Person("Pavlik", "Morozov", 8));
        persons.add(new Person("Petya", "Ivanov", 14));


        System.out.println(persons);


        Collections.sort(persons);
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparingInt(o -> o.age));
        System.out.println(persons);



        */


      /*  final Person person = new Person("Vasya", "Pupkin", 18);
        final Person person2 = new Person("Vasya", "Pupkin", 18);

        Set<Person> vasys = new HashSet<>();
        System.out.println(vasys.add(person));
        System.out.println(vasys.add(person2));

        System.out.println(vasys.size());*/

        final Person person = new Person("Vasya", "Pupkin", 18);
        final Person person4 = new Person("Petya", "Pupkin", 48);
        final Person person2 = new Person("Petya", "Tarasov", 19);
        final Person person3 = new Person("Grigory", "Avdeev", 5);


        TreeSet<Person> treeSet = new TreeSet<>(Arrays.asList(person,person2,person3,person4));

        System.out.println(treeSet);

       /* Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("z2211");
        hashSet.add("azz22");
        hashSet.add("Add33");
        hashSet.add("Z44");

        System.out.println(hashSet);

        for (String s : hashSet) {
            System.out.println(s);
        }


        System.out.println(hashSet.contains("z2211"));*/

    }

}
