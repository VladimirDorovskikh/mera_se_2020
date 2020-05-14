package com.katepopkova;

public class RedAppleFactory extends AbstractFabric {


    @Override
    public Fruit makeFruit() {
        return new Apple("red");
    }
}
