package com.mera.kalinina.lesson4;

/*
Класс создает только ананасы с длиной хвоста больше 10
 */

public class LongPineapplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        int randomWeight =  Utils.getRandomIntFromInterval(100, 500);
        int randomTailHeight = Utils.getRandomIntFromInterval(10, 20);
        return new Pineapple(randomWeight, randomTailHeight);
    }
}
