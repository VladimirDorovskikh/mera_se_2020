package com.company;
import java.util.Random;

public class ex3 {
    static final int SIZE = 7;
    static Random rand = new Random();

    public static void main(String[] args) {
        int positive_array[] = new int[SIZE];
        int negative_array[] = new int[SIZE];

        int pos_idx = 0;
        int neg_idx = 0;

        while (pos_idx < 7) {
            int temp = rand.nextInt();
            if (temp > 0) {
                positive_array[pos_idx] = temp;
                pos_idx++;
            }
        }

        while (neg_idx < 7) {
            int temp = rand.nextInt();
            if (temp < 0) {
                negative_array[neg_idx] = temp;
                neg_idx++;
            }
        }

        System.out.println("Positive array");
        for (int i = 0; i < SIZE; i++)
            System.out.print(positive_array[i] + " ");
        System.out.println();

        System.out.println("Negative array");
        for (int i = 0; i < SIZE; i++)
            System.out.print(negative_array[i] + " ");
        System.out.println();

        int sum_array[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            sum_array[i] = positive_array[i] + negative_array[i];
        }

        System.out.println("Sum array");
        for (int i = 0; i < SIZE; i++)
            System.out.print(sum_array[i] + " ");
        System.out.println();
    }
}
