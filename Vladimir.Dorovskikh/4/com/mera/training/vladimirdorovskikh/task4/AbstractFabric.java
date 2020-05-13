package com.mera.training.vladimirdorovskikh.task4;

import java.util.Random;

/**
 * 2. Фруктовая абстрактность
 * Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
 * Создайте следующие подклассы:
 *
 * ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
 * RedApplesFactory - которая создает только красные яблоки
 * GreenApplesFactory - которая создает только зеленые яблоки.
 * LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
 *
 * Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
 * Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */
public abstract class AbstractFabric {
    public static void main(String ... args)
    {
        System.out.println();
        System.out.println("Фруктовая абстрактность");

        AbstractFabric[] fabricArray = new AbstractFabric[10];
        Fruit[] fruitArray = new Fruit[20];
        for (int i = 0; i < fabricArray.length; ++i)
        {
            switch (new Random().nextInt(4))
            {
                case 0:
                    fabricArray[i] = new ThinOrangeFactory();
                    break;
                case 1:
                    fabricArray[i] = new RedApplesFactory();
                    break;
                case 2:
                    fabricArray[i] = new GreenApplesFactory();
                    break;
                case 3:
                default:
                    fabricArray[i] = new LongPineapplesFactory();
                    break;
            }
            fruitArray[2*i] = fabricArray[i].makeFruit();
            fruitArray[2*i+1] = fabricArray[i].makeFruit();
        }
        for (Fruit someFruit : fruitArray)
        {
            System.out.println(someFruit.toString());
        }
    }

    public abstract Fruit makeFruit();
}

/**
 * ThinOrangeFactory - создает только апельсины с толщиной кожуры от 1 до 5
 */
class ThinOrangeFactory extends AbstractFabric
{
    public Fruit makeFruit()
    {
        Orange someFruit;
        do
        {
            someFruit = new Orange();
        } while ((someFruit.getSkinThickness() < 1) || (5 < someFruit.getSkinThickness()) );
        return someFruit;
    }
}
/**
 * RedApplesFactory - создает только красные яблоки
 *
 */
class RedApplesFactory extends AbstractFabric
{
    public Fruit makeFruit()
    {
        Apple someFruit;

        do
        {
            someFruit = new Apple();
        } while (!someFruit.getAppleColor().equals("красное"));

        return someFruit;
    }
}
/**
 * GreenApplesFactory - которая создает только зеленые яблоки.
 */
class GreenApplesFactory extends AbstractFabric
{
    public Fruit makeFruit()
    {
        Apple someFruit;

        do
        {
            someFruit = new Apple();
        } while (!someFruit.getAppleColor().equals("зеленое"));

        return someFruit;
    }
}
/**
 * LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
 */
class LongPineapplesFactory extends AbstractFabric
{
    public Fruit makeFruit()
    {
        Pineapple someFruit;

        do
        {
            someFruit = new Pineapple();
        } while (someFruit.getTailHeight() < 11);

        return someFruit;
    }
}