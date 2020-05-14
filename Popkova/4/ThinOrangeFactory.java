package com.katepopkova;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {
    private final static int MIN_SKIN_THICKNESS = 1;
    private final static int MAX_SKIN_THICKNESS = 5;

    @Override
    public Fruit makeFruit() {
        int skinThickness = new Random().nextInt(MAX_SKIN_THICKNESS -
                MIN_SKIN_THICKNESS + 1) + 1;
        return new Orange(skinThickness);
    }
}
