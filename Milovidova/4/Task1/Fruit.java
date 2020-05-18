package com.company.Point;

import java.util.Random;

public class Fruit {
    int weight;
    private static int minWeight = 150;
    private static int maxWeight = 250;

    public Fruit() {
     //   weight = 0;
        this(0);
    }

    public Fruit(int weight) {

        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
    public void RandomFruit(){
        int max = maxWeight;
        int min = minWeight;
        max-= min;

      //  Random random = new Random();
       // this.weight = random.nextInt(150, 250);
        this.weight = (int) ((Math.random() * ++max) + min);
    }
    public Fruit(Random random){
        int max = maxWeight;
        int min = minWeight;
        max-= min;

        //  Random random = new Random();
        // this.weight = random.nextInt(150, 250);
        this.weight = (int) ((Math.random() * ++max) + min);
    }
}
