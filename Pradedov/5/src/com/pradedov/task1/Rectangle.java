package com.pradedov.task1;

import java.util.Random;

public class Rectangle extends Figure{
    private final double width;
    private final double height;

    private static final int MIN_WIDTH = 0;
    private static final int MAX_WIDTH = 20;

    private static final int MIN_HEIGHT = 0;
    private static final int MAX_HEIGHT = 20;

    public Rectangle() {
        super();
        Random random = new Random();
        this.width = random.nextDouble() * (MIN_WIDTH + random.nextInt(MAX_WIDTH - MIN_WIDTH));
        this.height = random.nextDouble() * (MIN_HEIGHT + random.nextInt(MAX_HEIGHT - MIN_HEIGHT));
    }

    public Rectangle(double width, double height) throws InvalidRectangleException {
        super();
        validateRectangle(width, height);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Dot center, double width, double height) throws InvalidRectangleException {
        super(center);
        validateRectangle(width, height);
        this.width = width;
        this.height = height;
    }

    private void validateRectangle(double width, double height) throws InvalidRectangleException {
        if (width < MIN_WIDTH || width > MAX_WIDTH || height < MIN_HEIGHT || height > MAX_WIDTH ) {
            throw new InvalidRectangleException("Rectangle: width and height should be in ranges respectively: ["
                    + MIN_WIDTH + ", " + MAX_WIDTH + "] and [" + MIN_HEIGHT + ", " + MAX_HEIGHT + "],"
                    + " but you provided: " + width + ", " + height);
        }
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle - " + square();
    }
}

class InvalidRectangleException extends Exception {
    public InvalidRectangleException(String message) {
        super(message);
    }
}
