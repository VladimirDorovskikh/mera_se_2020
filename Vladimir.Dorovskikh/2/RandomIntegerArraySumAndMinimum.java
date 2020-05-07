/**
 * Задание 1. Случайности складываются
 * - Создать массив на 10 чисел типа int
 * - Заполнить массив случайными числами, используя класс Random и функцию nextInt()
 * - Вывести массив на экран одной строкой, разделив элементы пробелом
 * - Посчитать сумму всех элементов и вывести на экран
 * - Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */
public class RandomIntegerArraySumAndMinimum
{
    public static void run()
    {
        System.out.println();
        System.out.println("RandomIntegerArraySumAndMinimum");

        int localArraySize = 10;
        int[] randomIntegerArray = Task2.initRandomArray(localArraySize);
        Task2.printArray(randomIntegerArray);

        System.out.println("Array elements sum is : " + Task2.calculateArraySum(randomIntegerArray));

        int minorElementIndex = Task2.getMinorElementIndex(randomIntegerArray);
        System.out.println("Minor element with value " + randomIntegerArray[minorElementIndex] + " has index "+ minorElementIndex);
    }
}