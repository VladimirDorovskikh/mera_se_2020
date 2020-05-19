package com.mera.kalinina.lesson5.suprematism;

public abstract class Figure {

    protected int centerX;
    protected int centerY;

    enum Quadrant {
        I,
        II,
        III,
        IV
    }

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Figure() {
        this(0, 0);
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public abstract double square();

    protected Quadrant getQuadrant() {
        if(centerX >= 0 && centerY >= 0) return Quadrant.I;
        else if(centerX < 0 && centerY > 0) return Quadrant.II;
        else if(centerX < 0 && centerY < 0) return Quadrant.III;
        else return Quadrant.IV; // centerX > 0 && centerY < 0
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

}
