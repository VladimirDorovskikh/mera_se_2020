package com.pradedov.task2;
/*
2. Фруктовая абстрактность
Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
Создайте следующие подклассы:

ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
RedApplesFactory - которая создает только красные яблоки
GreenApplesFactory - которая создает только зеленые яблоки.
LongPineapplesFactory - которая создает только ананасы с длиной хвоста больше 10

Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */

import com.pradedov.task1.Fruit;

import java.util.Random;

public class AbstractFabricMain {
    private static final int NUMBER_OF_FACTORIES = 10;
    private static final int FRUITS_PER_FACTORY = 2;

    enum FactoryType {
        THIN_ORANGE,
        RED_APPLES,
        GREEN_APPLES,
        LONG_PINEAPPLES
    }

    private static AbstractFabric getRandomFactory() {
        int factoryIdx = new Random().nextInt(FactoryType.values().length);
        FactoryType type = FactoryType.values()[factoryIdx];
        switch (type) {
            case RED_APPLES:
                return new RedApplesFactory();
            case THIN_ORANGE:
                return new ThinOrangeFactory();
            case GREEN_APPLES:
                return new GreenApplesFactory();
            case LONG_PINEAPPLES:
                return new LongPineApplesFactory();
            default:
                throw new IllegalArgumentException("Unhandled FactoryType: " + type);
        }
    }

    public static void main(String[] args) {
        AbstractFabric [] factories = new AbstractFabric[NUMBER_OF_FACTORIES];
        for (int idx = 0; idx < NUMBER_OF_FACTORIES; ++idx) {
            factories[idx] = getRandomFactory();
        }

        Fruit [] fruits = new Fruit[NUMBER_OF_FACTORIES * FRUITS_PER_FACTORY];
        for (int factoryIdx = 0; factoryIdx < NUMBER_OF_FACTORIES; ++factoryIdx) {
            for(int fruitIdx = 0; fruitIdx < FRUITS_PER_FACTORY; ++fruitIdx) {
                fruits[FRUITS_PER_FACTORY * factoryIdx + fruitIdx] = factories[factoryIdx].makeFruit();
            }
        }

        for (Fruit fruit: fruits) {
            System.out.println(fruit.toString());
        }
    }
}
