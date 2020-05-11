package com.company;

import java.util.Random;

public class ex2 {
    static final int SIZE = 5;
    static Random rand = new Random();

    public static void main(String[] args) {
        int array[] = new int[SIZE];
        int even_array[] = new int[SIZE];
        int odd_array[] = new int [SIZE];

        for (int i = 0; i < SIZE; i++)
            array[i] = rand.nextInt(Integer.MAX_VALUE) % 1000;

        for (int i = 0; i < SIZE; i++)
            System.out.print(array[i] + " ");

        int e_idx = 0;
        int o_idx = 0;
        for (int i = 0; i < SIZE; i ++) {
            if (array[i] % 2 == 0)
                even_array[e_idx++] = array[i];
            else
                odd_array[o_idx++] = array[i];
        }

        System.out.println("\nEven array:");
        int even_sum = 0;
        int even_num = 0;
        for (int i = 0; i < SIZE; i++) {
            if (even_array[i] != 0) {
                even_sum += even_array[i];
                even_num = i+1;
                System.out.print(even_array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Odd array:");
        int odd_sum = 0;
        int odd_num = 0;
        for (int i = 0; i < SIZE; i++) {
            if (odd_array[i] != 0) {
                odd_sum += odd_array[i];
                odd_num = i+1;
                System.out.print(odd_array[i] + " ");
            }
        }
        System.out.println();

        System.out.println();

        if (even_num > 0)
            System.out.println("Average number in the even array is " + (even_sum/even_num));
        else
            System.out.println("No even numbers");

        if (odd_num > 0)
            System.out.println("Average number in the odd array is " + (odd_sum/odd_num));
        else
            System.out.println("No odd numbers");
    }
}
