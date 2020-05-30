package com.mera.lection4.ex1;

import java.util.Random;

import com.mera.lection4.Fruit;
import com.mera.lection4.Apple;
import com.mera.lection4.Orange;
import com.mera.lection4.Pineapple;

class Ex1 {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[4];

        for (int i=0; i<4; i++){
            System.out.print((i+1)+". ");
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i]);
        }
    }

    private static Fruit getRandomFruit(){
        Random r = new Random();
        Fruit fruit;
        switch (r.nextInt(3)) {
            case 0 -> {
                fruit = new Apple();
                break;
            }
            case 1 -> {
                fruit = new Orange();
                break;
            }
            default-> {
                fruit = new Pineapple();
                break;
            }
        }
        return fruit;
    }
}