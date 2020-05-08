package com.mera.training.task03;

import java.util.Random;

public class SequentialRandom {
    private final int currentNumber;
    public static int previousNumber;

    SequentialRandom(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public int getNumber() {
        return this.currentNumber;
    }

    public void setPreviousNumber() {
        previousNumber = getNumber();
    }

    public static void resetRandom() {
        previousNumber = new Random().nextInt(Integer.MAX_VALUE);
    }

    public void printCurrentNumber() {
        System.out.println(String.format("Содержит {%d} ", getNumber()));
    }

    public static void main(String[] args) {
        final int sequentialRandomCount = 7;
        SequentialRandom[] sequentialRandoms = new SequentialRandom[sequentialRandomCount];
        sequentialRandoms[0] = new SequentialRandom(new Random().nextInt(Integer.MAX_VALUE));
        sequentialRandoms[0].setPreviousNumber();
        sequentialRandoms[0].printCurrentNumber();

        for (int i = 1; i < sequentialRandomCount; ++i) {
            sequentialRandoms[i] = new SequentialRandom(++SequentialRandom.previousNumber);

            if (i == 3) {
                SequentialRandom.resetRandom();
            }

            sequentialRandoms[i].printCurrentNumber();
        }
    }
}
