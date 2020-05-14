package com.mera.kalinina.lesson4;

/*
2. Фруктовая абстрактность
Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
Создайте следующие подклассы:

ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
RedApplesFactory - которая создает только красные яблоки
GreenApplesFactory - которая создает только зеленые яблоки.
LongPineapplesFactory - которая создает только ананасы с длиной хвоста больше 10

Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */

import java.util.Random;

public class Task2 {

    public static AbstractFabric getRandomFruitFabric() throws Exception {
        String[] fruitFabricType = {"ThinOrangeFactory", "RedApplesFactory", "GreenApplesFactory", "LongPineapplesFactory"};
        String randomFruitFabricType = fruitFabricType[new Random().nextInt(fruitFabricType.length)];
        switch(randomFruitFabricType) {
            case "ThinOrangeFactory": {
                return new ThinOrangeFactory();
            }
            case "RedApplesFactory": {
                return new RedApplesFactory();
            }
            case "GreenApplesFactory": {
                return new GreenApplesFactory();
            }
            case "LongPineapplesFactory": {
                return new LongPineapplesFactory();
            }
            default:
                // should never happen
                throw new Exception("Unknown fruit fabric: " + randomFruitFabricType);
        }
    }

    public static void main(String[] args) {

        AbstractFabric[] fruitFabricArray = new AbstractFabric[10];

        for(int i = 0; i < fruitFabricArray.length; i++) {
            try {
                fruitFabricArray[i] = getRandomFruitFabric();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Fruit[] fruitArray = new Fruit[20];
        for(int i = 0, j = 0; i < fruitFabricArray.length; i++) {
            fruitArray[j++] = fruitFabricArray[i].makeFruit();
            fruitArray[j++] = fruitFabricArray[i].makeFruit();
        }

        for (Fruit fruit : fruitArray) {
            System.out.println(fruit);
        }
    }

}
