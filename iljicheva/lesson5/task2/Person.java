package iljicheva.lesson5.task2;


import java.util.Random;

public class Person {
    private String name;
    private Season likeSeason;

    public String getName() {
        return name;
    }

    public Season getLikeSeason() {
        return likeSeason;
    }

    Person() {
        this.name = getRandomName();
        this.likeSeason = getRandomSeason();
    }

    private String getRandomName(){
        switch (new Random().nextInt(5)){
            case 1 : return Names.ALEKSEY.toString();
            case 2 : return Names.PETYA.toString();
            case 3 : return Names.VALERA.toString();
            case 4 : return Names.VASYA.toString();
            default: return Names.VOVA.toString();
        }
    }

    private Season getRandomSeason(){
        switch (new Random().nextInt(4)){
            case 1 : return Season.AUTUMN;
            case 2 : return Season.SPRING;
            case 3 : return Season.SUMMER;
            default: return Season.WINTER;
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getName()
                + "\nLike season: " + this.getLikeSeason()
                + "\nLike game: " + this.getLikeSeason().getGameForSeason();
    }
}
