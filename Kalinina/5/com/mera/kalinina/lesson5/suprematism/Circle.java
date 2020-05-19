package com.mera.kalinina.lesson5.suprematism;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) throws InvalidCircleRadiusException{
        if(radius < 0 || radius > 10) {
            throw new InvalidCircleRadiusException("Invalid Circle radius value: "
                    + radius + ". Valid values are 0 - 10");
        }
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

}
