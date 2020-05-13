package com.mera.gokhmak.les4;

/*
   Заполнить массив 4 случайными фруктами
 */
public class Task1 {
    public static void main(String[] args) {
        final int SIZE = 4;
        Fruit[] fruits = new Fruit[SIZE];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = Fruit.getRandomFruit();
        }
        // Output:
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }
}
