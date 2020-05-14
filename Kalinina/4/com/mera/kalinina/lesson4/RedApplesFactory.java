package com.mera.kalinina.lesson4;

/*
Класс создает только красные яблоки
 */

import java.util.Random;

public class RedApplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        int randomWeight =  Utils.getRandomIntFromInterval(100, 500);
        return new Apple(randomWeight, "RED");
    }
}
