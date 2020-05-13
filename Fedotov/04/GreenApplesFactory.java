package com.mera.training.task04;

public class GreenApplesFactory extends AbstractFabric {
    public Fruit makeFruit() {

        Apple fruit;
        do {
            fruit = new Apple();
        }
        while (fruit.getColor().equals("Green"));
        return fruit;
    }
}
