package com.mera.training.task04;

import java.util.Random;

public class Apple extends Fruit {
    String[] colors = {"Red", "Green", "Yellow"};
    String color = colors[new Random().nextInt(colors.length)]; // "Red", "Green", "Yellow"

    public Apple() {
        super();
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Color: " + getColor() + ", Weight: " + super.getWeight();
    }
}
