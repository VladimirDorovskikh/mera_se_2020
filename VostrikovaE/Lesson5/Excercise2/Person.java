package VostrikovaE.Lesson5.Excercise2;

public class Person {
    private Season favoriteSeason;
    private String name;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    public String getName() {
        return name;
    }

}
