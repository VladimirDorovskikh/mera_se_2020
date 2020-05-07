package VostrikovaE.Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {

    static int[]  getRandomArray(int size){
        int[] Array = new int[size];
        Random rnd=new Random();
        for (int i=0; i<Array.length; i++) {
            Array[i]= rnd.nextInt();
        }
        return Array;
    }


    public static void main(String[] args) {
        System.out.println("exercise 1");
        sum_of_random();
        System.out.println("exercise 2");
        odd_and_even();
        System.out.println("exercise 3");
        third();

    }

    static void sum_of_random() {
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

    static  void odd_and_even() {
        int[] Array = getRandomArray(5);
        System.out.println("random array: " + Arrays.toString(Array));
        int[] Array_odd_tmp = new int[5];
        int[] Array_even_tmp = new int[5];
        int index_odd = 0;
        int index_even = 0;
        int sum_even = 0;
        int sum_odd = 0;
        for (int i=0; i<Array.length; i++) {
            if (Array[i] % 2 == 0) {
                Array_even_tmp[index_even] = Array[i];
                index_even++;
                sum_even += Array[i];
            } else {
                Array_odd_tmp[index_odd] = Array[i];
                index_odd++;
                sum_odd += Array[i];
            }
        }
        int[] Array_even=Arrays.copyOf(Array_even_tmp, index_even);
        int[] Array_odd=Arrays.copyOf(Array_odd_tmp, index_odd);
        System.out.println("array of even numbers :" + Arrays.toString(Array_even));
        System.out.println("array of odd numbers :" + Arrays.toString(Array_odd));
        if (index_even != 0) {
            System.out.println("average value for array of even numbers is " + sum_even / index_even);
        } else {
            System.out.println("no even numbers");
        }
        if (index_odd != 0) {
            System.out.println("average value for array of odd numbers is " + sum_odd/index_odd);
        } else {
            System.out.println("no odd numbers");
        }
    }

    static  void third(){
        final int array_length=7;
        int[] Array_positive=new int[array_length];
        int[] Array_negative = new int[array_length];
        int index_positive = 0;
        int index_negative = 0;
        Random rnd = new Random();
        int tmp_random;
        while((index_positive < array_length) || (index_negative < array_length)) {
            tmp_random = rnd.nextInt();
            if (tmp_random > 0) {
                Array_positive[index_positive] = tmp_random;
                index_positive++;
            } else if (tmp_random < 0) {
                Array_negative[index_negative] = tmp_random;
                index_negative++;
            }
        }
        System.out.println("array of positive random numbers :"+Arrays.toString(Array_positive));
        System.out.println("array of negative random numbers :"+Arrays.toString(Array_negative));
        int[] Array_sum=new int[array_length];
        for(int i=0;i<array_length; i++){
            Array_sum[i]=Array_positive[i]+Array_negative[i];
        }
        System.out.println("array of sum :"+Arrays.toString(Array_sum));
    }
}
