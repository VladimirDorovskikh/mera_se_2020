package iljicheva.lesson4.task1;

import java.util.Random;

public class Fruit {
    @Override
    public String toString() {
        return "Weight of fruit = " + this.getWeight();
    }

    public int getWeight() {
        return weight;
    }

    public Fruit() {
        this.weight = new Random().nextInt(500);
    }

    int weight;
}
