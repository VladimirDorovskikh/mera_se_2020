package ru.mera;

public class Arrays {


    public static void main(String[] args) {

        // одномерные массивы
        int[] integers = new int[42];
        int anotherArray[] = new int[22];

        int[] arrayShortInit = {1, 2, 3, 4, 5};
        int[] arrayLongInit = new int[]{1, 2, 3, 4, 5, 6};



        // многомерные массивы
        int[][] twoDimensionShortInit = {{1,2,3},{1,2,3}};

        int[][] twoDimensionEmpty= new int[5][3];

        int[][] twoDimensionLadder = new int[3][];
        twoDimensionLadder[0] = new int[1];
        twoDimensionLadder[1] = new int[2];
        twoDimensionLadder[2] = new int[3];

        System.out.println(twoDimensionLadder.length);



    }
}
