package com.katepopkova;

import java.util.Random;

public class LongPinepplesFactory extends AbstractFabric {
    private final int MIN_TAIL_HEIGHT_BOUND = 10;

    @Override
    public Fruit makeFruit() {
        int trailHeight = new Random().nextInt(MIN_TAIL_HEIGHT_BOUND);
        return new Pineapple(trailHeight);
    }
}
