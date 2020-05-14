import java.util.Random;

class Ex2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] even = new int[5];
        int[] odd = new int[5];
        Random filler = new Random();
        int evenSize=0, oddSize=0;
        for (int i=0; i<5; i++ ) {
            nums[i]=filler.nextInt(20)+1;
            if (nums[i]%2==0) {
                even[evenSize]=nums[i];
                evenSize++;
            }
            else {
                odd[oddSize]=nums[i];
                oddSize++;
            }
        }
        System.out.print("Even array:");
        arrayProcessor(even, evenSize);
        System.out.print("Odd array:");
        arrayProcessor(odd, oddSize);
    }

    static void arrayProcessor(int[] numArray, Integer arraySize){
        if (arraySize==0){
            System.out.print(" empty\n\n");
            return;
        }
        // print array content and average value
        float average=0;
        for (int i=0; i<arraySize; i++){
            System.out.print(" "+numArray[i]);
            average+=(float)numArray[i];
        }
        average/=arraySize;
        System.out.print("\n");
        System.out.println("Avarage is "+average+"\n");

    }
}