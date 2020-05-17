package com.pradedov.task1;

public class Dot {
    private final double x;
    private final double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Quadrant getQuadrant() {
        Quadrant quadrant;

        if (x > 0 && y > 0) {
            quadrant = Quadrant.I;
        }
        else if (x < 0 && y > 0) {
            quadrant = Quadrant.II;
        }
        else if (x < 0 && y < 0) {
            quadrant = Quadrant.III;
        }
        else if (x > 0 && y < 0) {
            quadrant = Quadrant.IV;
        }
        else {
            throw new IllegalArgumentException("Requirements do not describe behavior for this use case :(");
        }

        return quadrant;
    }
}