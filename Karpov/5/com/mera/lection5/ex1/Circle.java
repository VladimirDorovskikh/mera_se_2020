package com.mera.lection5.ex1;

import java.util.Random;

public class Circle extends Figure {
    static final int MAX_RADIUS=10;
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius=radius;
    }

    public Circle() {
        super(x, y);
        Random size = new Random();
        radius=size.nextInt(MAX_RADIUS);
    }

    @Override
    public double square() {
        return (double)(3.1415*radius*radius);
    }


}
