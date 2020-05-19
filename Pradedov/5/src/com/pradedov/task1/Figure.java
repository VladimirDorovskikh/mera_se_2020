package com.pradedov.task1;

import java.util.Random;


public abstract class Figure {
    private final Dot center;

    public Figure(Dot center) {
        this.center = center;
    }

    public Figure() {
        Random random = new Random();
        center = new Dot(random.nextDouble() * random.nextInt(),
                         random.nextDouble() * random.nextInt());
    }

    public Quadrant getQuadrant() {
        return center.getQuadrant();
    }

    @SuppressWarnings("unused")
    public abstract double square();
}

