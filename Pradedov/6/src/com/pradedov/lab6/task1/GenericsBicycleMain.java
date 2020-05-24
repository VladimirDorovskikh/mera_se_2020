package com.pradedov.lab6.task1;
/*
Дженерики и коллекции
(пожалуйста, делайте каждое задание в отдельном package'e)
Задание 1. Велосипеды и контейнеры
Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
Используйте обобщенный класс для этого (generic) с типом T.
- Реализуйте методы:
1. void add(T) - добавляет элемент  в коллекцию
2. boolean remove(T) - возвращает true, если элемент был найден и удален
3. T[] toArray() - возвращает массив из всех текущих элементов
4. int size()
5. T get(int) - взять элемент по индексу.

- Создайте класс Bicycle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
Переопределите equals и hashCode, который используют оба свойства велосипеда.
- Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
 Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
- Проверьте, что все методы работают правильно:
  1. Возьмите случайное число от 0 до 50.
  2. Удалите из коллекции все велосипеды со скоростью меньше этого случайного числа.


- Теперь создайте новый экземпляр MyArrayList
- Добавьте в него 10 случайных чисел от 1 до 10
- удалите все четные числа
- Выведите оставшиеся числа на экран.
 */

import java.util.Arrays;
import java.util.Random;

public class GenericsBicycleMain {
    public static void main(String[] args) {
        testBicycles();
        testIntegers();
    }

    private static void testBicycles() {
        final int MAX_SPEED_THRESHOLD = 50;
        final int MAX_BICYCLES = 11;

        System.out.println("\n\ntestBicycles");
        MyArrayList<Bicycle> myBicycleList = new MyArrayList<>();
        for (int i = 0; i < MAX_BICYCLES; i++) {
            Bicycle bike = new Bicycle();
            try {
                myBicycleList.add(bike);
                System.out.println("Added: " + bike.toString());
            }
            catch(MyArrayStoreException ex) {
                System.out.println("Failed to add " + bike + " due to exception: " + ex.toString());
            }
        }

        int speedThreshold = new Random().nextInt(MAX_SPEED_THRESHOLD);
        System.out.println("Remove bikes with speed less than " + speedThreshold);
        for (int idx = myBicycleList.size() - 1; idx >= 0; --idx) {
            Bicycle item = myBicycleList.get(idx);
            if (item.getMaxSpeed() < speedThreshold) {
                myBicycleList.remove(item);
            }
        }

        for (int idx = 0; idx < myBicycleList.size(); idx++) {
            System.out.println("bike: " + myBicycleList.get(idx).toString());
        }

    }

    private static void testIntegers() {
        final int ARRAY_SIZE = 10;
        final int MAX_RANGE = 10;
        Random random = new Random();

        System.out.println("\n\ntestIntegers");
        MyArrayList<Integer> myIntegerList = new MyArrayList<>();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            Integer value = random.nextInt(MAX_RANGE + 1);
            myIntegerList.add(value);
        }
        System.out.println("Initial array: " + Arrays.toString(myIntegerList.toArray()));

        for (int i = myIntegerList.size() - 1; i >= 0; i--) {
            Integer item = myIntegerList.get(i);
            if (0 == item % 2) {
                myIntegerList.remove(item);
            }
        }
        System.out.println("Modified array: " + Arrays.toString(myIntegerList.toArray()));
    }
}

