import java.util.Random;

public class SequentialRandom {

    private int value;

    final static int BOUND = 1000;
    private static int randomValue = new Random().nextInt(BOUND);

    public SequentialRandom() {
        value = randomValue++;
    }

    public int getValue() {
        return value;
    }

    static void resetRandom() {
        randomValue = new Random().nextInt(BOUND);
    }
}