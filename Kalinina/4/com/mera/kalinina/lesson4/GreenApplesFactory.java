package com.mera.kalinina.lesson4;

/*
Класс создает только зеленые яблоки
 */

public class GreenApplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        int randomWeight =  Utils.getRandomIntFromInterval(100, 500);
        return new Apple(randomWeight, "GREEN");
    }
}
