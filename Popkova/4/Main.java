package com.katepopkova;

import java.util.Random;

public class Main {
    private static final int MIN_FRUIT_RAND_IND = 1;
    private static final int MAX_FRUIT_RAND_IND = 3;
    private static final int FRUIT_ARRAY_SIZE = 4;
    private static final int FABRIC_FRUIT_ARRAY_SIZE = 20;
    private static final int FABRIC_COUNT = 4;
    private static final int CONST_VALUE = 1;
    private static final int FABRIC_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[FRUIT_ARRAY_SIZE];
        try {
            //fill and print the array with random fruits
            makeFruitArray(fruits);
            printFruitArray(fruits);
        }
        catch(NullPointerException ex) {
            System.out.println("Cannot get any fruit. There is no specified type of any fruit");
        }

        //fill the array with random fruits using different fabrics
        AbstractFabric[] fabrics = new AbstractFabric[FABRIC_FRUIT_ARRAY_SIZE];
        makeFabricArray(fabrics);
        Fruit[] fabricFruits = new Fruit[FABRIC_FRUIT_ARRAY_SIZE];
        makeFabricFruitArray(fabrics, fabricFruits);
    }

    private static void makeFruitArray(Fruit[] fruits) {
        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = getRandomFruit();
        }
    }

    private static Fruit getRandomFruit() {
        int fruitRandomIndex = new Random().nextInt(MAX_FRUIT_RAND_IND - MIN_FRUIT_RAND_IND
                + CONST_VALUE) + MIN_FRUIT_RAND_IND;
        Fruit fruit = null;

            switch (fruitRandomIndex) {
                case 1:
                    fruit = new Apple();
                    break;
                case 2:
                    fruit = new Orange();
                    break;
                case 3:
                    fruit = new Pineapple();
                    break;
            }
            return fruit;
    }

    private static void printFruitArray(Fruit[] fruits) {
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }

    private static void makeFabricArray(AbstractFabric[] fabrics) {
        for(int i = 0; i < fabrics.length; i++) {
            int fabricRandomIndex = new Random().nextInt(FABRIC_COUNT) + CONST_VALUE;
            switch (fabricRandomIndex) {
                case 1 :
                    fabrics[i] = new ThinOrangeFactory();
                    break;
                case 2 :
                    fabrics[i] = new RedAppleFactory();
                    break;
                case 3 :
                    fabrics[i] = new GreenApplesFactory();
                    break;
                case 4 :
                    fabrics[i] = new LongPinepplesFactory();
                    break;
            }
        }
    }

    private static void makeFabricFruitArray(AbstractFabric[] fabrics, Fruit[] fabricFruits) {
        int j = 0;
        for(int i = 0; i < fabricFruits.length; i++) {
            fabricFruits[i] = fabrics[j].makeFruit();
            if(i % 2 != 0) {
                ++j;
             }
         }
    }
}