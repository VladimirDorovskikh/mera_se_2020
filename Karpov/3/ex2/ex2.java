import java.util.Random;

class Ex2 {
    public static void main(String[] args) {

        /* to check option from comment */
        SequentialRandom a = new SequentialRandom();
        SequentialRandom b = new SequentialRandom();
        SequentialRandom c = new SequentialRandom();

        System.out.println(a.getValue()); // random value
        System.out.println(b.getValue()); // random value+1
        System.out.println(c.getValue()); // random value+2

        demonstrateRandom(3);
        System.out.println("Reset...");
        SequentialRandom.resetRandom();
        demonstrateRandom(3);


    }

    private static void demonstrateRandom(int itertions){
        System.out.println("Start generation...");
        for (int i = 0; i<itertions; i++){
            SequentialRandom demoRandom = new SequentialRandom();
            int demoValue = demoRandom.getValue();
            System.out.print(demoValue+" ");
        }
        System.out.print("\n");
    }
}

class SequentialRandom{
    Random filler = new Random();
    private static int previousValue;
    private int value;
    private static boolean reset=true;

    SequentialRandom(){
        if (reset==true){
            value=filler.nextInt();
            previousValue=value;
            reset=false;
        }
        else {
            previousValue++;
            value=previousValue;
        }
    }
    public static void resetRandom(){
        reset=true;
    }

    public int getValue() {
        return value;
    }
}