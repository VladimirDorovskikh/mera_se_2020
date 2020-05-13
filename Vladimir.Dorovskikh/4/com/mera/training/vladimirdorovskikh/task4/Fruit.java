package com.mera.training.vladimirdorovskikh.task4;

import java.util.Random;

/**
 * 1. Фруктовая неоднозначность
 * Создать класс Fruit со свойством "вес" типа int и методом toString
 * Создать наследники:
 * Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
 * Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
 * Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20
 *
 * переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)
 *
 * создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
 * Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
 *
 */
class Fruit {
    int fruitWeight;

    public Fruit() {
        fruitWeight = new Random().nextInt(2000);
    }

    @Override
    public String toString()
    {
        return "Фрукт весом " + fruitWeight + "грамм.";
    }

    public static void main(String ... args)
    {
        System.out.println();
        System.out.println("Фруктовая неоднозначность");

        Fruit[] fruitArray = new Fruit[4];
        for (int i = 0; i < fruitArray.length; ++i)
        {
            fruitArray[i] = getRandomFruit();
        }
        for (Fruit someFruit : fruitArray)
        {
            System.out.println(someFruit.toString());
        }
    }

    public static Fruit getRandomFruit()
    {
        Fruit someFruit;
        switch (new Random().nextInt(3))
        {
            case 0:
                someFruit = new Apple();
                break;
            case 1:
                someFruit = new Orange();
                break;
            case 2:
            default:
                someFruit = new Pineapple();
                break;
        }
        return someFruit;
    }
}

/**
 * Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
 */
class Apple extends Fruit
{
    String appleColor;

    public String getAppleColor() {
        return appleColor;
    }

    public Apple() {
        switch (new Random().nextInt(3)){
            case 0:
                appleColor = "красное";
                break;
            case 1:
                appleColor = "зеленое";
                break;
            case 2:
            default:
                appleColor = "желтое";
                break;
        }
        fruitWeight = 100 + new Random().nextInt(300);
    }

    @Override
    public String toString()
    {
        return appleColor + " яблоко весом " + fruitWeight + " грамм.";
    }
}

/**
 * Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
 */
class Orange extends Fruit
{
    int skinThickness;

    public int getSkinThickness() {
        return skinThickness;
    }

    public Orange() {
        skinThickness = new Random().nextInt(21);
        fruitWeight = 300 + new Random().nextInt(200);
    }

    @Override
    public String toString()
    {
        return "Апельсин весом " + fruitWeight + " грамм с кожурой " + skinThickness +" мм.";
    }
}

/**
 * Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20
 */
class Pineapple extends Fruit
{
    int tailHeight;

    public int getTailHeight() {
        return tailHeight;
    }

    public Pineapple() {
        tailHeight = 5 + new Random().nextInt(16);
        fruitWeight = 700 + new Random().nextInt(700);
    }

    @Override
    public String toString()
    {
        return "Ананас весом " + fruitWeight + " грамм с хвостом " + tailHeight +" см.";
    }
}