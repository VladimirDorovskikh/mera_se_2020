import java.util.Random;

public class SequentialRandom {
    private static int id = new Random().nextInt(500);

    public SequentialRandom() {
        id++;
    }

    public int getId() {
        return id;
    }

    public static void resetRandom() {
        Random rnd = new Random();
        id = rnd.nextInt(500);
    }

}
