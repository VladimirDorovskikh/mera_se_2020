package Seasons;

public class Person {
    String name;
    Season season;
    public Person(String name, Season season)
    {
        this.name = name;
        this.season = season;
    }
    public String whatAmILike()
    {
        return String.format("Меня зовут %s. %s мой любимый сезон. Я люблю %s.", name, season.description, season.bestGame.description);
    }
}
