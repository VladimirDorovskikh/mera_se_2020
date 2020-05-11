import java.util.Arrays;
import java.util.Random;

public class RandomSummary {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random arrRandom = new Random();
        int sum = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = arrRandom.nextInt();
            sum += array[i];
            System.out.print(array[i] + " ");
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("\nSum = " + sum);
        //System.out.println(Arrays.toString(array));
        System.out.println("Min element = " + array[indexMin] + " with index = " + indexMin);
    }
}