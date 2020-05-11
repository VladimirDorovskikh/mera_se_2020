/**
 * Задание 2. Случайности расходятся
 * - Создать массив на 5 элементов типа int и вывести на экран
 * - Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
 * - Найти среднее значение в каждом массива и вывести их на экран
 */

package Rafis.u2;

import java.util.ArrayList;
import java.util.Random;

public class problem2 {
    static int ArrSize = 5;

    public static void main(String[] args)
    {
        problem2 p = new problem2();
        Random rnd = new Random(System.currentTimeMillis());

        Integer[] arr = new Integer[ArrSize];

        for (int i = 0; i < ArrSize; i++) {
            arr[i] = rnd.nextInt(11) - 5; // (-5; 5)
        }

        p.printArr(arr, "All"); // print all elements
        ArrayList<Integer>[] arrays = p.separateArrAndPrint(arr); // print elements in separated arrays
        p.findMeanValueAndPrint(arrays); // print mean values for arrays
    }

    private void printArr(Integer[] arr, String str)
    {
        System.out.print(str + " elements in array: ");
        for (Integer i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private ArrayList<Integer>[] separateArrAndPrint(Integer[] arr)
    {
        ArrayList<Integer>[] retVal = new ArrayList[2];
        retVal[0] = new ArrayList<Integer>();
        retVal[1] = new ArrayList<Integer>();

        for (int i: arr)
        {
            if (i % 2 == 0)
            {
                retVal[0].add(i);
            }
            else
            {
                retVal[1].add(i);
            }
        }

        printArr(retVal[0].toArray(Integer[]::new), "Even");
        printArr(retVal[1].toArray(Integer[]::new), "Odd");

        return retVal;
    }

    private void findMeanValueAndPrint(ArrayList<Integer>[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            Integer meanVal = 0;

            for (Integer val: arr[i]) {
                meanVal += val;
            }

            System.out.println("Mean value for " + ((i == 0) ? "even" : "odd") + " array is " + ((float)meanVal / arr[i].size()));
        }
    }

}
