package com.mera.lection7.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollisionDemo {


    static class Person {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) &&
                    Objects.equals(surname, person.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", surname='").append(surname).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {


        Map<Person, Integer> personToAge = new HashMap<>();
        final Person key = new Person("Vasya", "Pupkin");
        personToAge.put(key, 18);

        System.out.println(personToAge.containsKey(key));

        key.surname = "Pupkov";
        personToAge.put(key, 99);

        System.out.println(personToAge);


    }
}
