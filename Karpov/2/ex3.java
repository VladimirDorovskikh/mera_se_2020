import java.util.Random;

class Ex3 {
    private static final int ARR_SIZE = 7;

    public static void main(String[] args) {
        Integer[] positive = new Integer[ARR_SIZE];
        Integer[] negative = new Integer[ARR_SIZE];
        Integer[] summ = new Integer[ARR_SIZE];
        Random filler = new Random();
        for (int i=0; i<7; i++ ) {
            do {
                positive[i]=filler.nextInt();
            } while (positive[i]<=0);
            do {
                negative[i]=filler.nextInt();
            } while (negative[i]>=0);
            summ[i]=positive[i]+negative[i];
        }
        System.out.print("Positive:");
        arrayPrinter(positive);
        System.out.print("Negative:");
        arrayPrinter(negative);
        System.out.print("Summ array:");
        arrayPrinter(summ);
    }

    private static void arrayPrinter(Integer[] numArray){
        int i=0;
        float average=0;
        while(i<ARR_SIZE){
            System.out.print("\t"+numArray[i]);
            i++;
        }
        System.out.print("\n");
    }
}