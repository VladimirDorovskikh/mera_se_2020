import java.util.Random;

public class SequentialRandom {

    private int seq;

    static int prevSeq = new Random().nextInt(100);

    public SequentialRandom(){
        seq = prevSeq++;
    }

    public int getSeq() {
        return seq;
    }

    static public void resetRandom() {
        prevSeq = new Random().nextInt(100);
    }

}
