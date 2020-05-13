package com.katepopkova;

import java.util.Random;

public class Pineapple extends Fruit {
    private final int MIN_TRAIL_HEIGHT = 5;
    private final int MAX_TRAIL_HEIGHT = 20;

    private int trailHeight;

    public Pineapple() {
        trailHeight = new Random().nextInt(
                MAX_TRAIL_HEIGHT - MIN_TRAIL_HEIGHT + 1) + MIN_TRAIL_HEIGHT;
    }

    public Pineapple(int trailHeight) {
        this.trailHeight = MAX_TRAIL_HEIGHT - trailHeight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pineapple{");

        sb.append("weight=").append(weight);
        sb.append(", trailHeight=").append(trailHeight);
        sb.append(", type=").append("pineapple");
        sb.append('}');
        return sb.toString();
    }
}