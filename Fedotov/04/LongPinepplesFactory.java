package com.mera.training.task04;

public class LongPinepplesFactory extends AbstractFabric {
    private final int tailLength = 11 + (int) (Math.random() * ((Integer.MAX_VALUE - 11) + 1)); // From 11

    public String makeFruit() {
        return "PineApple" + ", tailLength: " + tailLength;
    }
}
