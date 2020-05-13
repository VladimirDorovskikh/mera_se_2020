package VostrikovaE.Lesson2;

import java.util.Random;

public class Util {

    public static int[]  getRandomArray(int size){
        int[] Array = new int[size];
        Random rnd=new Random();
        for (int i=0; i<Array.length; i++) {
            Array[i]= rnd.nextInt();
        }
        return Array;
    }

}
