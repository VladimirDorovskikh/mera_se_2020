package com.katepopkova;

import java.util.Random;

public class Orange extends Fruit {
    private final int SKIN_THICKNESS_BOUND = 21;

    private int skinThickness;

    public Orange() {
        skinThickness = new Random().nextInt(SKIN_THICKNESS_BOUND);
    }

    public Orange(int skinThickness) {
        this.skinThickness = skinThickness;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orange{");

        sb.append("weight=").append(weight);
        sb.append(", skinThickness=").append(skinThickness);
        sb.append(", type=").append("orange");
        sb.append('}');
        return sb.toString();
    }
}