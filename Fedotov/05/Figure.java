package com.mera.training.task05;

public abstract class Figure {

    // Cartesian coordinates of the figure center
    protected int x;
    protected int y;

    private enum Quadrant {
        I,
        II,
        III,
        IV
    }

    public abstract double square();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Quadrant getQuadrant(int x, int y) {
        if (x >= 0 && y >= 0) {
            return Quadrant.I;
        } else if (x < 0 && y > 0) {
            return Quadrant.II;
        } else if (x < 0 && y < 0) {
            return Quadrant.III;
        } else {
            return Quadrant.IV;
        }
    }

    protected int getFromInterval(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
