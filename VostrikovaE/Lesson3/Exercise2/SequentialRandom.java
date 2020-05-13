package VostrikovaE.Lesson3.Exercise2;

import java.util.Random;

public class SequentialRandom {
    private int random;

    private static boolean initFlag;
    private static int previousRandomValue;
    public SequentialRandom() {
        if (initFlag) {
            random = previousRandomValue + 1;
            previousRandomValue++;
        }
        else   {
            Random rnd = new Random();
            random = rnd.nextInt();
            initFlag = true;
            previousRandomValue = random;

        }
    }
    public int getRandom() {
        return random;
    }

    public static void resetRandom() {
        initFlag = false;

    }

}
