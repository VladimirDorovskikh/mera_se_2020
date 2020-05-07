/*
Задание 1. Случайности складываются
- Создать массив на 10 чисел типа int
- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
- Вывести массив на экран одной строкой, разделив элементы пробелом
- Посчитать сумму всех элементов и вывести на экран
- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
*/

import java.util.Random;

public class MainConvergence
{
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        long sum = 0L;
        int min = array[0];
        int minIdx = 0;
        Random random = new Random();

        // Fill in array and calculate all required values
        for (int idx = 0; idx < ARRAY_SIZE; ++idx) {
            array[idx] = random.nextInt();

            sum += array[idx];

            if (array[idx] < min) {
                min = array[idx];
                minIdx = idx;
            }
        }

        // Print array
        System.out.println("Array is:");
        for (int idx = 0; idx < ARRAY_SIZE; ++idx) {
            System.out.print(array[idx] + " ");
            if(ARRAY_SIZE - 1 == idx) {
                System.out.println(" ");
            }
        }

        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Minimum value is:  " + min
                + "\nIndex in array is: " + minIdx);
    }

}