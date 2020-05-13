package com.katepopkova;

public class GreenApplesFactory extends AbstractFabric {

    @Override
    public Fruit makeFruit() {
        return new Apple("green");
    }
}
