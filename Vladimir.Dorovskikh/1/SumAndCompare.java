import java.util.Scanner;

public class SumAndCompare
{
    private static Scanner scanner = new Scanner( System.in );

    static int getInteger(String arg)
    {
        int num;
        do {
            if(arg == null)
            {
                System.out.println("Please provide integer to compare and sum: ");
                arg = scanner.nextLine();
            }

            try {
                // Parse the string argument into an integer value.
                num = Integer.parseInt(arg);
                break;
            }
            catch (NumberFormatException nfe) {
                arg = null;
            }
        } while (true);

        return num;
    }

    public static void main(String[] args)
    {
        System.out.println("Compares and sums two integer from the arguments or user input " + args.length);

        int one = getInteger(args.length>0?args[0]:null);
        int two = getInteger(args.length>1?args[1]:null);

        if (one > two)
        {
            System.out.println(one + " is greater than " + two);
        }
        else if (one < two)
        {
            System.out.println(one + "  is less than  " + two);
        }
        else
        {
            System.out.println(one + " is equal to the " + two);
        }
        System.out.println(one + " + " + two + " = " + (one+two));
    }
}
