package ru.mera;

import java.util.Arrays;

public class BlocksOfCode {

    public static final String STRING_CONSTANT = "some string";


    public static void main(String[] args) {
        final int arraySize = 5;
        printArraySize();


        if (arraySize > 0) {
            int[] array = new int[5];
            for (int i = 0; i < arraySize; i++) {
                int someVariable = i;
                // array size доступен здесь
                array[i] = arraySize - i;
            }

            //System.out.println(someVariable); - someVariable здесь недоступна.

            Arrays.toString(array);// здесь array доступен
        }

        // а здесь array недоступен
        {
            // а это просто блок кода
            int i = 0;
        }

        int i = 42;

        System.out.println(i);

       // arraySize = 43;

    }

    public static void printArraySize() {
            // arraySize из main здесь недоступна - можено переопределить.
        int arraySize = 42;
        System.out.println(arraySize);

    }


}

class AnotherClass {
    //STRING_CONSTANT здесь недоступна
  /*   static String getString() {
        return STRING_CONSTANT;
    }*/



}