package com.mera.training.task04;

public class ThinOrangeFactory extends AbstractFabric {
    public Fruit makeFruit() {

        Orange fruit;
        do {
            fruit = new Orange();
        }
        while ((fruit.getSkinThickness() < 1) || (fruit.getSkinThickness() > 5));
        return fruit;
    }
}
