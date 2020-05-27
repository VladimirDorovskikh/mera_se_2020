package com.mera.Lesson5;

enum Season {
    WINTER(Games.SNOWBALLS),
    SPRING(Games.BOATS),
    SUMMER(Games.BERRIES),
    AUTUMN(Games.PUDLLES);

    Games game;

    Season(Games game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return String.format("season %s with game %s", name(), game);
    }
}

enum Games {SNOWBALLS, BOATS, BERRIES, PUDLLES}