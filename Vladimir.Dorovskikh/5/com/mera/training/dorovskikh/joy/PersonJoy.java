package com.mera.training.dorovskikh.joy;

import com.mera.training.task3.Person;

import java.util.Random;

/**
 * 2. Сезонные радости
 * Создайте enum Season с 4 временами года.
 * Создайте enum Games с 4 играми.
 * В каждое время года можно играть ровно в одну игру:
 * Зима - снежки
 * Весна - запуск корабликов по ручьям
 * Лето - собирание и поедание ягод
 * Осень - измерение глубины луж методом "сапога"
 * Создайте класс Person. У него есть имя и любимый сезон.
 * Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
 * Для каждого человека выведите любимую игру.
 * Рекомендации:
 * в Season определите дополнительное поле - игра для сезона.
 */
public class PersonJoy extends Person
{
    Season favoriteSeason;

    public PersonJoy(String firstName, String lastName, int seasonId)
    {
        super(firstName, lastName);
        this.favoriteSeason = Season.values()[seasonId];
    }

    public PersonJoy(String firstName, String lastName, Season favoriteSeason)
    {
        super(firstName, lastName);
        this.favoriteSeason = favoriteSeason;
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " favorite game is " + favoriteSeason;
    }

    public static void main(String ... args)
    {
        System.out.println();
        System.out.println("PersonJoy");

        String[] firstNamesArray = {"Mary","Klark","Kent","Pol","Anna","Вася","Маша"};
        String[] lastNamesArray = {"Einstein","Asimov","Vern","Bush","Smith","Poulson"};
        PersonJoy[] personArray = new PersonJoy[10];
        for (int i = 0; i < personArray.length; ++i)
        {
            personArray[i] = new PersonJoy(
                    firstNamesArray[new Random().nextInt(firstNamesArray.length)],
                    lastNamesArray[new Random().nextInt(lastNamesArray.length)],
                    new Random().nextInt(Season.values().length));
        }
        for (PersonJoy personJoy : personArray)
        {
            System.out.println(personJoy);
        }
    }
}

enum Season
{
    Winter(Games.Snowballs),
    Spring(Games.StreamBoats),
    Summer(Games.BerriesHunting),
    Autumn(Games.PuddleBooting);

    Games seasonGame;

    Season(Games seasonGame)
    {
        this.seasonGame = seasonGame;
    }

    @Override
    public String toString()
    {
        return seasonGame
                + " during the "
                + name();
    }
}

enum Games
{
    Snowballs,
    StreamBoats,
    BerriesHunting,
    PuddleBooting;

    @Override
    public String toString()
    {
        return name();
    }
}