package com.mera.Lesson4;

import java.util.Random;

class FruitAmbiguity {

    private final static int FRUITS_BOUND = 3, FRUITS_NUMBER = 4;

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[FRUITS_NUMBER];
        for (int i = 0; i < fruits.length; i++){
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i].toString());
        }
    }

    static Fruit getRandomFruit() {
        Fruit fruit;
        int fruitIndex = new Random().nextInt(FRUITS_BOUND);
        switch (fruitIndex) {
            case 0:
                fruit = new Apple();
                break;
            case 1:
                fruit = new Orange();
                break;
            case 2:
                fruit = new Pineapple();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + fruitIndex);
        }
        return fruit;
    }
}