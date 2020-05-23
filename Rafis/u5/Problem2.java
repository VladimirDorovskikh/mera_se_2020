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

package Rafis.u5;

import java.util.Random;

public class Problem2 {
    static Random random = new Random();

    static final String[] NAMES = new String[] {"Alice", "Bob", "Craig", "Chuck"};

    enum Games {Snowballs, ToyShipLaunch, Harvesting, PuddleMeasurement}

    enum Season {
        Winter(Games.Snowballs),
        Spring(Games.ToyShipLaunch),
        Summer(Games.Harvesting),
        Fall(Games.PuddleMeasurement);

        private Games seasonGame;

        public Games getSeasonGame() {
            return seasonGame;
        }

        Season(Games seasonGame) {
            this.seasonGame = seasonGame;
        }
    }

    class Person {
        private String name;
        private Season favoriteSeason;

        public Person(String name, Season favoriteSeason) {
            this.name = name;
            this.favoriteSeason = favoriteSeason;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "Name='" + name + '\'' +
                    ", favoriteSeason=" + favoriteSeason +
                    ", game=" + favoriteSeason.getSeasonGame() +
                    '}';
        }
    }

    void doTheJob() {
        final int PERSON_NUM = 10;
        Person[] persons = new Person[PERSON_NUM];

        for (int i = 0; i < PERSON_NUM; i++) {
            persons[i] = new Person(NAMES[random.nextInt(NAMES.length)], Season.values()[random.nextInt(Season.values().length)]);
            System.out.println(persons[i]);
        }
    }

    public static void main(String[] args) {
        Problem2 p = new Problem2();
        p.doTheJob();
    }
}
