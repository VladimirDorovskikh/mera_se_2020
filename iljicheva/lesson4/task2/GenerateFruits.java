package iljicheva.lesson4.task2;

import iljicheva.lesson4.task1.Fruit;
import java.util.Random;

public class GenerateFruits {
    public static void main(String[] args) {
        final int numAbstractFabric = 10;
        final int numFruits = 20;
        AbstractFabric[] randomAbstractFabrics = new AbstractFabric[numAbstractFabric];
        Fruit[] fruits = new Fruit[numFruits];

        for (int i = 0; i < numAbstractFabric; i++){
            randomAbstractFabrics[i] = getRandomFabric();
            System.out.println(randomAbstractFabrics[i].getClass().getSimpleName());
        }

        for (int i = 0; i < numFruits; i++){
            fruits[i] = randomAbstractFabrics[i/2].makeFruit();
            System.out.println(fruits[i].toString());
        }
    }

    public static AbstractFabric getRandomFabric(){
        switch (new Random().nextInt(4)){
            case 1: return new GreenApplesFactory();
            case 2: return new LongPinepplesFactory();
            case 3: return new RedApplesFactory();
            default: return new ThinOrangeFactory();
        }
    }
}
