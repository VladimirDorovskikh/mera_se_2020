package com.mera.gokhmak.les5.task2;

public enum Game {
    SNOWBALLS,
    BOATS,
    BERRIES,
    PUDDLES_WALKING;

    @Override
    public String toString() {
        String result = null;
        if (name().equals(SNOWBALLS.name())) {
            result = "снежки";
        } else if (name().equals(BOATS.name())) {
            result = "запускать кораблики по ручьям";
        } else if (name().equals(BERRIES.name())) {
            result = "собирать и поедать ягоды";
        } else if (name().equals(PUDDLES_WALKING.name())) {
            result = "измерять глубину луж методом \"сапога\"";
        }
        return result;
    }
}
