/*
Задание 2. Случайности расходятся
- Создать массив на 5 элементов типа int и вывести на экран
- Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
- Найти среднее значение в каждом массива и вывести их на экран
 */

public class Task2 {

    public static void main(String[] args) {

        int arraySize = 5;
        int[] array = new int[arraySize];
        ArrayUtils.fillArrayRandom(array);

        System.out.print("Массив: ");
        ArrayUtils.printArray(array);


        int oddArraySize = 0;
        int evenArraySize = 0;
        for (int element : array) {
            if(element % 2 == 0) {
                evenArraySize++;
            }
            else {
                oddArraySize++;
            }
        }
        int[] oddArray = new int[oddArraySize];
        int[] evenArray = new int[evenArraySize];
        for (int i = 0, j = 0, k = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j++] = array[i];
            }
            else {
                oddArray[k++] = array[i];
            }
        }
        System.out.print("Массив нечетных чисел: ");
        ArrayUtils.printArray(oddArray);
        System.out.print("Массив четных чисел: ");
        ArrayUtils.printArray(evenArray);

        int oddArrayMeanValue = ArrayUtils.sumOfArrayElements(oddArray)/oddArray.length;
        System.out.println("Среднее значение массива нечетных чисел: " + oddArrayMeanValue);

        int evenArrayMeanValue = ArrayUtils.sumOfArrayElements(evenArray)/evenArray.length;
        System.out.println("Среднее значение массива четных чисел: " + evenArrayMeanValue);

    }
}
