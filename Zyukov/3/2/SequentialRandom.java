import java.util.Random;

class SequentialRandom {
    private int number;
    private static int prevNumber;
    private static boolean init = true;

    SequentialRandom() {
        if (init) {
            number = new Random().nextInt();
            prevNumber = number;
            init = false;
        } else {
            number = ++prevNumber;
        }
    }

    public int getNumber() {
        return number;
    }

    public static void resentRandom() {
        init = true;
    }
}