package com.mera.training.task3;

import java.util.Random;

/**
 * Задание 1. Цифровая персонализация
 * - Создать класс Person с двумя полями типа String: firstName, lastName
 * - создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
 * - Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
 * - Создать метод toString() который возвращает человека в формате "Фамилия, Имя"
 *
 * в методе main
 * - Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
 * - Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
 * - Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
 * - Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"
 */
public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString()
    {
        return lastName + ", " + firstName;
    }

    public static void main(String ... args)
    {
        System.out.println();
        System.out.println("Person");

        String[] firstNamesArray = {"Mary","Klark","Kent","Pol","Anna"};
        String[] lastNamesArray = {"Einstein","Asimov","Vern","Bush","Smith","Poulson"};

        Person[] personArray = new Person[50];
        for (int i = 0; i < personArray.length; ++i)
        {
            personArray[i] = new Person(firstNamesArray[new Random().nextInt(5)], lastNamesArray[new Random().nextInt(6)]);
            System.out.println("Человек №" + i + " - " + personArray[i].toString());
        }
    }
}
