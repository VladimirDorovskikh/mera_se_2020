import java.util.Scanner;

public class Equations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Integer first = sc.nextInt();
        System.out.print("Enter second number: ");
        Integer second = sc.nextInt();

        System.out.println("sum = " + (first + second));

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        }
        if (first.equals(second)) {
            System.out.println(first + " equals " + second);
        }
        if (first < second) {
            System.out.println(first + " is lesser than " + second);
        }
    }
}