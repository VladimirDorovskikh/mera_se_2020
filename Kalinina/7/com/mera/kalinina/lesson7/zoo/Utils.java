package com.mera.kalinina.lesson7.zoo;

import java.util.Random;

public class Utils {

    public static int getRandomIntFromInterval(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
