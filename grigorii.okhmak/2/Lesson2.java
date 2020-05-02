import java.util.*;

public class Lesson2 {
    
    /*
     * - Создать массив на 10 чисел типа int
     * - Заполнить массив случайными числами, используя класс Random и функцию nextInt()
     * - Вывести массив на экран одной строкой, разделив элементы пробелом
     * - Посчитать сумму всех элементов и вывести на экран
     * - Найти минимальный элемент и вывести на экран его индекс в массиве и значение
     */
    static void taskRoutine1() {
        System.out.println("Task 1. Accidents add up");
        Integer[] array = Utilities.makeRandomArray(10);
        int maxValue = array[0];
        int minValue = array[0];
        int sum = 0;
        System.out.print(tab + "Elements: ");
        for (Integer value : array) {
            System.out.print(value + " ");
            sum += value;
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println();
        System.out.println(tab + "Sum: "           + sum);
        System.out.println(tab + "Maximum value: " + maxValue);
        System.out.println(tab + "Minimum value: " + minValue);
    }

    /*
     * - Создать массив на 5 элементов типа int и вывести на экран
     * - Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
     * - Найти среднее значение в каждом массива и вывести их на экран
     */
    static void taskRoutine2() {
        System.out.println("Task 2. Accidents diverge");
        Integer[] array = Utilities.makeRandomArray(5);
        Integer[] oddElements = new Integer[5],
                  evenElements = new Integer[5];
        int lastOdd = 0;
        int lastEven = 0;
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        System.out.print(tab + "Elements: ");
        for (Integer value : array) {
            System.out.print(value + " ");
            if (value % 2 == 0) {
                evenElements[lastEven++] = value;
                sumOfEvens += value;
            } else {
                oddElements[lastOdd++] = value;
                sumOfOdds += value;
            }
        }
        System.out.println();
        Utilities.printArray(evenElements, true, tab + "Even elements: ");
        System.out.printf("%sAverage value of even values: %.4f\n", tab, (sumOfEvens != 0 ? (double)sumOfEvens / lastEven : 0));
        Utilities.printArray(oddElements, true, tab + "Odd elements: ");
        System.out.printf("%sAverage value of odd values: %.4f\n", tab, (sumOfOdds != 0 ? (double)sumOfOdds / lastOdd : 0));
    }

    /*
     * Создать два массива из 7 элементов. Первый из них должен содержать только положительные случайные числа, второй - только отрицательные.
     * Создать третий массив из 7 элементов и заполнить его суммой элементов первого и второго массива по одинаковым индексам.
     */
    static void taskRoutine3() {
        System.out.println("Task 3. Opposites attract");
        Integer[] positiveArray = Utilities.makeRandomArray(7, true);
        Integer[] negativeArray = Utilities.makeRandomArray(7, false);
        Utilities.printArray(positiveArray, true, tab + "Positive array: ");
        Utilities.printArray(negativeArray, true, tab + "Negative array: ");
        Integer[] sumArray = new Integer[7];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = positiveArray[i] + negativeArray[i];
        }
        Utilities.printArray(sumArray, true, tab + "Sum array: ");
    }
    public static void main(String[] args) {
        int task = 0;  // Демонстрируемое задание.
                       // Если не в диапазоне 1-3, то демонстрирует всё.
        if (args.length > 0) {
            try {
                task = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) { }
        }
        switch (task) {
            case 1:
                taskRoutine1();
                break;
            case 2:
                taskRoutine2();
                break;
            case 3:
                taskRoutine3();
                break;
            default:
                taskRoutine1();
                taskRoutine2();
                taskRoutine3();
                break;
        }
    }
    static String tab = "   ";
}

class Utilities {
    /**
     * Создает массив заполненный случайными целыми числами.
     * 
     * @param size Размер массива
     * @return Ссылку на массив
     */
    static Integer[] makeRandomArray(int size) {
        Random rand = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        return array;
    }
    /**
     * Создает массив заполненный случайными целыми числами.
     * 
     * @param size Размер массива
     * @param isPositive Если true, то числа в массиве будут только положительные.
     *                   Если false, то числа в массиве будут только отрицательные
     * @return Ссылку на массив
     */
    static Integer[] makeRandomArray(int size, boolean isPositive) {
        Random rand = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            int randValue = rand.nextInt();
            if (isPositive) {
                if (randValue < 0) {
                    randValue *= -1.;
                }
            } else {
                if (randValue > 0) {
                    randValue *= -1.;
                }
            }
            array[i] = randValue;
        }
        return array;
    }
    /**
     * Печатает массив целых чисел одной строчкой.
     * 
     * @param array Выводимый массив
     * @param skipNull Если true, то null-элементы будут пропускаться.
     * @param prefix Строка, которая предшествует печати
     */
    static void printArray(Integer[] array, boolean skipNull, String prefix) {
        if (prefix == null) {
            prefix = "";
        }
        System.out.print(prefix);
        for (Integer value : array) {
            if (value == null && skipNull) {
                continue;
            }
            System.out.print(value + " ");
        }
        System.out.println();
    }
}