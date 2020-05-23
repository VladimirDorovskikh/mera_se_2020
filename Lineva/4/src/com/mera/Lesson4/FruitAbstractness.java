package com.mera.Lesson4;

import java.util.Random;

class FruitAbstractness {

    private final static int FABRICS_NUMBER = 10, FRUITS_NUMBER = 20;

    public static void main(String[] args) {
        AbstractFabric[] fabrics = new AbstractFabric[FABRICS_NUMBER];

        for (int i = 0; i < fabrics.length; i++) {
            int randomFabric = new Random().nextInt(4);
            switch (randomFabric){
                case 0:
                    fabrics[i] = new ThinOrangeFactory();
                    break;
                case 1:
                    fabrics[i] = new RedApplesFactory();
                    break;
                case 2:
                    fabrics[i] = new GreenApplesFactory();
                    break;
                case 3:
                    fabrics[i] = new LongPineapplesFactory();
                    break;
            }
        }

        Fruit[] fruits = new Fruit[FRUITS_NUMBER];
        for (int i = 0; i < fabrics.length; i++) {
            fruits[i*2] = fabrics[i].makeFruit();
            fruits[i*2 + 1] = fabrics[i].makeFruit();
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit #" + i + ": " + fruits[i].toString());
        }

    }
}