package VostrikovaE.Lesson2.Exercise1;

import VostrikovaE.Lesson2.Util;

public class sumOfRandom {
    public  static void run() {
        int[] randomArray = Util.getRandomArray(10);
        int sum = 0;
        String resultString="";

        for (int i =0; i<randomArray.length; i++) {
            resultString=resultString+randomArray[i]+" ";
            sum += randomArray[i];
        }
        int minValue = randomArray[0];
        int minIndex = 0;
        for(int i =0; i < randomArray.length; i++) {
            if (randomArray[i]<minValue) {
                minValue = randomArray[i];
                minIndex = i;
            }
        }
        System.out.println("random array: " + resultString /*Arrays.toString(Array)*/);
        System.out.println("sum of elements is: " + sum);
        System.out.println("minimum element in array is " + minValue + " it's position in array is " + (minIndex+1));
    }
}
