package com.mera.training.task04;

public class GreenApplesFactory extends AbstractFabric {
    private final String color = "Green";

    public String makeFruit() {
        return "Apple" + ", color: " + color;
    }
}
