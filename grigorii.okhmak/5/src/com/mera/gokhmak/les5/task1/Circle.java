package com.mera.gokhmak.les5.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(Point figureCenter, double radius) {
        super(figureCenter);
        this.radius = Math.abs(radius);
    }

    @Override
    public Number square() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "square=" + square() +
                '}';
    }
}
