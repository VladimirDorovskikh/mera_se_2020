import java.util.Random;

public class FindArrayElements {
    public static void main(String[] args) {
        // Задание 1. Случайности складываются
        //
        // 1.1 Создать массив на 10 чисел типа int
        // 1.2 Заполнить массив случайными числами, используя класс Random и функцию nextInt()
        // 1.3 Вывести массив на экран одной строкой, разделив элементы пробелом
        // 1.4 Посчитать сумму всех элементов и вывести на экран
        // 1.5 Найти минимальный элемент и вывести на экран его индекс в массиве и значение

        int[] iArray = new int[10];
        Random random = new Random();
        Integer sum = 0;
        int indexMin = 0;
        int valueMin = iArray[0];

        System.out.println("Задание 1. Случайности складываются");
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = random.nextInt();
            System.out.print(iArray[i] + " ");
            sum += iArray[i];
            if (iArray[i] < valueMin){
                valueMin = iArray[i];
                indexMin = i;
            }
        }
        System.out.printf("\nCумма всех элементов: %d", sum);
        System.out.printf("\nМинимальный элемент: (индекс) %d, (значение) %d\n\n", indexMin, valueMin);

        // Задание 2. Случайности расходятся
        //
        // 2.1 Создать массив на 5 элементов типа int и вывести на экран
        // 2.2 Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
        // 2.3 Найти среднее значение в каждом массива и вывести их на экран

        int[] jArray = new int[] {88, -27, 15, -4, 36};
        sum = 0;
        int evenNums = 0;
        int oddNums = 0;

        System.out.println("Задание 2. Случайности расходятся");
        for (int value : jArray) {
            System.out.print(value + " ");
            sum += value;
            if (((Integer) (value % 2)).equals(0)) {
                evenNums++;
            } else {
                oddNums++;
            }
        }
        System.out.printf("\nСреднее значение в первом массиве: %f\n", (double)sum/jArray.length);

        int[] jeArray = new int[evenNums];
        int[] joArray = new int[oddNums];
        for (int i = 0, ie = 0, io = 0; i < jArray.length; i++) {
            sum += jArray[i];
            if (((Integer) (jArray[i] % 2)).equals(0)) {
                jeArray[ie++] = jArray[i];
            }
            else {
                joArray[io++] = jArray[i];
            }
        }

        sum = 0;
        for (int value : jeArray) {
            System.out.print(value + " ");
            sum += value;
        }
        System.out.printf("\nСреднее значение в массиве четных чисел: %f\n", (double)sum/jeArray.length);

        sum = 0;
        for (int value : joArray) {
            System.out.print(value + " ");
            sum += value;
        }
        System.out.printf("\nСреднее значение в массиве нечетных чисел: %f\n\n", (double)sum/joArray.length);

        // Задание 3. Противоположности притигиваются
        //
        // 3.1 Создайте два массива на 7 элементов.
        // 3.2 Используюте функцию Random.nextInt() чтобы полностью заполнить два массива:
        //     в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
        //     Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
        // 3.3 Выведите оба массива на экран
        // 3.4 Создайте новый массив на 7 элементов.
        //     Значение на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.

        int[] k1Array = new int[7];
        int[] k2Array = new int[7];
        Random rand = new Random();
        System.out.println("Задание 3. Противоположности притигиваются");

        int k1 = 0;
        while (k1 < k1Array.length) {
            k1Array[k1] = rand.nextInt();
            if (k1Array[k1] > 0) {
                System.out.print(k1Array[k1] + " ");
                ++k1;
            }
        }

        System.out.println();
        int k2 = 0;
        while (k2 < k2Array.length) {
            k2Array[k2] = rand.nextInt();
            if (k2Array[k2] < 0) {
                System.out.print(k2Array[k2] + " ");
                ++k2;
            }
        }

        System.out.println();
        Integer[] k3Array = new Integer[7];
        int k3 = 0;
        while (k3 <k3Array.length) {
            k3Array[k3] = (Integer) (k1Array[k3]) + (Integer) (k2Array[k3]);
            System.out.print(k3Array[k3] + " ");
            ++k3;
        }
    }
}
