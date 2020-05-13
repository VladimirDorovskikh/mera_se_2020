import java.util.Random;

public class LessonTwoTaskOne {

    public static void main(String[] args) {

        final int SIZE = 10, BOUND = 100;

        int[] array = new int[SIZE];

        Random random = new Random();

        array[0] = random.nextInt(BOUND);
        int sum = array[0];
        int minIndex = 0;
        System.out.print("Array: " + array[0]);

        for (int i = 1; i < SIZE; i++) {
            array[i] = random.nextInt(BOUND);
            sum += array[i];
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            System.out.print(" " + array[i]);
        }

        System.out.println("\nSum is " + sum);
        System.out.println("Min is " + array[minIndex] + " with index " + minIndex);

    }
}