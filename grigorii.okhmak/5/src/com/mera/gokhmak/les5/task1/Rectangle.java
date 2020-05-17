package com.mera.gokhmak.les5.task1;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(Point figureCenter, double width, double height) {
        super(figureCenter);
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square() +
                "}";
    }

    @Override
    public Number square() {
        return width * height;
    }
}
