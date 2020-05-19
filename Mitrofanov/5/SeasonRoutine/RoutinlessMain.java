package SeasonRoutine;

import java.util.Random;

public class RoutinlessMain {
    public static void main(String[] args) {
        String[] names = {"Сергей", "Даниил", "Алексей", "Антон", "Андрей", "Ксения", "Дарья", "Алиса"};
        Person[] crowd = new Person[10];

        for (int i = 0; i < crowd.length; i++) {
            Random r = new Random();
            crowd[i] = new Person(names[r.nextInt(names.length)], Season.values()[r.nextInt(Season.values().length)]);
            System.out.println("Person #" + (i + 1) + " is " + crowd[i].toString() + " it's favorite season is "
                    + crowd[i].getFavoriteSeason() + " which means it likes to "
                    + crowd[i].favoriteSeason.getFavoriteGame().getDescription());
        }
    }
}
