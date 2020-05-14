package com.mera.kalinina.lesson4;

import com.mera.kalinina.lesson4.Fruit;

public class Orange extends Fruit {

    private int skinThickness; // in millimeters

    public Orange(int weight, int skinThickness) {
        super(weight);
        this.skinThickness = skinThickness;
    }

    @Override
    public String toString() {
        return "[Fruit type: Orange; " + "Weight: " + weight + "; Skin thickness: " + skinThickness + "]";
    }
}
