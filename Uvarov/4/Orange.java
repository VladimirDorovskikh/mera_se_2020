package mera;

import java.util.Random;

public class Orange extends Fruit {
    private static final int MAX_PEEL_THICKNESS = 20;
    private static final int MIN_PEEL_THICKNESS = 0;

    private int peelThickness;

    public Orange(int weight, int peelThickness) {
        super(weight);
        this.peelThickness = peelThickness;
    }

    public static Orange getRandomFruit() {
        Random rnd = new Random();
        int weight = rnd.nextInt(100);
        int peelThickness = rnd.nextInt(MAX_PEEL_THICKNESS);
        return new Orange(weight, peelThickness);
    }

    public int getPeelThickness() {
        return peelThickness;
    }

    public void setPeelThickness(int peelThickness) {
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return "Orange:" + " weight=" + getWeight() + " peelThickness=" + getPeelThickness();
    }
}
