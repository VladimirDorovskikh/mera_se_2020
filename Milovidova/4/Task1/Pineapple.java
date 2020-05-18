package com.company.Point;

import java.util.Random;

public class Pineapple extends Fruit {
    int lengthOfTail;
    private static int minLengthOfTail = 5;
    private static int maxLengthOfTail = 20;

    public Pineapple() {
        this(0, 0);
    }

    public Pineapple(int weith) {
        this(weith, 0);
    }

    public Pineapple(int weith, int lengthOfTail) {
        super(weith);
        this.lengthOfTail = lengthOfTail;
    }

    @Override
    public String toString() {
        return super.toString() + "Pineapple{" +
                "lengthOfTail=" + lengthOfTail +
                '}';
    }

    public Pineapple(Random random) {
        super(random);
        int max = maxLengthOfTail;
        int min = minLengthOfTail;
        max -= min;
        this.lengthOfTail = (int) ((Math.random() * ++max) + min);
    }
}
