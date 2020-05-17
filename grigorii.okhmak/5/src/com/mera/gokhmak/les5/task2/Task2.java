package com.mera.gokhmak.les5.task2;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {
          "Валера",
          "Дмитрий",
          "Полина",
          "Лена",
          "Владислав",
          "Олег",
          "Ольга",
          "Матвей",
          "Александр",
          "Александра",
          "Глеб"
        };
        Season[] seasons = {Season.AUTUMN, Season.SPRING,
                            Season.SUMMER, Season.WINTER};
        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(names[Randomizer.getRandomInRange(0, names.length - 1)],
                                    seasons[Randomizer.getRandomInRange(0, seasons.length - 1)]);
        }
        // Output:
        for (Person person : persons) {
            System.out.printf("%s любит %s.\n", person, person.getFavoriteSeason().getFavoriteGame());
        }
    }
}
