package com.pradedov.task1;

public class Apple extends Fruit {
    private final String color;
    private static final String type = "Apple";

    public Apple(int weight, Color color) {
        super(weight);
        this.color = color.toString();
    }

    @Override
    public String toString() {
        return type + ".  Weight: " + weight + "; Color: " + color;
    }
}