package com.mera.Lesson4;

import java.util.Random;

class LongPineapplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        int tailHeight = new Random().nextInt(100) + 10;
        return new Pineapple(tailHeight);
    }
}