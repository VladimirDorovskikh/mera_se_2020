package com.mera.gokhmak.les5.task2;

public enum Season {

    WINTER(Game.SNOWBALLS),
    SPRING(Game.BOATS),
    SUMMER(Game.BERRIES),
    AUTUMN(Game.PUDDLES_WALKING);

    Season(Game game) {
        favoriteGame = game;
    }

    private Game favoriteGame;

    public Game getFavoriteGame() {
        return favoriteGame;
    }
}
