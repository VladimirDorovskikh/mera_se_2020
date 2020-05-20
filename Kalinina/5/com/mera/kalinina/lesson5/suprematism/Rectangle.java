package com.mera.kalinina.lesson5.suprematism;

public class Rectangle extends Figure {

    private int width;
    private int length;

    public Rectangle(int width, int length) throws InvalidRectangleSideException {
        if(width < 0 || width > 20) {
            throw new InvalidRectangleSideException("Invalid Rectangle width value: "
                    + width + ". Valid values are 0 - 20");
        }
        if(length < 0 || length > 20) {
            throw new InvalidRectangleSideException("Invalid Rectangle length value: "
                    + length + ". Valid values are 0 - 20");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double square() {
        return width * length;
    }

}
