package com.pradedov.task1;

public class Orange extends Fruit{
    private final int peelThickness;

    private static final String type = "Orange";
    public static final int MIN_THICKNESS = 0;
    public static final int MAX_THICKNESS = 20;


    public Orange(int weight, int peelThickness) {
        super(weight);
        if (peelThickness < MIN_THICKNESS || peelThickness > MAX_THICKNESS) {
            throw new IllegalArgumentException(type + "peelThickness should be in range ["
                    + MIN_THICKNESS + "," + MAX_THICKNESS + "], but you provided: " + peelThickness);
        }
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return type + ".  Weight: " + weight + "; Thickness: " + peelThickness ;
    }
}
