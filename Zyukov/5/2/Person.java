public class Person {
    private String name;
    private Season favouriteSeason;

    public Person(String name, Season favouriteSeason) {
        this.name = name;
        this.favouriteSeason = favouriteSeason;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteGame() {
        return favouriteSeason.getSeasonGame();
    }
}