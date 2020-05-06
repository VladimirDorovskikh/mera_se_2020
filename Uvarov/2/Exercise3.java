import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {

        //ex.3
        ArrayFunctions af = new ArrayFunctions();
        System.out.println("Exercise 3");
        int [] positiveArray = new int [7];
        int [] negativeArray = new int [7];

        af.fillArray(negativeArray, 1000,false);
        af.fillArray(positiveArray, 1000,true);

        System.out.println("Positive array:");
        af.printArray(positiveArray);
        System.out.println("Negative array:");
        af.printArray(negativeArray);

        int [] thirdArray = af.sumOfArrays(positiveArray,negativeArray);
        System.out.println("Sum of Arrays:");
        af.printArray(thirdArray);
    }
}
