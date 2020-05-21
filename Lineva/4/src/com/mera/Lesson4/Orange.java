package com.mera.Lesson4;

import java.util.Random;

class Orange extends Fruit {

    private int peelThickness;
    private final static int PEEL_THICKNESS_BOUND = 21;

    public Orange() {
        peelThickness = new Random().nextInt(PEEL_THICKNESS_BOUND);
    }

    public Orange(int peelThickness) {
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return "Orange with " + super.toString() + " and peel thickness " + peelThickness;
    }
}