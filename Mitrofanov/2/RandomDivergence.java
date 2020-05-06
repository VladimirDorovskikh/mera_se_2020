import java.util.Arrays;
import java.util.Random;

public class RandomDivergence {
    public static void main(String[] args) {

        int[] array = new int[5];
        int[] arrOdd = new int[5];
        int[] arrEven = new int[5];
        int odd = 0;
        int sumOdd = 0;
        int even = 0;
        int sumEven = 0;
        Random arrRandom = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = arrRandom.nextInt();
            if (array[i] % 2 == 0) {
                arrEven[even] = array[i];
                sumEven += arrEven[even];
                even++;
            } else {
                arrOdd[odd] = array[i];
                sumOdd += arrOdd[odd];
                odd++;
            }
        }
        System.out.println("Initial array = " + Arrays.toString(array));
        System.out.println("Array of odds = " + Arrays.toString(arrOdd));
        //System.out.println(odd);
        if (0 != odd) {
            System.out.println("Mean of odds = " + (sumOdd / odd));
        }
        System.out.println("Array of even = " + Arrays.toString(arrEven));
        //System.out.println(even);
        if (0 != even) {
            System.out.println("Mean of even = " + (sumEven / even));
        }
    }
}
