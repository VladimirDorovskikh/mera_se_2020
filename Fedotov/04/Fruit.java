package com.mera.training.task04;

import java.util.Random;

public class Fruit {
    private int weight = getFromInterval(4, 16);

    protected int getWeight() {
        return this.weight;
    }

    protected int getFromInterval(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Weight: " + getWeight();
    }
}
