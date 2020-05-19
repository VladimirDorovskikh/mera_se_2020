public class Person {
    private Name name;
    private Season favouriteSeason;

    public Person(Name name, Season favouriteSeason) {
        this.name = name;
        this.favouriteSeason = favouriteSeason;
    }

    public String getName() {
        return name.getValue();
    }

    public String getFavouriteGame() {
        return favouriteSeason.getSeasonGame();
    }
}
