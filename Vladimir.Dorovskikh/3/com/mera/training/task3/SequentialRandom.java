package com.mera.training.task3;

import java.util.Random;

/**
 * Задание 2. Случайности - не случайны
 * Создать класс SequentialRandom с одним полем типа int.
 * Значение поле можно только прочитать, но не изменить (используйте модифиактор private на поле и создайте только getter)
 * Значение этого int вычисляется по следующим правилом:
 * - Значение для первого созданного объекта - случайное
 * - значение для каждого следующего на 1 больше, чем предыдущее
 * - У класса есть статический метод resetRandom(), который делает значение следующего созданного объекта - случайным.
 *
 *
 *
 * Например
 * new SequentialRandom() // содержит 5 (случайное)
 * new SequentialRandom() // содержит 6 (на 1 больше)
 * new SequentialRandom() // содержит 7 (на 1 больше)
 * SequentialRandom.resetRandom()
 * new SequentialRandom() // содержит 42 (случайное
 * new SequentialRandom() // содержит 43) (на 1  больше)
 *
 *
 *
 * Подсказка: Используйте статическую переменную в классе, чтобы хранить значение предыдущего объекта.
 */
public class SequentialRandom {
    private int numberValue;
    private static int previouseNumber;
    private static boolean alreadyInitiated;

    public int getNumberValue() {
        return numberValue;
    }

    public SequentialRandom() {
        if(alreadyInitiated){
            numberValue = ++previouseNumber;
        }
        else{
            numberValue = new Random().nextInt();
            alreadyInitiated = true;
        }
        previouseNumber = numberValue;
    }

    public static void resetRandom() {
        alreadyInitiated = false;
    }

    public static void main(String ... args) {
        System.out.println();
        System.out.println("SequentialRandom");

        System.out.println((new SequentialRandom()).getNumberValue());
        System.out.println((new SequentialRandom()).getNumberValue());
        System.out.println((new SequentialRandom()).getNumberValue());
        SequentialRandom.resetRandom();
        System.out.println((new SequentialRandom()).getNumberValue());
        System.out.println((new SequentialRandom()).getNumberValue());
    }
}
