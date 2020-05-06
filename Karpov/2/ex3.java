import java.util.Random;

class ex3 {
    private static final int ARR_SIZE = 7;

    public static void main(String[] args) {
        Integer[] nums1 = new Integer[ARR_SIZE];
        Integer[] nums2 = new Integer[ARR_SIZE];
        Integer[] summ = new Integer[ARR_SIZE];
        Random filler = new Random();
        for (int i=0; i<7; i++ ) {
            nums1[i]=filler.nextInt(20)+1;
            nums2[i]=-(filler.nextInt(20)+1);
            summ[i]=nums1[i]+nums2[i];
        }
        System.out.print("Array 1:");
        arrayPrinter(nums1);
        System.out.print("Array 2:");
        arrayPrinter(nums2);
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