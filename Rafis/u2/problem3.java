/**
 * Задание 3. Противоположности притигиваются
 * - Создайте два массива на 7 элементов.
 * - Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
 * Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
 * - Выведите оба массива на экран
 * - Создайте новый массив на 7 элементов.
 * Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.
 */

package Rafis.u2;

import java.util.Random;

public class problem3 {
    static int ArrSize = 7;
    Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args)
    {
        problem3 p = new problem3();

        Integer[][] arrays = new Integer[2][];
        arrays[0] = new Integer[ArrSize]; // pos
        arrays[1] = new Integer[ArrSize]; // neg

        for (int i = 0; i < ArrSize; i++) {
            arrays[0][i] = p.getRandomized(false);
            arrays[1][i] = p.getRandomized(true);
        }

        p.printArr(arrays[0], "+");
        p.printArr(arrays[1], "-");
        p.printArr(p.sumArrays(arrays), "S");
    }

    private int getRandomized(boolean isNegative)
    {
        int retVal = 0;
        do
        {
            retVal = rnd.nextInt();
        } while ((retVal == 0) || ((retVal < 0) != isNegative));

        return retVal;
    }

    private void printArr(Integer[] arr, String str)
    {
        System.out.print("Elements in array (" + str + ") : ");
        for (Integer i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private Integer[] sumArrays(Integer[][] arrays)
    {
        Integer[] retArr = new Integer[ArrSize];
        for (int i = 0; i < ArrSize; i++) {
            retArr[i] = arrays[0][i] + arrays[1][i];
        }

        return retArr;
    }
}
