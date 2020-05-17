package com.pradedov.task2;

import com.pradedov.task1.Fruit;

public abstract class AbstractFabric {
    public static final int MAX_WEIGHT = 50;

    abstract public Fruit makeFruit();
}
