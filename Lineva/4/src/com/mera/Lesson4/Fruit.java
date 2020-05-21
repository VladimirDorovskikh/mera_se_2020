package com.mera.Lesson4;

import java.util.Random;

class Fruit {

    protected int weight;
    private final static int WEIGHT_BOUND = 11;

    public Fruit() {
        weight = new Random().nextInt(WEIGHT_BOUND);
    }

    @Override
    public String toString() {
        return "weight " + weight;
    }

}