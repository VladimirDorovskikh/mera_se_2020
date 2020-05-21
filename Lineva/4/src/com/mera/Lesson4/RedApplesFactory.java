package com.mera.Lesson4;

class RedApplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        return new Apple(Apple.RED);
    }
}