package com.company.Point;

import java.util.Random;

public class Orange extends Fruit {
    int theThicknessOfTheRind;
    int minTheThicknessOfTheRind=0;
    int maxTheThicknessOfTheRind=20;

    public Orange() {
        this(0,0);
    }
    public Orange(int weith) {
        this(weith,0);
    }

    public Orange(int weith, int theThicknessOfTheRind) {
        super(weith);
        this.theThicknessOfTheRind = theThicknessOfTheRind;
    }
    public Orange (Random random){

        super(random);
        int max = maxTheThicknessOfTheRind;
        int min = minTheThicknessOfTheRind;
        max -= min;
        this.theThicknessOfTheRind = (int) ((Math.random() * ++max) + min);

    }

    @Override
    public String toString() {
        return super.toString() + "Orange{" +
                "theThicknessOfTheRind=" + theThicknessOfTheRind +
                '}';
    }
}
