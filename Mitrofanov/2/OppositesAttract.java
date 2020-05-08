import java.util.Arrays;
import java.util.Random;

public class OppositesAttract {

    public static void main(String[] args) {

        int[] arrayPos = new int[7];
        int[] arrayNeg = new int[7];
        int[] arraySum = new int[7];
        int test;

        Random arrRandom = new Random();

        for (int i = 0; i < arrayPos.length; i++) {
            test = arrRandom.nextInt();
            while (test < 0) {
                test = arrRandom.nextInt();
            }
            arrayPos[i] = test;
        }
        for (int i = 0; i < arrayNeg.length; i++) {
            test = arrRandom.nextInt();
            while (test > 0) {
                test = arrRandom.nextInt();
            }
            arrayNeg[i] = test;
        }
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = arrayPos[i] + arrayNeg[i];
        }
        System.out.println(Arrays.toString(arrayPos));
        System.out.println(Arrays.toString(arrayNeg));
        System.out.println(Arrays.toString(arraySum));
    }
}
