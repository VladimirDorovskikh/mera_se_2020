/*
Задание 2. Случайности расходятся
- Создать массив на 5 элементов типа int и вывести на экран
- Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
- Найти среднее значение в каждом массива и вывести их на экран
*/

import com.sun.xml.internal.ws.streaming.TidyXMLStreamReader;

import java.util.Random;

public class MainDivergence
{
    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();
        int evenNumber = 0;

        // Fill in array and calculate all required values
        for (int idx = 0; idx < ARRAY_SIZE; ++idx) {
            array[idx] = random.nextInt();

            if (0 == array[idx] % 2) {
                evenNumber++;
            }
        }

        int [] evenArray = new int[evenNumber];
        int [] oddArray = new int[ARRAY_SIZE - evenNumber];
        long evenSum = 0L;
        long oddSum = 0L;

        for (int idx = 0, evenIdx = 0, oddIdx = 0; idx < ARRAY_SIZE; ++idx) {
            if (0 == array[idx] % 2) {
                evenArray[evenIdx++] = array[idx];
                evenSum += array[idx];
            }
            else {
                oddArray[oddIdx++] = array[idx];
                oddSum += array[idx];
            }
        }

        // Output arrays
        System.out.print("Even Array data: ");
        for (int value: evenArray) {
            System.out.print(value + " ");
        }
        System.out.print("\nOdd Array data: ");
        for (int value: oddArray) {
            System.out.print(value + " ");
        }
        System.out.println(" ");

        // Calculate and output arrays' average
        float avgEven = evenArray.length !=0 ? (float)evenSum/evenArray.length : 0;
        float avgOdd = oddArray.length !=0 ? (float)oddSum/oddArray.length : 0;
        System.out.println("Even array average value: " + avgEven);
        System.out.println("Odd array average value:  " + avgOdd);
    }

}