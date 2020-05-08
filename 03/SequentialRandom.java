package com.mera.training.task03;

import java.util.Random;

public class SequentialRandom {
    private final int currentNumber= new Random().nextInt(Integer.MAX_VALUE);
    private static int previousNumber;

    SequentialRandom() {
        if (previousNumber == 0) {
            previousNumber = this.currentNumber;
        }
        else {
            previousNumber++;
        }
    }

    public static void resetRandom() {
        previousNumber = new Random().nextInt(Integer.MAX_VALUE);
    }

    public void printCurrentNumber() {
        System.out.println(String.format("Содержит {%d} ", SequentialRandom.previousNumber));
    }

    public static void main(String[] args) {
        final int sequentialRandomCount = 7;
        SequentialRandom[] sequentialRandoms = new SequentialRandom[sequentialRandomCount];
        sequentialRandoms[0] = new SequentialRandom();
        sequentialRandoms[0].printCurrentNumber();

        for (int i = 1; i < sequentialRandomCount; ++i) {
            sequentialRandoms[i] = new SequentialRandom();

            if (i == 3) {
                SequentialRandom.resetRandom();
            }

            sequentialRandoms[i].printCurrentNumber();
        }
    }
}
