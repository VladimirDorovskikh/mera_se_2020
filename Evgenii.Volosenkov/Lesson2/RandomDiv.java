import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDiv {
    private static void printArray(Integer[] arr)
    {
        for (int elem: arr)
        {
            System.out.print(elem +" ");
        }
        System.out.println();
    }

    private static double arrayAvg(Integer[] arr)
    {
        int summ = 0;
        if ( arr.length==0)
        {
            return .0;
        }
        for ( int elem: arr)
        {
            summ+=elem;
        }

        return (double) summ / (double) arr.length;
    }
    public static void main(String[] args)
    {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        Random rand = new Random();
        Integer[] mass = new Integer[5];
        for(int ind = 0; ind < mass.length; ind++)
        {
            mass[ind] = rand.nextInt();
        }
        for(int massElem:mass)
        {
            if ( (massElem&1)==0)
            {
                evenList.add(massElem);
            }
            else
            {
                oddList.add(massElem);
            }
        }
        Integer[] evenArray = new Integer[evenList.size()];
        Integer[] oddArray = new Integer[oddList.size()];
        evenArray = evenList.toArray(evenArray);
        oddArray = oddList.toArray(oddArray);
        printArray(mass);
        System.out.println("Even Array:");
        printArray(evenArray);
        System.out.println("Average of even array is " + arrayAvg(evenArray));
        System.out.println("Odd Array:");
        System.out.println("Average of odd array is " + arrayAvg(oddArray));
        printArray(oddArray);
    }
}
