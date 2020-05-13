package com.katepopkova;

import java.util.Random;

public class Apple extends Fruit {
    private String[] possibleColors = {"red", "green", "yellow"};
    private final int COLOR_INDEX = new Random().nextInt(possibleColors.length);

    private String color;

    public Apple() {
        color = possibleColors[COLOR_INDEX];
    }

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Apple{");

        sb.append("weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append(", type=").append("apple");
        sb.append('}');
        return sb.toString();
    }
}