import java.util.Random;


public class SequentialRandom {
    private static class AdditionalStaticVariables
    {
        static Random rand = new Random();
        static boolean isUpdateCounter = true;
        static int randomCounter = 0;
        static int getRandom()
        {
            if(isUpdateCounter)
            {
                randomCounter = rand.nextInt();
                isUpdateCounter = false;
            }
            else
            {
                randomCounter++;
            }
            return randomCounter;
        }
    }
    private int randomValue;

    public SequentialRandom()
    {
        randomValue = AdditionalStaticVariables.getRandom();
    }

    public int getRandomValue() {
        return randomValue;
    }
    public static void resetRandom()
    {
        AdditionalStaticVariables.isUpdateCounter = true;
    }
}
