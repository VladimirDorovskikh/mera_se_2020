package com.mera.training.dorovskikh.storage;

import java.util.Objects;
import java.util.Random;

/**
 * - Создайте класс Bycicle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
 * Переопределите equals и hashCode, который используют оба свойства велосипеда.
 * - Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
 *  Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
 */
public class Bycicle
{
    String modelName;
    int maxSpeed;// (от 5 до 50км\ч)

    Bycicle()
    {
        maxSpeed = new Random().nextInt(46)+5;
        String[] modelNames = {"Alpine bike","Юность","Школьник","Atom","Benelli","Challenger","Cyberbike","Merida","Land Rover","Trek","Schwinn","Orion"};
        modelName = modelNames[new Random().nextInt(modelNames.length)];
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bycicle bycicle = (Bycicle) o;
        return maxSpeed == bycicle.maxSpeed &&
                Objects.equals(modelName, bycicle.modelName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(modelName, maxSpeed);
    }

    @Override
    public String toString()
    {
        return "Bycicle{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void removeSlow(MyArrayList<Bycicle> bycicleMyArrayList, int speedLimit)
    {
        System.out.println("Speed limit: " + speedLimit);
        try
        {
            int i = 0;
            do
            {
                Bycicle tempBycicle = bycicleMyArrayList.get(i);

                if (tempBycicle.maxSpeed < speedLimit)
                {
                    bycicleMyArrayList.remove(tempBycicle);
                }
                else
                {
                    ++i;
                }
            } while (i < bycicleMyArrayList.size());
        } catch (MyArrayStoreException e)
        {
            e.printStackTrace();
        }
    }

    public static void refillStock(MyArrayList<Bycicle> bycicleMyArrayList)
    {
        Bycicle tempBycicle;
        for (int i = 0; i < 12; i++)
        {
            tempBycicle = new Bycicle();
            try
            {
                bycicleMyArrayList.add(tempBycicle);
            } catch (MyArrayStoreException e)
            {
                System.out.println(tempBycicle.toString() + " doesn't feet MyArrayList.");
                break;
            }
        }
        System.out.println();
    }
}
