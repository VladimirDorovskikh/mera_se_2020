package com.mera.lection5.ex1;

import java.util.Random;

public class Rectangle extends Figure {
    static final int MAX_LENGHT=20;
    static int height, wigth;
    //Random size = new Random();


    public Rectangle(int x, int y, int height, int wigth) {
        super(x,y);
        if (height < 0 || wigth < 0) {
            throw new NegativeRectParameters(String.format("Incorrect parameter (less than zero)\n\theight: %f\n\twigth: %f", (float)height, (float)wigth));
        }
        this.height = height;
        this.wigth = wigth;
    }

    public Rectangle(int x, int y) {
        super(x,y);
        height = size.nextInt(MAX_LENGHT);
        wigth = size.nextInt(MAX_LENGHT);
    }

    public Rectangle() {
        //super(x,y);
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