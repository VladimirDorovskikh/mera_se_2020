package com.pradedov.task2;

/*
2. Сезонные радости
Создайте enum Season с 4 временами года.
Создайте enum Games с 4 играми.
В каждое время года можно играть ровно в одну игру:
Зима - снежки
Весна - запуск корабликов по ручьям
Лето - собирание и поедание ягод
Осень - измерение глубины луж методом "сапога"
Создайте класс Person. У него есть имя и любимый сезон.
Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
Для каждого человека выведите любимую игру.
Рекомендации:
в Season определите дополнительное поле - игра для сезона.
 */

public class SeasonsMain {
    private static final int NUMBER_OF_PERSONS = 10;

    public static void main(String [] args) {
        Person [] persons = new Person[NUMBER_OF_PERSONS];

        for (int i = 0; i < NUMBER_OF_PERSONS; ++i) {
            persons[i] = new Person();
            System.out.println(persons[i].toString());
        }
    }
}
