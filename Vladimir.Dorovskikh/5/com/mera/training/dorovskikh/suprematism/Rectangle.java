package com.mera.training.dorovskikh.suprematism;

import java.util.Random;

/**
 * Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
 */
public class Rectangle extends Figure
{
    public static final double MIN_HEIGHT = 0.;
    public static final double MAX_HEIGHT = 20.;
    public static final double MIN_WIDTH = 0.;
    public static final double MAX_WIDTH = 20.;
    double height;
    double width;

    public Rectangle()
    {
        this(new Random().nextDouble() * (MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT,
                new Random().nextDouble() * (MAX_WIDTH   -  MIN_WIDTH) + MIN_WIDTH);
    }

    public Rectangle(double height, double width)
    {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    double square()
    {
        return height * width;
    }

    @Override
    public String toString()
    {
        return "Rectangle - " + square();
    }
}
