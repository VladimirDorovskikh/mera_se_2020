import java.util.Scanner;

public class sumAndCompare
{
    private static Scanner scanner = new Scanner( System.in );

    //Integer getInteger(String arg)
    static Integer getInteger(String arg)
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
                //System.out.println("Please provide integer argument next time.");
                //System.exit(1);
            }
        } while (true);

        return num;
    }

    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        System.out.println("Compares and sums two integer from the arguments or user input " + args.length);
        //System.out.println("Number of arguments is " + args.length);

        /*sumAndCompare s = new sumAndCompare();
        Integer one = s.getInteger(args[0]);
        Integer two = s.getInteger(args[1]);*/
        Integer one = getInteger(args[0]);
        Integer two = getInteger(args[1]);

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
