package com.pradedov.task2;

import com.pradedov.task1.Fruit;
import com.pradedov.task1.PineApple;

import java.util.Random;

public class LongPineApplesFactory extends AbstractFabric {
    public static final int MIN_LENGTH = 10;

    @Override
    public Fruit makeFruit() {
        return new PineApple(new Random().nextInt(MAX_WEIGHT),
                MIN_LENGTH + new Random().nextInt(PineApple.MAX_LENGTH - MIN_LENGTH));
    }
}
