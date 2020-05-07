import java.util.Random;

public class SequentialRandom {
    private int value;
    static Random random = new Random();
    static int counter = random.nextInt();

    public SequentialRandom() {
        this.value = counter;
        counter++;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {

        SequentialRandom b = new SequentialRandom();
        System.out.println(b);
        SequentialRandom c = new SequentialRandom();
        System.out.println(c);
        SequentialRandom d = new SequentialRandom();
        System.out.println(d);
        resetRandom();
        SequentialRandom e = new SequentialRandom();
        System.out.println(e);
        SequentialRandom f = new SequentialRandom();
        System.out.println(f);
    }

    public static void resetRandom() {
        counter = random.nextInt();
    }

    @Override
    public String toString() {
        return "{" + value + '}';
    }
}