package com.company;


import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main (String args[]){

        int[] myArray = new int[5];
        Random random = new Random ();
        String MyArrayString = "";

        for (int i = 0; i < 5; i++)
        {
            myArray[i] = random.nextInt(50);
            MyArrayString = MyArrayString + myArray[i] + " ";
        }
        //output of the array option 1
        String myArrayString = Arrays.toString(myArray);
        System.out.println("Output of the array (option 1): " + myArrayString);
        //output of the array option 2
        System.out.println("Output of the array (option 2): " + MyArrayString);

        int[] evensArray = new int[5];
        int ei = 0;
        float eventsSum = 0;
        String evensArrayString = "";
        int[] oddsArray = new int[5];
        int oi = 0;
        float oddsSum = 0;
        String oddsArrayString = "";

        for (int i = 0; i < 5; i++)
        {
            if (myArray[i] % 2 == 0) {
                evensArray[ei] = myArray[i];
                evensArrayString = evensArrayString + evensArray[ei] + " ";
                eventsSum = eventsSum + evensArray[ei];
                ei++;
            }
            else {
                oddsArray[oi] = myArray[i];
                oddsArrayString = oddsArrayString + oddsArray[oi] + " ";
                oddsSum = oddsSum + oddsArray[oi];
                oi++;
            }
        }

        System.out.println("Output of the evensArray: " + evensArrayString);
        System.out.println("Srednee: " + (eventsSum / ei));
        System.out.println("Output of the oddsArray: " + oddsArrayString);
        System.out.println("Srednee: " + (oddsSum / oi));
    }

}

