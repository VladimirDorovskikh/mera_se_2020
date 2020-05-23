package com.mera.Lesson4;

import java.util.Random;

class ThinOrangeFactory extends AbstractFabric{

    private final static int PEEL_THICKNESS_BOUND = 5;

    @Override
    Fruit makeFruit() {
        int peelThickness = new Random().nextInt(PEEL_THICKNESS_BOUND) + 1;
        return new Orange(peelThickness);
    }
}