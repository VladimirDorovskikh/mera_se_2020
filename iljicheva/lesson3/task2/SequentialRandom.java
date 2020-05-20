package iljicheva.lesson3.task2;

import java.util.Random;

public class SequentialRandom {
    private int field;
    private static int currentValue = 0;

    public int getField() {
        return field;
    }

    public SequentialRandom(){
        if (currentValue == 0) {
            field = new Random().nextInt(100);
        } else {
            field = currentValue + 1;
        }
        currentValue = field;
    }

    public static void resetRandom(){
        currentValue = 0;
    }
}
