package com.mera.kalinina.lesson4;

public class Apple extends Fruit {

    private String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "[Fruit type: Apple; " + "Weight: " + weight + "; Color: " + color + "]";
    }
}
