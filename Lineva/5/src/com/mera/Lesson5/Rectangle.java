package com.mera.Lesson5;

class Rectangle extends Figure {

    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double square() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %d, height = %d and square %.3f ", width, height, square()) + super.toString();
    }
}