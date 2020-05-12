package VostrikovaE.Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {

    static int[]  getRandomArray(int size){
        int[] Array = new int[size];
        Random  rnd=new Random();
        for (int i=0; i<Array.length; i++) {
            Array[i]= rnd.nextInt();
        }
        return Array;
    }


    public static void main(String[] args) {
        System.out.println("exercise 1");
        sumOfRandom();
        System.out.println("exercise 2");
        calculateOddAndEven();
        System.out.println("exercise 3");
        third();

    }

    static void sumOfRandom() {
        int[] Array = getRandomArray(10);
        int sum = 0;
        String resultString="";

        for (int i =0; i<Array.length; i++) {
            resultString=resultString+Array[i]+" ";
            sum += Array[i];
        }
        int min_value = Array[0];
        int min_index = 0;
        for(int i =0; i < Array.length; i++) {
            if (Array[i]<min_value) {
                min_value = Array[i];
                min_index = i;
            }
        }
        System.out.println("random array: " + resultString /*Arrays.toString(Array)*/);
        System.out.println("sum of elements is: " + sum);
        System.out.println("minimum element in array is " + min_value + " it's position in array is " + (min_index+1));
    }

    static  void calculateOddAndEven() {
        int[] randomArray = getRandomArray(5);
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

    static  void third(){
        final int arrayLength=7;
        int[] ArrayPositive=new int[arrayLength];
        int[] ArrayNegative = new int[arrayLength];
        int indexPositive = 0;
        int indexNegative = 0;
        Random rnd = new Random();
        int tmpRandom;
        while((indexPositive < arrayLength) || (indexNegative < arrayLength)) {
            tmpRandom = rnd.nextInt();
            if ((tmpRandom > 0) & (indexPositive < 7)) {
                ArrayPositive[indexPositive] = tmpRandom;
                indexPositive++;
            } else if ((tmpRandom < 0) & (indexNegative < 7)) {
                ArrayNegative[indexNegative] = tmpRandom;
                indexNegative++;
            }
        }
        System.out.println("array of positive random numbers :"+Arrays.toString(ArrayPositive));
        System.out.println("array of negative random numbers :"+Arrays.toString(ArrayNegative));
        int[] Array_sum=new int[arrayLength];
        for(int i=0;i<arrayLength; i++){
            Array_sum[i]=ArrayPositive[i]+ArrayNegative[i];
        }
        System.out.println("array of sum :"+Arrays.toString(Array_sum));
    }

}

