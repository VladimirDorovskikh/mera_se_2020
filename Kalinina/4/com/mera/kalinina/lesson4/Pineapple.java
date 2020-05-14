package com.mera.kalinina.lesson4;

import com.mera.kalinina.lesson4.Fruit;

public class Pineapple extends Fruit {

    private int tailHeight; // in centimeters

    public Pineapple(int weight, int tailHeight) {
        super(weight);
        this.tailHeight = tailHeight;
    }

    @Override
    public String toString() {
        return "[Fruit type: Pineapple; " + "Weight: " + weight + "; Tail height: " + tailHeight + "]";
    }
}
