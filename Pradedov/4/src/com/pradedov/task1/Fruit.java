package com.pradedov.task1;

public class Fruit {
    protected int weight;

    public Fruit(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Fruit should not have negative weight. You provided weight = " + weight);
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "It's just an abstract fruit with weight " + weight;
    }
}

