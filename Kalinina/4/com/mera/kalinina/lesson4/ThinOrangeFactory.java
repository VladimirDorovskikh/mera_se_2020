package com.mera.kalinina.lesson4;

/*
Класс создает только апельсины с толщиной кожуры от 1 до 5
 */

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        int randomWeight =  Utils.getRandomIntFromInterval(100, 500);
        int randomSkinThickness = Utils.getRandomIntFromInterval(1, 5);
        return new Orange(randomWeight, randomSkinThickness);
    }

}
