package com.company;

import java.util.Random;

public class ex1 {

    static final int SIZE = 10;
    static Random rand = new Random();

    public static void main(String[] args) {
        int array[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++)
            array[i] = rand.nextInt(Integer.MAX_VALUE) % 1000;

        for (int i = 0; i < SIZE; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        int sum = 0;
        int min = array[0];
        int min_idx = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
                min_idx = i;
            }
        }

        System.out.println("Sum is " + sum);
        System.out.println("Min is " + min + " and its index is " + min_idx);
    }
}
