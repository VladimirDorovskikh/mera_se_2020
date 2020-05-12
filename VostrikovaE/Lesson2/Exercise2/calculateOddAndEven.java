package VostrikovaE.Lesson2.Exercise2;

import VostrikovaE.Lesson2.Util;

import java.util.Arrays;

public class calculateOddAndEven {
    public static  void run() {
        int[] randomArray = Util.getRandomArray(5);
        System.out.println("random array: " + Arrays.toString(randomArray));
        int[] arrayOddTmp = new int[5];
        int[] arrayEvenTmp = new int[5];
        int indexOdd = 0;
        int indexEven = 0;
        double sumEven = 0.0;
        double sumOdd = 0.0;
        for (int i=0; i<randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                arrayEvenTmp[indexEven] = randomArray[i];
                indexEven++;
                sumEven += randomArray[i];
            } else {
                arrayOddTmp[indexOdd] = randomArray[i];
                indexOdd++;
                sumOdd += randomArray[i];
            }
        }
        int[] arrayEven=Arrays.copyOf(arrayEvenTmp, indexEven);
        int[] arrayOdd=Arrays.copyOf(arrayOddTmp, indexOdd);
        System.out.println("array of even numbers :" + Arrays.toString(arrayEven));
        System.out.println("array of odd numbers :" + Arrays.toString(arrayOdd));
        if (indexEven != 0) {
            System.out.println("average value for array of even numbers is " + sumEven / indexEven);
        } else {
            System.out.println("no even numbers");
        }
        if (indexOdd != 0) {
            System.out.println("average value for array of odd numbers is " + sumOdd/indexOdd);
        } else {
            System.out.println("no odd numbers");
        }
    }

}
