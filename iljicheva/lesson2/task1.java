package iljicheva.lesson2;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        String lineAllNumbers = "";
        int sumNumbers = 0;
        int[] tenRandomNumbers = new Random().ints(10, 0, 110).toArray();
        for(int i = 0; i < 10; i++){
            lineAllNumbers += tenRandomNumbers[i] + " ";
            sumNumbers += tenRandomNumbers[i];
        }
        int indexTheSmallestNumber = 0;
        int valueTheSmallestNumber = tenRandomNumbers[0];
        for(int i = 1; i < 10; i++){
            if(tenRandomNumbers[indexTheSmallestNumber] > tenRandomNumbers[i]){
                indexTheSmallestNumber = i;
                valueTheSmallestNumber = tenRandomNumbers[i];
            }
        }
        System.out.println("Array: " + lineAllNumbers);
        System.out.println("Sum all numbers : " + sumNumbers);
        System.out.printf("The smallest number have index: %d and value: %d",
                indexTheSmallestNumber, valueTheSmallestNumber);
    }
}
