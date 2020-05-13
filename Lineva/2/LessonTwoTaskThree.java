import java.util.Random;

public class LessonTwoTaskThree {

    public static void main(String[] args) {

        final int SIZE = 7;

        Random random = new Random();

        int[] positiveArray = new int[SIZE];
        int[] negativeArray = new int[SIZE];

        int i = 0, j = 0;

        while ((i < SIZE) || (j < SIZE))
        {
            int num = random.nextInt();

            if ((num > 0) && (i < SIZE)) {
                positiveArray[i++] = num;
            }
            else if ((num < 0) && (j < SIZE)){
                negativeArray[j++] = num;
            }
        }

        System.out.print("\nPositive array: ");
        for (int k = 0; k < positiveArray.length; k++) {
            System.out.print(" " + positiveArray[k]);
        }

        System.out.print("\nNegative array: ");
        for (int k = 0; k < negativeArray.length; k++) {
            System.out.print(" " + negativeArray[k]);
        }

        int[] array = new int[SIZE];
        for (int k = 0; k < array.length; k++) {
            array[k] = positiveArray[k] + negativeArray[k];
        }

        System.out.print("\nArray of sum: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(" " + array[k]);
        }
    }
}