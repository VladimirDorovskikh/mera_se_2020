import java.util.Random;

public class LessonTwoTaskTwo {

    public static void main(String[] args) {

        final int SIZE = 5, BOUND = 100;

        int[] array = new int[SIZE];

        Random random = new Random();

        int evenArraySize = 0;

        System.out.print("Array: ");

        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(BOUND);
            System.out.print(" " + array[i]);
            if (array[i] % 2 == 0) {
                evenArraySize++;
            }
        }

        int[] evenArray = new int[evenArraySize];
        int oddArraySize = SIZE - evenArraySize;
        int[] oddArray = new int[oddArraySize];
        int j = 0, k = 0;

        for (int i = 0; i < SIZE; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j++] = array[i];
            }
            else {
                oddArray[k++] = array[i];
            }
        }

        int evenSum = 0, oddSum = 0;

        System.out.print("\nEven array: ");
        for (int i = 0; i < evenArraySize; i++) {
            System.out.print(" " + evenArray[i]);
            evenSum += evenArray[i];
        }

        System.out.print("\nOdd array: ");
        for (int i = 0; i < oddArraySize; i++) {
            System.out.print(" " + oddArray[i]);
            oddSum += oddArray[i];
        }

        float evenAverage = 0, oddAverage = 0;

        if (evenArraySize != 0) {
            evenAverage = (float)evenSum/evenArraySize;
        }
        System.out.println("\nEven array average: " + evenAverage);

        if (oddArraySize != 0) {
            oddAverage = (float)oddSum/oddArraySize;
        }
        System.out.println("Odd array average: " + oddAverage);
    }
}