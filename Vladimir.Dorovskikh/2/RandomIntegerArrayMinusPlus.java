/**
 * Задание 3. Противоположности притигиваются
 * - Создайте два массива на 7 элементов.
 * - Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
 * Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
 * - Выведите оба массива на экран
 * - Создайте новый массив на 7 элементов.
 * Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.
 */
public class RandomIntegerArrayMinusPlus {
    public static void run()
    {
        System.out.println();
        System.out.println("RandomIntegerArrayMinusPlus");

        int localArraySize = 7;
        int[] plusIntegerArray = Task2.initPositiveArray(localArraySize);
        Task2.printArray(plusIntegerArray);

        int[] minusIntegerArray = Task2.initNegativeArray(localArraySize);
        Task2.printArray(minusIntegerArray);

        int[] mergedIntegerArray = new int[localArraySize];
        for(int i = 0; i < localArraySize; ++i)
        {
            mergedIntegerArray[i] = plusIntegerArray[i] + minusIntegerArray[i];
        }
        Task2.printArray(mergedIntegerArray);
    }
}
