package com.pradedov.task1;

public enum Color {
    GREEN("Green"),
    YELLOW("Yellow"),
    RED("Red");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
