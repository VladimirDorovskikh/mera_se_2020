package VostrikovaE.Lesson5.Excercise2;

public enum Season {
    SPRING (Games.SHIPPING_BOATS),
    SUMMER (Games.EATING_BERRIES),
    AUTUMN (Games.MEASURING_POOLS),
    WINTER (Games.SNOWBALLS);
    private final Games game;

    Season(Games game) {
        this.game=game;
    }


    public Games getGame() {
        return game;
    }
}
