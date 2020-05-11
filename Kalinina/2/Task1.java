/*
Задание 1. Случайности складываются
- Создать массив на 10 чисел типа int
- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
- Вывести массив на экран одной строкой, разделив элементы пробелом
- Посчитать сумму всех элементов и вывести на экран
- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */

public class Task1 {

        public static void main(String[] args) {

            int arraySize = 10;
            int[] array = new int[arraySize];
            ArrayUtils.fillArrayRandom(array);

            System.out.print("Массив: ");
            ArrayUtils.printArray(array);

            int arraySum = ArrayUtils.sumOfArrayElements(array);
            System.out.println("Сумма всех элементов массива: " + arraySum);

            int minElementIndex = 0;
            int minElement = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minElement) {
                    minElement = array[i];
                    minElementIndex = i;
                }
            }
            System.out.println("Минимальный элемент массива: " + minElement + "; индекс минимального элемента в массиве: " + minElementIndex);
        }

}
