package com.mera.lesson11;

import java.util.Random;

public class RandomSamples {




    public static void main(String[] args) {
        Random r1 = new Random();
        Random r2 = new Random();


        for (int i = 0; i < 10; i++) {
            System.out.println("\n\nr1=" + r1.nextInt());
            System.out.println("r2=" + r2.nextInt());


        }
    }
}
