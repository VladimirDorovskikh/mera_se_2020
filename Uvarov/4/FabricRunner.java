package mera.fabric;

import mera.Fruit;

import java.util.Random;

public class FabricRunner {

    public static AbstractFabric[] getAbstractFabricArray(int arrayLength) {
        Random rnd = new Random();

        AbstractFabric[] fabricArray = new AbstractFabric[arrayLength];
        for (int i = 0; i < fabricArray.length; i++) {
            int fabricNumber = rnd.nextInt(4);

            switch (fabricNumber) {
                case 0:
                    fabricArray[i] = new ThinOrangeFactory();
                    break;
                case 1:
                    fabricArray[i] = new RedApplesFactory();
                    break;
                case 2:
                    fabricArray[i] = new GreenApplesFactory();
                    break;
                case 3:
                    fabricArray[i] = new LongPineapplesFactory();
                    break;
                default:
                    System.out.println("WrongFabricNumber: " + fabricNumber);
            }
        }
        return fabricArray;
    }

    public static void main(String[] args) {

        AbstractFabric[] fabricArray = getAbstractFabricArray(10);

        Fruit[] fruits = new Fruit[20];

        for (int i = 0, j = 0; i < fruits.length; i++) {
            fruits[i] = fabricArray[j].makeFruit();
            if (i % 2 == 1) {
                j++;
            }
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
