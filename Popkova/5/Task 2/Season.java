public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String seasonName;
    private Game seasonGame;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonGame() {
        switch(seasonName) {
            case "Зима" :
                seasonGame = Game.WINTER_GAME;
                break;
            case "Весна" :
                seasonGame = Game.SPRING_GAME;
                break;
            case "Лето" :
                seasonGame = Game.SUMMER_GAME;
                break;
            case "Осень" :
                seasonGame = Game.AUTUMN_GAME;
        }
        return seasonGame.getValue();
    }
}
