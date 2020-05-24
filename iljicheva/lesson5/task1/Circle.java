package iljicheva.lesson5.task1;

import java.util.Random;

public class Circle extends Figure {
    private double R;
    public Circle() {
        R = new Random().nextInt(11);
    }

    @Override
    double calculateSquare() {
        return Math.PI * R * R;
    }


    @Override
    public String toString() {
        return "Circle - " + this.calculateSquare()
                + "\n R = " + this.R;
    }
}
