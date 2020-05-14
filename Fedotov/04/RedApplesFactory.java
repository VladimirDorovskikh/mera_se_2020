package com.mera.training.task04;

import java.util.Random;

public class RedApplesFactory extends AbstractFabric {
    public Fruit makeFruit() {

        Apple fruit;
        do {
            fruit = new Apple();
        }
        while (fruit.getColor().equals("Red"));
        return fruit;
    }
}
