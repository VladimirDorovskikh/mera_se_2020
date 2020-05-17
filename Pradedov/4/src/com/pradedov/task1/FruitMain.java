package com.pradedov.task1;
/*
1. Фруктовая неоднозначность
Создать класс Fruit со свойством "вес" типа int и методом toString
Создать наследники:
Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20

переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)

создать метод getRandomFruit - которое возвращает случайный фрукт со случайными характеристиками.
Создать массив типа Fruit, заполнить его 4 разными случайными фруктами и вывести их на экран
 */

import java.util.Random;

public class FruitMain {
    public static void main(String[] args) {
        final int NUMBER_OF_FRUITS = 4;

        Fruit [] fruits = new Fruit[NUMBER_OF_FRUITS];

        for (int idx = 0; idx < NUMBER_OF_FRUITS; ++idx ){
            fruits[idx] = getRandomFruit();
            System.out.println(fruits[idx].toString());
        }
    }

    private static Fruit getRandomFruit() {
        Fruit fruit;
        Random random = new Random();
        final int MAX_FRUIT_WEIGHT = 50;
        final int KINDS_OF_FRUITS = 3;

        int fruitWeight = random.nextInt(MAX_FRUIT_WEIGHT);

        int fruitType = random.nextInt(KINDS_OF_FRUITS);
        switch(fruitType) {
            case 0:     // Assume Apple
                int numOfColors = Color.values().length;
                int colorIndex = random.nextInt(numOfColors);
                fruit = new Apple(fruitWeight, Color.values()[colorIndex]);
                break;
            case 1:     // Assume Orange
                // Secure possible range change in future
                int thickness = Orange.MIN_THICKNESS + random.nextInt(Orange.MAX_THICKNESS - Orange.MIN_THICKNESS);
                fruit = new Orange(fruitWeight, thickness);
                break;
            case 2:     // Assume Pine Apple
                int length = PineApple.MIN_LENGTH + random.nextInt(PineApple.MAX_LENGTH - PineApple.MIN_LENGTH);
                fruit = new PineApple(fruitWeight, length);
                break;
            default:
                throw new IllegalArgumentException("We should never reach this point. Unhandled fruitType = " + fruitType);
        }

        return fruit;
    }
}
