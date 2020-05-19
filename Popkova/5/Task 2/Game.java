public enum Game {
    WINTER_GAME("Снежки"),
    SPRING_GAME("Запуск корабликов по ручьям"),
    SUMMER_GAME("Собирание и поедание ягод"),
    AUTUMN_GAME("измерение глубины луж методом \"сапога\"");

    private String gameName;

    Game(String gameName) {
        this.gameName = gameName;
    }

    public String getValue() {
        return gameName;
    }
}
