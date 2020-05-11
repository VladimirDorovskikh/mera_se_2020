/**
 * Задание 2. Случайности расходятся
 * - Создать массив на 5 элементов типа int и вывести на экран
 * - Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
 * - Найти среднее значение в каждом массива и вывести их на экран
 */
public class RandomIntegerArrayEvenOdd
{
    public static void run()
    {
        System.out.println();
        System.out.println("RandomIntegerArrayEvenOdd");

        int localArraySize = 5;
        int[] randomIntegerArray = Task2.initRandomArray(localArraySize);
        Task2.printArray(randomIntegerArray);

        int evenIntegerArrayIndex=0;
        int oddIntegerArrayIndex=0;
        for(int i = 0; i < localArraySize; ++i)
        {
            if ( (randomIntegerArray[i] & 1) == 0)
            {
                evenIntegerArrayIndex++;
            }
            else
            {
                oddIntegerArrayIndex++;
            }
        }

        int[] evenIntegerArray = new int[evenIntegerArrayIndex];
        int[] oddIntegerArray = new int[oddIntegerArrayIndex];
        evenIntegerArrayIndex=0;
        oddIntegerArrayIndex=0;

        for(int i = 0; i < localArraySize; ++i)
        {
            if ( (randomIntegerArray[i] & 1) == 0)
            {
                evenIntegerArray[evenIntegerArrayIndex++] = randomIntegerArray[i];
            }
            else
            {
                oddIntegerArray[oddIntegerArrayIndex++] = randomIntegerArray[i];
            }
        }
        System.out.print("Even array: ");
        Task2.printArray(evenIntegerArray);
        System.out.println("Even array average is " + Task2.getAverage(evenIntegerArray));

        System.out.print("Odd array: ");
        Task2.printArray(oddIntegerArray);
        System.out.println("Odd array average is " + Task2.getAverage(oddIntegerArray));
    }
}
