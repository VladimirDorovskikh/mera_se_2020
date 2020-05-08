import java.util.Random;

public class ArrayUtils {

    public static void fillArrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public static int sumOfArrayElements(int[] array) {
        int arraySum = 0;
        for (int element : array) {
            arraySum += element;
        }
        return arraySum;
    }

}
