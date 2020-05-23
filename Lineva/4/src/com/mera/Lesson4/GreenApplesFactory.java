package com.mera.Lesson4;

class GreenApplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        return new Apple(Apple.GREEN);
    }
}