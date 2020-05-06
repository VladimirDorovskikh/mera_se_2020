import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        //ex.2
        Random rnd = new Random();
        ArrayFunctions af = new ArrayFunctions();

        System.out.println("Exercise 2");

        int [] secondArray = new int[5];
        af.fillArray(secondArray,rnd);
        System.out.println("Initial array:");
        af.printArray(secondArray);
        System.out.println();

        int [] evenArray = af.getSubArray(secondArray,true);
        int [] oddArray = af.getSubArray(secondArray,false);
        System.out.println("EvenSubArray:");
        af.printArray(evenArray);
        System.out.println("OddSubArray:");
        af.printArray(oddArray);
        System.out.println();
        System.out.println("Average of evenSubArray");
        System.out.println(af.average(evenArray));
        System.out.println("Average of oddSubArray");
        System.out.println(af.average(oddArray));
    }
}
