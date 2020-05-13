package com.mera.training.task04;

public class ThinOrangeFactory extends AbstractFabric {
    private final int skinThickness = 1 + (int) (Math.random() * ((5 - 1) + 1)); // From 1 to 5

    public String makeFruit() {
        return "Orange" + ", skinThickness: " + skinThickness;
    }
}
