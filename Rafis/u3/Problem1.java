/**
 * Задание 1. Цифровая персонализация
 * - Создать класс Person с двумя полями типа String: firstName, lastName
 * - создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
 * - Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
 * - Создать метод toString() который возвращает человека в формате "Фамилия, Имя"
 *
 *  в методе main
 * - Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
 * - Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
 * - Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
 * - Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"
 */

package Rafis.u3;

import java.util.ArrayList;
import java.util.Random;

public class Problem1 {
    final static String[] NAMES = {"John", "Alice", "Bob", "Craig", "Eve"};
    final static String[] LAST_NAMES = {"Doe", "White", "Brown", "Black", "Green", "Gray"};
    final static int PERSON_NUM = 50;

    static private Random rnd = new Random();

    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        for (int i = 0; i < PERSON_NUM; i++) {
            p.add(new Person(NAMES[rnd.nextInt(NAMES.length)], LAST_NAMES[rnd.nextInt(LAST_NAMES.length)]));
            System.out.println("Человек №" + i + " - " + p.get(i).toString());
        }
    }
}

class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
