package com.mera.lection4;
import java.util.Random;

public class Fruit {
    int weight;

    public Fruit() {
        Random filler = new Random();
        weight = filler.nextInt(14) + 1;
    }

    @Override
    public String toString() {
        return String.format("This is the %s with weight %d", getClass().getSimpleName(), weight);
    }
}



