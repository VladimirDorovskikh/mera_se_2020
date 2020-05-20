package iljicheva.lesson4.task1;

import java.util.Random;

public class GenerateFruits {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        for (int i = 0; i < 4; i++){
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i].toString());
        }
    }

    public static Fruit getRandomFruit(){
        switch (new Random().nextInt(3)){
            case 1 : return new Apple();
            case 2 : return new Orange();
            default: return new Pineapple();
        }
    }
}
