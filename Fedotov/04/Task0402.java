package com.mera.training.task04;

import java.util.Random;

public class Task0402 {

    public static void main(String[] args) {
        {
            System.out.println("Фруктовая абстрактность: Случайные фабрики одного типа");

            final int factoryTypes = 4;
            final int factoryNumbers = 10;

            int randomFactory = new Random().nextInt(factoryTypes);
            AbstractFabric[] factories = new AbstractFabric[factoryNumbers];

            for (int i = 0; i < factoryNumbers; ++i) {
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
            }
        }

        {
            System.out.println("\nФруктовая абстрактность: По 2 фрукта от одной фабрики");

            final int factoryNumbers = 4;
            final int fruitNumbers = 20;

            AbstractFabric[][] factories = new AbstractFabric[fruitNumbers][2];

            int i = 0;
            while (i < fruitNumbers) {
                for (int j = 0; j < factoryNumbers; ++j) {
                    switch (j) {
                        case 0:
                            factories[i][0] = new ThinOrangeFactory();
                            factories[i++][1] = new ThinOrangeFactory();
                            break;
                        case 1:
                            factories[i][0] = new RedApplesFactory();
                            factories[i++][1] = new RedApplesFactory();
                            break;
                        case 2:
                            factories[i][0] = new GreenApplesFactory();
                            factories[i++][1] = new GreenApplesFactory();
                            break;
                        default:
                            factories[i][0] = new LongPinepplesFactory();
                            factories[i++][1] = new LongPinepplesFactory();
                    }
                }
            }
            for (int k = 0; k < fruitNumbers; ++k) {
                System.out.println(factories[k][0].makeFruit() + ", " + factories[k][1].makeFruit());
            }
        }
    }
}
