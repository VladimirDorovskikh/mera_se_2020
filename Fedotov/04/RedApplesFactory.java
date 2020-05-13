package com.mera.training.task04;

import java.util.Random;

public class RedApplesFactory extends AbstractFabric {
    private final String color = "Red";

    public String makeFruit() {
        return "Apple" + ", color: " + color;
    }
}
