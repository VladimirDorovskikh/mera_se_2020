package com.mera.kalinina.lesson6.bikes;

/*
Задание 1. Велосипеды и контейнеры
Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
Используйте обощенный класс для этого (generic) с типом T.
- Реализуйте методы:
1. void add(T) - добавляет элемент  в коллекцию
2. boolean remove(T) - возвращает true, если элемент был найден и удален
3. T[] toArray() - возвращает массив из всех текущих элементов
4. int size()
5. T get(int) - взять элемент по индексу.

- Создайте класс Bycicle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
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

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("--------------Bicycle Test-------------------");
        MyArrayList<Bicycle> bikeArray = new MyArrayList<>(10);
        final int BICYCLE_NUMBER_TEST = 11;

        for (int i = 0; i < BICYCLE_NUMBER_TEST; i++) {
            int randomMaxSpeed = getRandomIntFromInterval(5, 50);
            String modelName = "Model_" + i;
            try {
                bikeArray.add(new Bicycle(modelName, randomMaxSpeed));
                System.out.println("New bicycle was added: " + modelName + "; maxSpeed: " + randomMaxSpeed);
            } catch (InvalidBicycleSpeedException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            } catch (MyArrayStoreException e) {
                System.out.println("New bicycle could not be added because array is full: " + modelName + "; maxSpeed: " + randomMaxSpeed);
            }
        }

        int randomMaxSpeed = getRandomIntFromInterval(5, 50);
        System.out.println("Remove all bicycles with maxSpeed < " + randomMaxSpeed);
        for (Object bike : bikeArray.toArray()) {
            if (((Bicycle) bike).getMaxSpeed() < randomMaxSpeed) {
                System.out.println("Remove " + bike.toString());
                bikeArray.remove((Bicycle) bike);
            }
        }
        System.out.println("Bicycle Array state after removing bicycles with maxSpeed < " + randomMaxSpeed);
        for (Object bike : bikeArray.toArray()) {
            System.out.println(bike);
        }

        System.out.println("--------------Integer Test-------------------");
        MyArrayList<Integer> integerArray = new MyArrayList<>(10);

        System.out.print("Integer array: ");
        for (int i = 0; i < 10; i++) {
            Integer randomInt = getRandomIntFromInterval(1, 10);
            integerArray.add(randomInt);
            System.out.print(randomInt + " ");
        }
        System.out.println();

        for (Object el : integerArray.toArray()) {
            if (((Integer) el) % 2 == 0) {
                System.out.println("Remove even integer: " + el);
                integerArray.remove((Integer) el);
            }
        }
        System.out.print("Integer Array state after removing even integers: ");
        for (Object el : integerArray.toArray()) {
            System.out.print(el + " ");
        }
    }

    public static int getRandomIntFromInterval(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }


}
