public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    FALL("Осень");

    private String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonGame() {
        switch(seasonName) {
            case "Зима":
                return Game.WINTER_GAME.getValue();
            case "Весна":
                return Game.SPRING_GAME.getValue();
            case "Лето":
                return Game.SUMMER_GAME.getValue();
            default:
                return Game.FALL_GAME.getValue();
        }
    }
}