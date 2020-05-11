import java.util.Random;

public class Task2
{
    public static int[] initRandomArray(int localArraySize)
    {
        int[] localArray = new int[localArraySize];
        for (int i = 0; i < localArraySize; ++i)
        {
            localArray[i] = new Random().nextInt();
        }
        return localArray;
    }

    public static int[] initPositiveArray(int localArraySize)
    {
        int[] localArray = new int[localArraySize];
        for (int i = 0; i < localArraySize; ++i)
        {
            localArray[i] = ((new Random().nextInt() ) & 0x7FFFFFFF);
        }
        return localArray;
    }

    public static int[] initNegativeArray(int localArraySize)
    {
        int[] localArray = new int[localArraySize];
        for (int i = 0; i < localArraySize; ++i)
        {
            localArray[i] = ((new Random().nextInt() ) | 0x80000000);
        }
        return localArray;
    }

    public static void printArray(int[] localArray)
    {
        for (int i : localArray)
        {
            System.out.print (i +" ");
        }
        System.out.println();
    }


    public static long calculateArraySum(int[] localArray)
    {
        long totalArraySum = 0;
        for (int i : localArray)
        {
            totalArraySum += i;
        }
        return totalArraySum;
    }

    public static int getMinorElementIndex(int[] localArray)
    {
        int minorElementIndex = 0;
        for (int i = 1; i < localArray.length; ++i)
        {
            if (localArray[i] < localArray[minorElementIndex])
            {
                minorElementIndex = i;
            }
        }
        return minorElementIndex;
    }

    public static double getAverage(int[] localArray)
    {
        double result = 0;
        for (double i : localArray)
        {
            result += (i / localArray.length);
        }
        return result;
    }

    public static void main(String[] args)
    {
        RandomIntegerArraySumAndMinimum.run();
        RandomIntegerArrayEvenOdd.run();
        RandomIntegerArrayMinusPlus.run();
    }
}
