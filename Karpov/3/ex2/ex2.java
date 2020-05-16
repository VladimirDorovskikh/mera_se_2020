import java.util.Random;

class Ex2 {
    public static void main(String[] args) {
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
    static private int value;
    static private boolean reset=true;

    SequentialRandom(){
        if (reset==true){
            value=filler.nextInt();
            reset=false;
        }
        else {
            value++;
        }
    }
    public static void resetRandom(){
        reset=true;
    }

    public static int getValue() {
        return value;
    }
}