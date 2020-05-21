package mera.generics;

import mera.bycicle.Bicycle;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_BICYCLE = 11;
        final int NUMBER_OF_INTEGERS = 10;
        String[] modelNames = {"Stels", "Stark Shooter", "Subrosa", "Silverback", "Schwinn", "BMX"};

        Bicycle[] bicycle = getRandomBikesPArray(NUMBER_OF_BICYCLE, modelNames);

        MyArrayList<Bicycle> bikesList = new MyArrayList<>();

        for (int i = 0; i < bicycle.length; i++) {
            try {
                bikesList.add(bicycle[i]);
                System.out.println("Added bike: " + bicycle[i].toString());
            } catch (MyArrayStoreException e) {
                System.out.println("Error while adding bike: " + bicycle[i].toString() + " " + e.getMessage() + '\n');
            }
        }

        Random rnd = new Random();
        int speedLimit = rnd.nextInt(50);
        System.out.println("Speed limit: " + speedLimit);

        for (int i = 0; i < bicycle.length; i++) {
            if (bicycle[i].getMaxSpeed() < speedLimit) {
                bikesList.remove(bicycle[i]);
            }
        }

        System.out.println("MyArrayList after removing bikes:");
        System.out.println(Arrays.toString(bikesList.toArray()));


        MyArrayList<Integer> numberList = new MyArrayList<>(NUMBER_OF_INTEGERS);
                for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            numberList.add(rnd.nextInt(NUMBER_OF_INTEGERS - 1) + 1);
        }

        System.out.println("\nInitial array: ");
        System.out.println(Arrays.toString(numberList.toArray()));
        for (int i = NUMBER_OF_INTEGERS - 1; i >= 0; i--) {
            if (numberList.get(i) % 2 == 0) {
                numberList.remove(numberList.get(i));
            }
        }

        System.out.println("Array after removing even numbers: ");
        System.out.println(Arrays.toString(numberList.toArray()));
    }

    public static Bicycle[] getRandomBikesPArray(int len, String[] modelNames) {
        Bicycle[] bicycle = new Bicycle[len];
        Random rnd = new Random();

        for (int i = 0; i < bicycle.length; i++) {
            int nameIndex = rnd.nextInt(modelNames.length);
            int maxSpeed = rnd.nextInt(Bicycle.MAX_SPEED - Bicycle.MIN_SPEED + 1) + Bicycle.MIN_SPEED;
            bicycle[i] = new Bicycle(modelNames[nameIndex], maxSpeed);
        }

        return bicycle;
    }
}
