import java.util.Random;


public class Task2 {

    public static void main(String[] args) {

        int maxName = 5;
        int numSeasons = 4;

        String[] firstNames = new String[] {
            "Роман",
            "Тимофей",
            "Владимир",
            "Афанасий",
            "Алексей"
        };

        Season[] seasons = new Season[] {
            Season.ЗИМА, Season.ВЕСНА, Season.ЛЕТО, Season.ОСЕНЬ
        };

        int numOfPersons = 10;


        Random rnd = new Random();

        Person[] persons = new Person[numOfPersons];

        for (int i = 0; i < numOfPersons; i++) {
            int name = rnd.nextInt(maxName);
            int season = rnd.nextInt(numSeasons);
            persons[i] = new Person(firstNames[name], seasons[season]);
            System.out.printf("Человек №%d - %s (%s)\n", i, persons[i], persons[i].favoriteSeason.getSeasonGame());
        }

    }
}


enum Games {

    SNOW("снежки"),
    BOATS("запуск корабликов по ручьям"),
    BERRIES("собирание и поедание ягод"),
    PLASH("измерение глубины луж методом \"сапога\"");

    private String game;


    Games(String game) {
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    @Override
    public String toString() {
        return game;
    }
}

enum Season {

    ЗИМА(Games.SNOW),
    ВЕСНА(Games.BOATS),
    ЛЕТО(Games.BERRIES),
    ОСЕНЬ(Games.PLASH);

    private Games seasonGame;


    Season(Games seasonGame) {
        this.seasonGame = seasonGame;
    }

    public String getSeasonGame() {
        return seasonGame.toString();
    }

}

class Person {

    String name; // имя
    Season favoriteSeason; // любимый сезон

    Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }


    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return (name + ", любимое время года - " + favoriteSeason);

    }

}
