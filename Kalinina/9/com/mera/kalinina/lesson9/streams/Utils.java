package com.mera.kalinina.lesson9.streams;

import java.util.Random;

public class Utils {

    public static int getRandomIntFromInterval(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
