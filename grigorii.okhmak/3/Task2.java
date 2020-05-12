import java.util.*;

class SequentialRandom {
    static final int BOUND = 1000;
    static Random rand = new Random();
    static int previousValue = SequentialRandom.rand.nextInt(SequentialRandom.BOUND);
    private int mNumber = previousValue;
   
    public SequentialRandom() {
        mNumber = previousValue++;
    }

    public int get() {
        return mNumber;
    }
    static void resetRandom() {
        previousValue = rand.nextInt(SequentialRandom.BOUND);
    }
}

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            SequentialRandom sr = new SequentialRandom();
            System.out.println(sr.get());
            if (i % 5 == 0) {
                System.out.println("Reset ---------");
                SequentialRandom.resetRandom();
            }
        }       
    }
}