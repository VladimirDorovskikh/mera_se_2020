package Seasons;

public enum Season {
    WINTER(SeasonGames.SNOWBALLS, "Зима"),
    SPRING(SeasonGames.BOATS, "Весна"),
    SUMMER(SeasonGames.BERRIES, "Лето"),
    AUTUMN(SeasonGames.BATHYMETRY, "Осень");
    final SeasonGames bestGame;
    final String description;

    Season(SeasonGames bestGame, String description) {
        this.bestGame = bestGame;
        this.description = description;
    }
}
