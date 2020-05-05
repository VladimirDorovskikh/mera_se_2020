/*
Задание 3. Противоположности притигиваются
- Создайте два массива на 7 элементов.
- Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
- Выведите оба массива на экран
- Создайте новый массив на 7 элементов.
Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.
*/

import java.util.Random;

public class MainZip
{
    private static final int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        int[] positiveArr = new int[ARRAY_SIZE];
        int[] negativeArr = new int[ARRAY_SIZE];
        boolean arraysFilledIn = false;
        int positiveIdx = 0;
        int negativeIdx = 0;
        Random random = new Random();

        // Fill in arrays
        do {
            int tmp = random.nextInt();
            if (tmp >= 0 && positiveIdx < ARRAY_SIZE) {
                positiveArr[positiveIdx++] = tmp;
            }
            else if (tmp < 0 && negativeIdx < ARRAY_SIZE) {
                negativeArr[negativeIdx++] = tmp;
            }
        } while (positiveIdx < ARRAY_SIZE || negativeIdx < ARRAY_SIZE);

        // Print both arrays
        System.out.print("Positive Array data: ");
        for (int value: positiveArr) {
            System.out.print(value + " ");
        }
        System.out.print("\nNegative Array data: ");
        for (int value: negativeArr) {
            System.out.print(value + " ");
        }

        // zip arrays
        int[] zip = new int[ARRAY_SIZE];
        for (int idx = 0; idx < ARRAY_SIZE; idx++) {
            zip[idx] = positiveArr[idx] + negativeArr[idx];
        }

        // print zipped array
        System.out.print("\nZipped Array data:   ");
        for (int value: zip) {
            System.out.print(value + " ");
        }
    }
}
