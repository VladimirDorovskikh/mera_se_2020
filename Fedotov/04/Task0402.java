package com.mera.training.task04;

import java.util.Random;

public class Task0402 {

    public static void main(String[] args) {

        System.out.println("Фруктовая абстрактность");

        final int factoryTypes = 4;
        final int factoryCount = 10;
        final int fruitCount = 20;

        int randomFactory = new Random().nextInt(factoryTypes);
        AbstractFabric[] factories = new AbstractFabric[factoryCount];
        Fruit[] fruit = new Fruit[fruitCount];

        for (int i = 0; i < factoryCount; ++i) {
            switch (randomFactory) {
                case 0:
                    factories[i] = new ThinOrangeFactory();
                    break;
                case 1:
                    factories[i] = new RedApplesFactory();
                    break;
                case 2:
                    factories[i] = new GreenApplesFactory();
                    break;
                default:
                    factories[i] = new LongPinepplesFactory();
            }
            System.out.println(factories[i].makeFruit());
            fruit[i * 2] = factories[i].makeFruit();
            fruit[i * 2 + 1] = factories[i].makeFruit();
        }
        for (Fruit fruitObj : fruit) {
            System.out.println(fruitObj.toString());
        }
    }
}
