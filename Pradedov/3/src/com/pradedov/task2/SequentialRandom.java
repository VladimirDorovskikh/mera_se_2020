package com.pradedov.task2;

import java.util.Random;

public class SequentialRandom {
    private static final int UPPER_GENERATOR_BOUND = 1000;
    private static int objectsCounter = 0;

    public SequentialRandom() {
        if (0 == objectsCounter) {
            resetRandom();
        }
        else {
            // Secure upper Integer boundary overflow and set objectsCounter to 1
            // in order to avoid unexpected resetRandom() call when counter = 0
            if (++objectsCounter < 0) {
                objectsCounter = 1;
            }
        }
    }

    public static int getObjectsCounter() {
        return objectsCounter;
    }

    public static void resetRandom() {
        System.out.println("Reset counter randomly");
        objectsCounter = new Random().nextInt(UPPER_GENERATOR_BOUND);
    }
}
