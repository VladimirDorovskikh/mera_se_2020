package VostrikovaE.Lesson2.Exercise3;

import java.util.Arrays;
import java.util.Random;

public class RandomFill {
    public static void run() {
        final int arrayLength = 7;
        int[] ArrayPositive = new int[arrayLength];
        int[] ArrayNegative = new int[arrayLength];
        int indexPositive = 0;
        int indexNegative = 0;
        Random rnd = new Random();
        int tmpRandom;
        while ((indexPositive < arrayLength) || (indexNegative < arrayLength)) {
            tmpRandom = rnd.nextInt();
            if ((tmpRandom > 0) & (indexPositive < 7)) {
                ArrayPositive[indexPositive] = tmpRandom;
                indexPositive++;
            } else if ((tmpRandom < 0) & (indexNegative < 7)) {
                ArrayNegative[indexNegative] = tmpRandom;
                indexNegative++;
            }
        }
        System.out.println("array of positive random numbers :" + Arrays.toString(ArrayPositive));
        System.out.println("array of negative random numbers :" + Arrays.toString(ArrayNegative));
        int[] arraySum = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arraySum[i] = ArrayPositive[i] + ArrayNegative[i];
        }
        System.out.println("array of sum :" + Arrays.toString(arraySum));
    }
}
