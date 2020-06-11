package com.mera.training.dorovskikh.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * создайте класс Person  с полями
 *  имя:String,
 *  возраст:int
 *
 *  Создайте коллекцию людей
 *  Отсортируйте коллекцию сначала по имени, выведите на экран
 *   Затем - по возрасту, выведите на экран.
 *
 * Для сортировки используйте Collecitons.sort(collection, comparator)
 * компаратор задайте в виде лямбда выражения
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String ... args) {
        List<Person> friends = new ArrayList<>();

        String[] namesArray = {"Mary","Klark","Kent","Pol","Anna","Вася","Маша"};
        for (int i = 0; i < namesArray.length; ++i)
        {
            friends.add(new Person(
                    namesArray[i],
                    new Random().nextInt(60)+18));
        }
        friends.sort((a, b) -> a.age-b.age);
        System.out.println(friends);

        friends.sort((a, b) -> a.name.compareTo(b.name));
        System.out.println(friends);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
