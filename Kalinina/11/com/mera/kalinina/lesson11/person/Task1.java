package com.mera.kalinina.lesson11.person;

/*
Задание 1.
Создайте класс Person  с полями
имя:String,
возраст:int

Создайте коллекцию людей
Отсортируйте коллекцию сначала по имени, выведите на экран
Затем - по возрасту, выведите на экран.

Для сортировки используйте Collecitons.sort(collection, comparator)
компаратор задайте в виде лямбда выражения
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ярослав", 33));
        persons.add(new Person("Иван", 20));
        persons.add(new Person("Светлана", 25));
        persons.add(new Person("Мария", 30));
        persons.add(new Person("Иван", 30));
        persons.add(new Person("Сергей", 10));
        persons.add(new Person("Ирина", 50));
        persons.add(new Person("Елена", 5));

        System.out.println("Sorted <Person> collection by name:");
        Collections.sort(persons, Comparator.comparing(o -> o.getName()));
        for(Person person : persons) {
            System.out.println("\t" + person);
        }

        System.out.println("\n\nSorted <Person> collection by age:");
        Collections.sort(persons, Comparator.comparingInt(o -> o.getAge()));
        for(Person person : persons) {
            System.out.println("\t" + person);
        }

    }
}
