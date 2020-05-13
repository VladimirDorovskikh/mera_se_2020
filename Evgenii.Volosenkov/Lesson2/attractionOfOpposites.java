import java.util.Random;

public class attractionOfOpposites {
    private static void printArray(int[] arr)
    {
        for (int elem: arr)
        {
            System.out.print(elem +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxVal = Integer.MAX_VALUE;
        int[] posArray = new int[7];
        int[] negArray = new int[7];
        Random rand = new Random();
        for(int ind = 0; ind < posArray.length; ind++)
        {
            posArray[ind] = Math.abs(rand.nextInt())%maxVal;
            negArray[ind] = (Math.abs(rand.nextInt())%(maxVal-1))*-1;
        }
        printArray(posArray);
        printArray(negArray);
        int[] summArray = new int[7];
        for(int ind = 0; ind < posArray.length; ind++)
        {
            summArray[ind] = posArray[ind] + negArray[ind];
        }
        printArray(summArray);
    }
}
