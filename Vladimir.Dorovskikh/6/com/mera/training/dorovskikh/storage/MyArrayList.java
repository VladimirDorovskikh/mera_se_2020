package com.mera.training.dorovskikh.storage;

import java.util.ArrayList;

/**
 * Дженерики и коллекции
 * (пожалуйста, делайте каждое задание в отдельном package'e)
 * Задание 1. Велосипеды и контейнеры
 * Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
 * Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
 * Используйте обощенный класс для этого (generic) с типом T.
 * - Реализуйте методы:
 * 1. void add(T) - добавляет элемент  в коллекцию
 * 2. boolean remove(T) - возвращает true, если элемент был найден и удален
 * 3. T[] toArray() - возвращает массив из всех текущих элементов
 * 4. int size()
 * 5. T get(int) - взять элемент по индексу.
 */
public class MyArrayList<T> //extends ArrayList
{
    final int ELEMENTS_LIMIT = 10;
    int elementsCounter = 0;
    private T[] arrayListElement;

    @SuppressWarnings("unchecked")
    public MyArrayList()
    {
        arrayListElement = (T[]) new Object[ELEMENTS_LIMIT];
    }

    public static void printMyArrayList(MyArrayList<?> localMyArrayList)
    {
        try
        {
            System.out.println(localMyArrayList.get(0).getClass().getSimpleName() + " list:");
        } catch (MyArrayStoreException e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < localMyArrayList.size(); ++i)
        {
            try
            {
                System.out.println(localMyArrayList.get(i).toString());
            } catch (MyArrayStoreException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void add(T t) throws MyArrayStoreException
    {
        if (elementsCounter < ELEMENTS_LIMIT)
        {
            arrayListElement[elementsCounter] = t;
            ++elementsCounter;
        }
        else
        {
            throw new MyArrayStoreException("Limit of "+ELEMENTS_LIMIT+" elements is reached.");
        }
    }


    public boolean remove(T t)
    {
        boolean result = false;
        for (int i = 0; i < elementsCounter; ++i)
        {
            if (result)
            {
                arrayListElement[i-1] = arrayListElement[i];
            }
            if (arrayListElement[i].equals(t))
            {
                result = true;
            }
        }
        if (result)
        {
            --elementsCounter;
        }
        return result;
    }


    public T[] toArray()
    {
        return arrayListElement;
    }

    public int size()
    {
        return elementsCounter;
    }

    public T get(int index) throws MyArrayStoreException
    {
        if (index <= elementsCounter)
        {
            return arrayListElement[index];
        }
        throw new MyArrayStoreException("No element["+index+"] exists. "+this.getClass()+" has "+this.size()+" elements.");
    }

}
