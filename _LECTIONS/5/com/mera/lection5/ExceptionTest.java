package com.mera.lection5;


public class ExceptionTest {
    public static void main(String[] args) {
        int a = getInt(true);
        System.out.println(a);
    }

    private static int getInt(boolean random) {
        int value;
        if (random) {
            value = getIntFromZeroToFortyTwo();
            System.out.println("Возвращаем случайное число");
        } else {
            value = 42;
        }
        return value;
    }

    private static int getIntFromZeroToFortyTwo() {
        Random r = new Random();
        int i = r.nextInt();

        while (i == 0) {
            i = r.nextInt();
        }
        try {
            return 42 % i;
        } catch (ArithmeticException e) {
            System.out.println("Произошло деление на ноль:" + e.getMessage());
            return 1;
        }
    }
}





















class Random {
    int nextInt() {
        return new java.util.Random().nextInt(1000);
    }
}