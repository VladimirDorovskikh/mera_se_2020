package iljicheva.lesson4.task2;

import iljicheva.lesson4.task1.Fruit;
import iljicheva.lesson4.task1.Orange;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Orange(new Random().nextInt(5) + 1);
    }
}
