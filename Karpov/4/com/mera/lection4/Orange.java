package com.mera.lection4;

import java.util.Random;

public class Orange extends Fruit {
    int peel;
    public static final int MIN_PEEL = 0;
    public static final int MAX_PEEL = 20;

    public Orange() {
        peel=peelGenerator(MIN_PEEL, MAX_PEEL);
    }

    public Orange(int min, int max) {
        peel=peelGenerator(min, max);
    }

    @Override
    public String toString(){
        return String.format("This is the %s with the peel thickness %d and weight %d", getClass().getSimpleName(), peel, weight);
    }

    private int peelGenerator(int minPeel, int maxPeel){
        Random r = new Random();

        if (minPeel>maxPeel){
            int buf = maxPeel;
            maxPeel = minPeel;
            minPeel = buf;
        }
        if (minPeel<MIN_PEEL){
            minPeel=MIN_PEEL;
        }
        if (maxPeel>MAX_PEEL){
            maxPeel=MAX_PEEL;
        }

        int bound = maxPeel-minPeel+1;

        return r.nextInt(bound)+minPeel;
    }
}
