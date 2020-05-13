package com.mera.gokhmak;

public class Task2 {
    public static void main(String[] args) {
        final int FABRIC_SIZE = 10;
        final int FRUITS_SIZE = 20;
        AbstractFabric[] randomFabrics = new AbstractFabric[FABRIC_SIZE];
        for (int i = 0; i < randomFabrics.length; i++) {
            randomFabrics[i] = AbstractFabric.getRandomFabric();
        }
        Fruit[] fruits = new Fruit[FRUITS_SIZE];
        for (int i = 0, j = 0; i < fruits.length; i++) {
            if (i != 0 && i % 2 == 0) {
                j++;
            }
            fruits[i] = randomFabrics[j].makeFruit();
        }
        // Output:
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
