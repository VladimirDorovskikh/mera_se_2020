package com.mera.kalinina.lesson4;

/*
1. Фруктовая неоднозначность
Создать класс Fruit со свойством "вес" типа int и методом toString
Создать наследники:
Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20

переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)

создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
 */

import java.util.Random;

public class Task1 {

   public static Fruit getRandomFruit() throws Exception {
       String[] fruitTypeArray = {"Apple", "Orange", "Pineapple"};
       String randomFruitType = fruitTypeArray[new Random().nextInt(fruitTypeArray.length)];
       int randomWeight =  Utils.getRandomIntFromInterval(100, 500);

       switch(randomFruitType) {
           case "Apple": {
               String[] ColorArray = {"RED", "GREEN", "YELLOW"};
               String randomColor = ColorArray[new Random().nextInt(ColorArray.length)];
               return new Apple(randomWeight, randomColor);
           }
           case "Orange": {
               int randomSkinThickness = new Random().nextInt(20);
               return new Orange(randomWeight, randomSkinThickness);
           }
           case "Pineapple": {
               int randomTailHeight =  Utils.getRandomIntFromInterval(5, 20);
               return new Pineapple(randomWeight, randomTailHeight);
           }
           default:
               // should never happen
               throw new Exception("Unknown fruit: " + randomFruitType);
       }
   }

    public static void main(String[] args) {

       Fruit[] fruitArray = new Fruit[4];
       for (int i = 0; i < fruitArray.length; i++) {
           try {
               fruitArray[i] = getRandomFruit();
           } catch (Exception e) {
               e.printStackTrace();
           }
           System.out.println(fruitArray[i]);
       }



    }
}
