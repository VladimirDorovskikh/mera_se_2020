package com.company.Point;

import java.util.Random;

public class Apple extends Fruit {
    String color;


    public Apple() {
        this(0,"light blue");
    }
    public Apple(String color) {
        this(0, color);
    }

    public Apple(int weith, String color) {
        super(weith);
        this.color = color;
    }

    @Override
    public String toString() {

        return super.toString() + "Apple{" +
                "color='" + color + '\'' +
                '}';
    }

    public void RandomApple (){

        super.RandomFruit();
        Random random = new Random ();
        String[] ArrAppleColors = new String []{"red", "yellow", "green"};
        this.color=ArrAppleColors [random.nextInt(ArrAppleColors.length)];

    }
    public Apple (Random random){

        super(random);
        //Random random = new Random ();
        String[] ArrAppleColors = new String []{"red", "yellow", "green"};
        this.color=ArrAppleColors [random.nextInt(ArrAppleColors.length)];

    }

}
