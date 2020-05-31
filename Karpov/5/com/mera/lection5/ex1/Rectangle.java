package com.mera.lection5.ex1;

import java.util.Random;

public class Rectangle extends Figure {
    static final int MAX_LENGHT=20;
    static int height, wigth;


    public Rectangle(int x, int y, int height, int wigth) {
        super(x,y);
        this.height = height;
        this.wigth = wigth;
    }

    public Rectangle() {
        super(x,y);
        Random size = new Random();
        height = size.nextInt(MAX_LENGHT);
        wigth = size.nextInt(MAX_LENGHT);
    }

    @Override
    public double square() {
        return (double)(height*wigth*0.5);
    }

    @Override
    public String toString(){
        return String.format("The %s with square %f", getClass().getSimpleName(), square());
    }
}