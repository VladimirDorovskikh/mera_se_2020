package com.mera.training.task04;

public class LongPinepplesFactory extends AbstractFabric {
    public Fruit makeFruit() {

        Pineapple fruit;
        do {
            fruit = new Pineapple();
        }
        while (fruit.getTailHeight() < 11);
        return fruit;
    }
}
