package com.pradedov.task1;

import java.util.Random;

public class Circle extends Figure {
    private final double radius;

    private static final int MIN_RADIUS = 0;
    private static final int MAX_RADIUS = 10;

    public Circle() {
        super();
        Random random = new Random();
        this.radius = random.nextDouble() * (MIN_RADIUS + random.nextInt(MAX_RADIUS - MIN_RADIUS));
    }

    public Circle(double radius) throws InvalidRadiusException {
        super();
        validateRadius(radius);
        this.radius = radius;
    }

    public Circle(Dot center, double radius) throws InvalidRadiusException {
        super(center);
        validateRadius(radius);
        this.radius = radius;
    }

    private void validateRadius(double radius) throws InvalidRadiusException {
        if (radius < MIN_RADIUS || radius > MAX_RADIUS) {
            throw new InvalidRadiusException("Circle: radius should be in range: [" + MIN_RADIUS + ", " + MAX_RADIUS + "], but you set: " + radius);
        }
    }

    @Override
    public double square() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle - " + square();
    }
}

class InvalidRadiusException extends Exception {
    public InvalidRadiusException(String message) {
        super(message);
    }
}