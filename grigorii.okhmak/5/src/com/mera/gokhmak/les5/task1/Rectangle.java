package com.mera.gokhmak.les5.task1;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(Point figureCenter, double width, double height) throws IllegalArgumentException {
        super(figureCenter);

        if (width < 0. || height < 0.) {
            throw new IllegalArgumentException("Ширина и высота прямоугольника должны быть положительными");
        } else if (width > 10. || height > 10.) {
            throw new RectangleLimits();
        }

        this.width = width;
        this.height = height;
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

class RectangleLimits extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Реализация ограничивает создание слишком больших прямоугольников. Максимальные размеры w x h: 10 x 10";
    }
}