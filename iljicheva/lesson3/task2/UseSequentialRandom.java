package iljicheva.lesson3.task2;

import iljicheva.lesson3.task2.SequentialRandom;

public class UseSequentialRandom {
    public static void main(String[] args) {
        int i = 0;
        SequentialRandom[] sequentialRandoms = new SequentialRandom[15];
        for (; i < 5; i++) {
            sequentialRandoms[i] = new SequentialRandom();
        }
        SequentialRandom.resetRandom();
        for (; i < 10; i++) {
            sequentialRandoms[i] = new SequentialRandom();
        }
        SequentialRandom.resetRandom();
        for (; i < 15; i++) {
            sequentialRandoms[i] = new SequentialRandom();
        }
        for (SequentialRandom sR : sequentialRandoms) {
            System.out.println(" " + sR.getField());
        }
    }
}
