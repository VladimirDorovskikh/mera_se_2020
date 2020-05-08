/**
 * Задание 1. Случайности складываются
 * - Создать массив на 10 чисел типа int
 * - Заполнить массив случайными числами, используя класс Random и функцию nextInt()
 * - Вывести массив на экран одной строкой, разделив элементы пробелом
 * - Посчитать сумму всех элементов и вывести на экран
 * - Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */

package Rafis.u2;

import java.util.Random;

public class problem1 {
    static int ArrSize = 10;

    public static void main(String[] args)
    {
        problem1 p = new problem1();
        Random rnd = new Random(System.currentTimeMillis());

        int[] arr = new int[ArrSize];

        for (int i = 0; i < ArrSize; i++) {
            arr[i] = rnd.nextInt(11) - 5; // (-5; 5)
        }

        p.printArr(arr);
        p.printArrSum(arr);
        p.printMinVal(arr);
    }

    private void printArr(int[] arr)
    {
        System.out.print("Elements in array: ");
        for (int i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private void printArrSum(int[] arr)
    {
        long sum = 0;

        System.out.print("Sum of elements in array: ");
        for (int i: arr)
        {
            sum += i;
        }
        System.out.print(sum + "\n");
    }

    private void printMinVal(int[] arr)
    {
        int minVal = 0x7fffffff;
        int minIndex = 0;

        System.out.print("Lowest element in array: ");
        for (int i = 0; i < ArrSize; i++) {
            if (arr[i] < minVal)
            {
                minVal = arr[i];
                minIndex = i;
            }
        }
        System.out.print(minVal + " and its index: " + minIndex + "\n");
    }
}
