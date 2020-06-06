package mera.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Anonim", 8));
        persons.add(new Person("anonim", 42));
        persons.add(new Person("Bnonim", 23));
        persons.add(new Person("Cnonim", 15));
        persons.add(new Person("Dnonim", 16));
        persons.add(new Person("Enonim", 4));

        Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

        System.out.println("Sorting by age:");
        Collections.sort(persons, ageComparator);
        System.out.println(persons);

        System.out.println("Sorting by name:");
        Collections.sort(persons, nameComparator);
        System.out.println(persons);

    }
}