package Seasons;

public enum SeasonGames {
    SNOWBALLS("снежки"),
    BOATS("запуск корабликов по ручьям"),
    BERRIES("собирание и поедание ягод"),
    BATHYMETRY("измерение глубины луж методом \"сапога\"");
    final  String description;


    SeasonGames(String description) {
        this.description = description;
    }
}
