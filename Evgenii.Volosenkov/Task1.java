
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        Integer first = in.nextInt();
        System.out.println("Input second number");
        Integer second = in.nextInt();
	    System.out.println(
	            first>second? String.format("First Number %d greater than second number %d", first, second):
                first<second? String.format("First Number %d less than second number %d", first, second):
                              String.format("First number %d and second number %d are equivalent", first, second));
        System.out.println(String.format("Summ is %d", first + second));
    }
}
