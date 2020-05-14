package com.mera.training.task04;

public class Pineapple extends Fruit {
    private final int tailHeight = super.getFromInterval(5, 20); // From 5 to 20

    public Pineapple() {
        super();
    }

    public int getTailHeight() {
        return this.tailHeight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Tail Height: " + getTailHeight() + ", Weight: " + super.getWeight();
    }
}
