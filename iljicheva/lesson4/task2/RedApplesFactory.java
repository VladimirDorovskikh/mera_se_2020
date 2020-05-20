package iljicheva.lesson4.task2;

import iljicheva.lesson4.task1.Apple;
import iljicheva.lesson4.task1.Fruit;

public class RedApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Apple(Colors.RED.toString());
    }
}
