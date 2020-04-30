package VostrikovaE.Lesson1;


public class CompareIntegers {

    public static void main(String[] args) {
        try {
            Integer first = Integer.parseInt(args[0]);
            Integer second = Integer.parseInt(args[1]);

            if (first.compareTo(second) == 0) {
                System.out.println("number " + first + " is equal to " + second);
            }
            if (first.compareTo(second) < 0) {
                System.out.println("number " + first + " is less then number " + second);
            }
            if (first.compareTo(second) > 0) {
                System.out.println("number " + first + " is greater then number " + second);
            }
            System.out.println("sum of numbers " + first + " and " + second + " is equal to " + (first + second));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }
}
