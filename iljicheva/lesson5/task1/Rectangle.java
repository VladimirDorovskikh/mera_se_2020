package iljicheva.lesson5.task1;

import java.util.Random;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
        this.width = new Random().nextInt(20);
        this.height = new Random().nextInt(20);
    }

    @Override
    double calculateSquare() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle - " + this.calculateSquare()
                + "\n width = " + this.width
                + "\n height = " + this.height;
    }
}
