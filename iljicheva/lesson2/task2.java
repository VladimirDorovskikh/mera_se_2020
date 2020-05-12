package iljicheva.lesson2;

import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        int indexArray = 5;
        int indexEvenNumbers = 0;
        int indexNotEvenNumbers = 0;

        int[] fiveRandomNumbers = new Random().ints(indexArray, 0, 110).toArray();

        int[] evenNumsArray;
        int[] notEvenNumsArray;
        do{
            if(fiveRandomNumbers[--indexArray]%2 == 0){
                indexEvenNumbers++;
            } else {
                indexNotEvenNumbers++;
            }
        } while (indexArray != 0);
        printArray(fiveRandomNumbers, "All nums");


        if(indexEvenNumbers != 0){
            evenNumsArray = new int[indexEvenNumbers];
            for(int i = 0; i < fiveRandomNumbers.length; i++){
                if(fiveRandomNumbers[i]%2 == 0){
                    evenNumsArray[indexArray++] = fiveRandomNumbers[i];
                }
            }
            printArray(evenNumsArray, "Even nums");
            calculateAverageValue(evenNumsArray, "Average value of even numbers");
        } else {
            System.out.println("We have not even numbers");
        }

        indexArray = 0;
        if(indexNotEvenNumbers != 0){
            notEvenNumsArray = new int[indexNotEvenNumbers];
            for(int i = 0; i < fiveRandomNumbers.length; i++){
                if(fiveRandomNumbers[i]%2 != 0){
                    notEvenNumsArray[indexArray++] = fiveRandomNumbers[i];
                }
            }
            printArray(notEvenNumsArray, "Not even nums");
            calculateAverageValue(notEvenNumsArray, "Average value of not even numbers");
        } else {
            System.out.println("We have not not even numbers");
        }

    }

    public static void printArray(int[] array, String stepName){
        String resultStr = "";
        for(int i = 0; i < array.length; i++){
            resultStr += array[i] + " ";
        }
        System.out.println(stepName + ": " + resultStr);
    }
    public static void calculateAverageValue(int[] array, String stepName){
        double result = 0;
        for (double num : array){
            result += num;
        }
        result /= array.length;
        System.out.println(stepName + ": " + result);
    }
}
