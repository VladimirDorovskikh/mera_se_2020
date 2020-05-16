package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SequentialRandom sequentialRandom1 = new SequentialRandom();
        SequentialRandom sequentialRandom2 = new SequentialRandom();
        System.out.println("sequentialRandom1 = " + sequentialRandom1.getSequentialRandom());
        System.out.println("sequentialRandom2 = " + sequentialRandom2.getSequentialRandom());

        SequentialRandom.resetRandom();
        System.out.println("After method resetRandom()");
        SequentialRandom sequentialRandom3 = new SequentialRandom();
        System.out.println("sequentialRandom3 = " + sequentialRandom3.getSequentialRandom());
        SequentialRandom sequentialRandom4 = new SequentialRandom();
        System.out.println("sequentialRandom4 = " + sequentialRandom4.getSequentialRandom());

    }
}
class SequentialRandom{

    private int privatClassValue;
    static private Random random = new Random();
    static private int counter = random.nextInt();

   SequentialRandom(){
       privatClassValue = counter++;
    }

    public int getSequentialRandom(){
         return privatClassValue;
    }
    static public void resetRandom(){
        Random r = new Random ();
        counter = r.nextInt();
    }
}