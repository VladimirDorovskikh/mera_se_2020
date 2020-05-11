import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        //ex.1
        System.out.println("Exercise 1");
        int [] firstArray = new int[10];
        Random rnd = new Random();
        ArrayFunctions af = new ArrayFunctions();

        af.fillArray(firstArray,rnd);
        af.printArray(firstArray);

        System.out.print("Sum of array elements: ");
        System.out.println(af.sum(firstArray));

        af.printMinElement(firstArray);
    }
}
