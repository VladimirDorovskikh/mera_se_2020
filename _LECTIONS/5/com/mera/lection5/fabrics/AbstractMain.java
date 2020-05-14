package com.mera.lection5.fabrics;

import java.util.Random;

public class AbstractMain {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i1 = 0; i1 < 10; i1++) {
            final int i = r.nextInt(2);

            AbstractFabric fabric;

            if (i == 1) {
                fabric = new IntegerFactory();
            } else {
                fabric = new StringFactory();
            }

            fabric.makeAndPrint();
        }

    }
}
