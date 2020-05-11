package com.company;

import java.util.Random;

class SequentialRandom {
    static int previousObjValue;
    static boolean isInitialisedFirstly;
    private int value;

    SequentialRandom() {
        if (isInitialisedFirstly) {
            value = ++previousObjValue;
        } else {
            value = new Random().nextInt();
            isInitialisedFirstly = true;
            previousObjValue = value;

        }
    }

    static void resentRandom() {
        isInitialisedFirstly = false;
    }

    int getValue() {
        return value;
    }
}
