package com.pradedov.task2;

import com.pradedov.task1.Fruit;
import com.pradedov.task1.Orange;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {
    public static final int MIN_THIN = 1;
    public static final int MAX_THIN = 5;

    @Override
    public Fruit makeFruit() {
        return new Orange(new Random().nextInt(MAX_WEIGHT),
                MIN_THIN + new Random().nextInt(MAX_THIN - MIN_THIN));
    }
}
