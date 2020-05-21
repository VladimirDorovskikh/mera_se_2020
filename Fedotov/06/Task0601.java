package com.mera.training.task06;

import java.util.Random;

public class Task0601{
    public static void main(String[] args) {

        try {
            MyArrayList<Bicycle> bikeList = new MyArrayList<>();

            final int SIZE_OF_BIKES = 10;
            String[] bikes = new String[]{"Bike01", "Bike02", "Bike03", "Bike04", "Bike05", "Bike06",
                    "Bike07", "Bike08", "Bike09", "Bike10", "Bike11"};

            for (int i = 0; i < SIZE_OF_BIKES; i++) {
                Bicycle bicycle;
                bicycle = new Bicycle(bikes[i], new Random().nextInt(50));
                bikeList.add(bicycle);

                System.out.println("Bike Model: " + bikeList.get(i).getModelName() + ", Max Speed: " + bikeList.get(i).getMaxSpeed());
            }

            for (int i = 0; i < bikeList.size(); i++) {
                bikeList.remove(o -> o.getMaxSpeed() > 30);
            }
            System.out.format("\nNew Bike List Size: %d\n", bikeList.size());
            for (int i = 0; i < bikeList.size(); i++) {
                System.out.println("Bike Model: " + bikeList.get(i).getModelName() + ", Max Speed: " + bikeList.get(i).getMaxSpeed());
            }

        } catch (MyArrayStoreException eBikes) {
            eBikes.printStackTrace();
        }

        try {
            MyArrayList<Integer> numberList = new MyArrayList<>();

            final int SIZE_OF_NUMBERS = 10;

            for (int i = 0; i < SIZE_OF_NUMBERS; i++) {
                numberList.add(new Random().nextInt(SIZE_OF_NUMBERS));
            }
            numberList.remove(o -> o.intValue() % 2 == 0);
            System.out.format("\nNew Number List Size: %d\n", numberList.size());

            for (int i = 0; i < numberList.size(); i++) {
                System.out.println(numberList.get(i).toString());
            }

        } catch (MyArrayStoreException eNumbers) {
            eNumbers.printStackTrace();
        }
    }
}
