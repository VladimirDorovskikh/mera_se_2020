package com.mera.Lesson5;

import java.lang.Math;

class Circle extends Figure {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %d and square %.3f ", radius, square()) + super.toString();
    }
}