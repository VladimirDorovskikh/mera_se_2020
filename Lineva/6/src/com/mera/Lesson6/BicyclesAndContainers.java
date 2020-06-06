package com.mera.Lesson6;

import java.util.Random;

class BicyclesAndContainers {

    private final static int INTEGER_BOUND = 10;
    private final static int BICYCLES_NUMBER = 11;

    public static void main(String[] args) {
        testBicycles();
        testIntegers();
    }

    private static void testBicycles() {

        System.out.println("Test Bicycles");
        System.out.println();
        System.out.println("Creating my array list with Bicycles...");

        MyArrayList<Bicycle> myList = new MyArrayList<>();

        for (int i = 0; i < BICYCLES_NUMBER; i++) {
            Bicycle bicycle = new Bicycle();
            try {
                myList.add(bicycle);
            }
            catch (MyArrayStoreException myArrayStoreException) {
                System.out.println("Can't add " + bicycle.toString());
            }
        }
        System.out.println("Created list: " + java.util.Arrays.toString(myList.toArray()));

        int randomSpeed = new Random().nextInt(Bicycle.MAX_SPEED + 1);
        System.out.println("Generated random speed: " + randomSpeed);

        int i = 0;
        while (i < myList.size()) {
            Bicycle bicycle = myList.get(i);
            if (bicycle.getMaxSpeed() < randomSpeed) {
                myList.remove(bicycle);
            }
            else {
                i++;
            }
        }

        System.out.println("List after removing bicycles with less speed: "+ java.util.Arrays.toString(myList.toArray()));
    }

    private static void testIntegers() {
        System.out.println();
        System.out.println("Test Integers");
        System.out.println();
        System.out.println("Creating my array list with Integers...");

        MyArrayList<Integer> myList = new MyArrayList<>();

        Random random = new Random();

        for (int i = 0; i < MyArrayList.getCAPACITY(); i++) {
            myList.add(random.nextInt(INTEGER_BOUND) + 1);
        }

        System.out.println("Created list: " + java.util.Arrays.toString(myList.toArray()));

        int i = 0;
        while (i < myList.size()) {
            Integer item = myList.get(i);
            if (item % 2 == 0) {
                myList.remove(item);
            }
            else {
                i++;
            }
        }

        System.out.println("List after removing even numbers: "+ java.util.Arrays.toString(myList.toArray()));
    }
}