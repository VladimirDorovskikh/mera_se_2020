package SeasonRoutine;

import java.util.Random;

public enum Season {
    SPRING(Games.SinkShips),
    SUMMER(Games.EatingBerries),
    AUTUMN(Games.PuddleDrowning),
    WINTER(Games.Snowballs);

    private final Games favoriteGame;

    Season(Games favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public Games getFavoriteGame() {
        return favoriteGame;
    }
    public Season getRandomSeason(){
        int r = new Random().nextInt(Season.values().length);
        return Season.values()[r];
    }
}

enum Games {
    Snowballs ("Throwing snowballs"),
    SinkShips("Sail and sink those pesky paper ships"),
    EatingBerries("Gather wild berries and eat wild berries and get poisoned by wild berries"),
    PuddleDrowning("Swim in puddles and get wet to the bones");

    private final String description;

    Games(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
