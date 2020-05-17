package com.mera.training.dorovskikh.suprematism;

/**
 * Создать классы-наследники:
 * Circle - дополнительный параметр радиус, от 0 до 10
 * определить метод square, чтобы он правильно считал площадь.
 */
public class Circle extends Figure
{
    public static final double PI = 3.14E00;
    public static final double MIN_RADIUS = 0.;
    public static final double MAX_RADIUS = 10.;
    double radius;

    public Circle(double radius) throws WrongRadiusException
    {
        super();
        if ((MIN_RADIUS <= radius) && (radius <= MAX_RADIUS))
        {
            this.radius = radius;
            return;
        }
        throw new WrongRadiusException("Expected circle radius between " + MIN_RADIUS + " and " + MAX_RADIUS +" instead of provided " + radius);
    }

    @Override
    public String toString()
    {
        return "Circle - " + square();
    }

    @Override
    double square()
    {
        return PI*radius*radius;
    }
}
