package iljicheva.lesson5.task2;

public enum Season {
    WINTER("Winter", Games.SNOWBALLS.toString()),
    SPRING("Spring", Games.SHIPS.toString()),
    SUMMER("Summer", Games.BERRIES.toString()),
    AUTUMN("Autumn", Games.PUDDLES.toString());

    private final String season;
    private final String gameForSeason;

    Season(String season, String game){
        this.season = season;
        this.gameForSeason = game;
    }

    public String getGameForSeason(){
        return this.gameForSeason;
    }
}
