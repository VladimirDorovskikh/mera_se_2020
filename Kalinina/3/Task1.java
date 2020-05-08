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

public class Task1 {

    public static void main(String[] args) {

        String[] firstNameArray = {"Иван", "Петр", "Сергей", "Владимир", "Александр"};
        String[] lastNameArray = {"Иванов", "Петров", "Сидоров", "Федоров", "Савельев", "Сергеев"};

        Person[] personArray = new Person[50];

        for(int i = 0; i < personArray.length; i++) {
            int randomFirstNamePos = new Random().nextInt(firstNameArray.length);
            int randomLastNamePos = new Random().nextInt(lastNameArray.length);
            String randomFirstName = firstNameArray[randomFirstNamePos];
            String randomLastName = lastNameArray[randomLastNamePos];
            personArray[i] = new Person(randomFirstName, randomLastName);
        }

        for(int i = 0; i < personArray.length; i++) {
            System.out.println("Человек №" + i + " - " + personArray[i].toString());
        }

    }
}
