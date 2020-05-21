package com.mera.Lesson4;

import java.util.Random;

class Apple extends Fruit{

    static String RED = "red";
    static String GREEN = "green";

    static String[] colors = {"red", "green", "yellow"};

    private String color;

    public Apple() {
        int index = new Random().nextInt(colors.length);
        color = colors[index];
    }

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple with " + super.toString() + " and color " + color;
    }
}