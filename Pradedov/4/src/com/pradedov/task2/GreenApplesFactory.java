package com.pradedov.task2;

import com.pradedov.task1.Apple;
import com.pradedov.task1.Color;
import com.pradedov.task1.Fruit;

import java.util.Random;

public class GreenApplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Apple(new Random().nextInt(MAX_WEIGHT), Color.GREEN);
    }
}
