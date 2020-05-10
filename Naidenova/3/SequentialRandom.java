import java.util.Random;

public class SequentialRandom {
    private int readOnly;           //private readOnly class field
    static int increase = new Random().nextInt(10000);

    public SequentialRandom() {     //Constructor with readOnly arg
        this.readOnly = increase;
        increase++;                     //increase + 1
    }

    int getReadOnly() {             //get method to return readOnly field
        return readOnly;
    }

    public String toString() {      //toString method to output view for user
        return readOnly + "\n";
    }

    public static void resetRandom() {
        increase = new Random().nextInt(10000);
    }


    public static void main(String[] args) {
        System.out.println(new SequentialRandom());         //print random digit
        System.out.println(new SequentialRandom());
        System.out.println(new SequentialRandom());
        SequentialRandom.resetRandom();                     //reset random digit
        System.out.println(new SequentialRandom());         //print random digit after reset
        System.out.println(new SequentialRandom());
        System.out.println(new SequentialRandom());
    }
}

