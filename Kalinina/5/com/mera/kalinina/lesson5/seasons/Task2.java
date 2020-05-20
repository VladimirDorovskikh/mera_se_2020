package com.mera.kalinina.lesson5.seasons;

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

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Person[] personArray = new Person[10];

        String[] NameArray = {"Мария", "Иван", "Елена", "Владимир", "Татьяна", "Михаил"};

        for(int i = 0; i < personArray.length; i++) {
            String randomName = NameArray[new Random().nextInt(NameArray.length)];
            Season randomFavoriteSeason = Season.values()[new Random().nextInt(Season.values().length)];
            personArray[i] = new Person(randomName, randomFavoriteSeason);
            System.out.println(personArray[i].getName() + " - " + personArray[i].getFavoriteSeason().getSeasonGame());
        }

    }
}
