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

public class Task3 {

    public static void main(String[] args) {

        int arraySize = 7;
        int[] positiveArray = new int[arraySize];
        int[] negativeArray = new int[arraySize];
        // Fill positive array
        int current = 0;
        while (current < positiveArray.length) {
            int tmp = new Random().nextInt();
            if (tmp > 0) {
                positiveArray[current++] = tmp;
            }
        }
        // Fill negative array
        current = 0;
        while (current < negativeArray.length) {
            int tmp = new Random().nextInt();
            if (tmp < 0) {
                negativeArray[current++] = tmp;
            }
        }

        System.out.print("Массив положительных чисел: ");
        ArrayUtils.printArray(positiveArray);
        System.out.print("Массив отрицательных чисел: ");
        ArrayUtils.printArray(negativeArray);

        int[] sumArray = new int[arraySize];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = positiveArray[i] + negativeArray[i];
        }
        System.out.println("Новый массив (значением на каждой позиции является сумма значений на позициях с тем же индексом из положительного и отрицательного массива): ");
        ArrayUtils.printArray(sumArray);

    }
}
