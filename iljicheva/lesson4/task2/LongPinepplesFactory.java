package iljicheva.lesson4.task2;

import iljicheva.lesson4.task1.Fruit;
import iljicheva.lesson4.task1.Pineapple;

import java.util.Random;

public class LongPinepplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Pineapple(new Random().nextInt(10) + 10);
    }
}
