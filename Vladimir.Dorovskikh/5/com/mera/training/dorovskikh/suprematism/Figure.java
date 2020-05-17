package com.mera.training.dorovskikh.suprematism;

import java.util.Random;

/**
 * Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
 * В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
 * В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
 * Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV
 */
public abstract class Figure
{
    public double centralPointX;
    public double centralPointY;

    abstract double square();

    public Figure()
    {
        this(new Random().nextDouble() * new Random().nextInt(), new Random().nextDouble() * new Random().nextInt());
    }

    public Figure(double centralPointX, double centralPointY)
    {
        this.centralPointX = centralPointX;
        this.centralPointY = centralPointY;
    }

    public pointQuadrant getQuadrant()
    {
        int a = 0;
        if (centralPointX < Math.abs(centralPointX))
        {
            a = 1;
        }
        if (centralPointY < Math.abs(centralPointY))
        {
            a ^= 3;
        }
        return (pointQuadrant.values())[a];
    }
}

