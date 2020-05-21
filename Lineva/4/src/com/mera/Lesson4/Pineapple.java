package com.mera.Lesson4;

import java.util.Random;

class Pineapple extends Fruit {

    private int tailHeight;
    private final static int TAIL_HEIGHT_BOUND = 16;

    public Pineapple() {
        tailHeight = new Random().nextInt(TAIL_HEIGHT_BOUND) + 5;
    }

    public Pineapple(int tailHeight) {
        this.tailHeight = tailHeight;
    }

    @Override
    public String toString() {
        return "Pineapple with " + super.toString() + " and tail height " + tailHeight;
    }
}