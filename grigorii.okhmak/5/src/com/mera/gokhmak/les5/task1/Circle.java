package com.mera.gokhmak.les5.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(Point figureCenter, double radius) throws IllegalArgumentException {
        super(figureCenter);
        if (radius < 0.) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        } else if (radius > 10.) {
            throw new RadiusLimitation();
        }
        this.radius = radius;
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

class RadiusLimitation extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Реализация ограничивает создание окружностей размером больше 10";
    }
}