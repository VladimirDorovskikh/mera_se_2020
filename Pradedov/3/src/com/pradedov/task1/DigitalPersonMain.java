package com.pradedov.task1;
/*
Задание 1. Цифровая персонализация
- Создать класс Person с двумя полями типа String: firstName, lastName
- создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
- Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
- Создать метод toString() который возвращает человека в формате "Фамилия, Имя"

 в методе main
- Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
- Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
- Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
- Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"
 */

import java.util.Random;

public class DigitalPersonMain {
    private static final int NUM_OF_NAMES = FirstName.values().length;
    private static final int NUM_OF_SURNAMES = LastName.values().length;
    private static final int NUM_OF_PERSONS = 50;
    private static final String [] names = new String[NUM_OF_NAMES];
    private static final String [] surnames = new String[NUM_OF_SURNAMES];
    private static final Person [] persons = new Person[NUM_OF_PERSONS];

    public static void main (String [] args) {
        prepareFullNames();
        preparePersons();
        printAllPersons();
    }

    private static void prepareFullNames() {
        for (int idx = 0; idx < NUM_OF_NAMES; ++idx) {
            names[idx] = FirstName.values()[idx].toString();
        }
        for (int idx = 0; idx < NUM_OF_SURNAMES; ++idx) {
            surnames[idx] = LastName.values()[idx].toString();
        }
    }

    private static void preparePersons() {
        Random random = new Random();

        for (int idx = 0; idx < NUM_OF_PERSONS; ++idx) {
            String name = names[random.nextInt(NUM_OF_NAMES)];
            String surname = surnames[random.nextInt(NUM_OF_SURNAMES)];
            persons[idx] = new Person(name,surname);
        }
    }

    private static void printAllPersons() {
        for (int idx = 0; idx < NUM_OF_PERSONS; ++idx) {
            System.out.println("Person №" + (idx + 1) + " - " + persons[idx].getLastName() + ", "
                    + persons[idx].getFirstName());
        }
    }
}
