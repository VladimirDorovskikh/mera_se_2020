package com.mera.lection5.ex1;

import java.util.Random;

public class Circle extends Figure {
    static final int MAX_RADIUS=10;
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        if (radius < 0.0){
            throw new NegativeRadius("The radius in less than zero\n");
        }
        this.radius=radius;
    }
    public Circle(int x, int y){
        super(x, y);
        radius=size.nextInt(MAX_RADIUS);
    }

    public Circle() {
        radius=size.nextInt(MAX_RADIUS);
    }

    @Override
    public double square() {
        return (double)(3.1415*radius*radius);
    }

    @Override
    public String toString(){
        return String.format("The %s with square %f", getClass().getSimpleName(), square());
    }


}
