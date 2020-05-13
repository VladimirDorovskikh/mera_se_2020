package com.company;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main (String args[]){

        int[] positiveArray = new int[7];
        int[] negativeArray = new int[7];
        int[] sumArray = new int[7];
        Random random = new Random ();
        String negativeArrayString = "";
        String positiveArrayString = "";
        String sumArrayString = "";
        for (int i = 0; i < 7; i++)
        {
            negativeArray[i] = random.nextInt(50)-50;
            negativeArrayString = negativeArrayString + negativeArray[i] + " ";
            positiveArray[i] = random.nextInt(50);
            positiveArrayString = positiveArrayString + positiveArray[i] + " ";
            sumArray[i] = negativeArray[i] + positiveArray[i];
            sumArrayString = sumArrayString + sumArray[i] + " ";
        }
        System.out.println("Output of the positiveArray: " + positiveArrayString);
        System.out.println("Output of the negativeArray: " + negativeArrayString);
        System.out.println("Output of the sumArray:     " + sumArrayString);

    }

}

