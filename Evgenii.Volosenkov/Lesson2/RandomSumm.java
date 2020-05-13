import java.util.Random;

public class RandomSumm {

    public static void main(String[] args) {
	    int[] mass= new int[10];
        Random rand = new Random();
        for (int ind =0; ind <mass.length; ind++)
        {
            mass[ind] = rand.nextInt();
        }

        for (int massElem:mass)
        {
            System.out.print(massElem + " ");
        }
        System.out.println();
        int summ = mass[0];
        int minVal=mass[0];
        int minInd = 0;
        for (int ind =1; ind <10; ind++)
        {
            summ += mass[ind];
            if ( mass[ind] < minVal)
            {
                minVal = mass[ind];
                minInd = ind;
            }
        }
        System.out.println(String.format("Summ is %d", summ));
        System.out.println(String.format("%d element with value %d is minimum in array", minInd, minVal));
    }
}


