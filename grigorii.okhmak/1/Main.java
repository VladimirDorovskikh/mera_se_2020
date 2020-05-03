public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: need two numeric arguments");
            System.exit(1);
        }
        try {
            Integer number1 = Integer.parseInt(args[0]),
                    number2 = Integer.parseInt(args[1]);
            if (number1 == number2) {
                System.out.println("Numbers are equal");
            } else if (number1 < number2) {
                System.out.println("Number " + number1 + " is less than " + number2);
            } else {
                System.out.println("Number " + number1 + " is greater than " + number2);
            }
            System.out.println("Sum of numbers is " + (number1 + number2));
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}