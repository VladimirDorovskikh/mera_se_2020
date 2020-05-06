import java.util.Random;

class ex2 {
    public static void main(String[] args) {
        int nums[] = new int[5];
        int even[] = new int[5];
        int odd[] = new int[5];
        Random filler = new Random();
        for (int i=0, j=0, k=0; i<5; i++ ) {
            nums[i]=filler.nextInt(20)+1;
            if (nums[i]%2==0) {
                even[j]=nums[i];
                j++;
            }
            else {
                odd[k]=nums[i];
                k++;
            }
        }
        System.out.print("Even array:");
        arrayProcessor(even, even.length);
        System.out.print("Odd array:");
        arrayProcessor(odd, odd.length);
    }

    static void arrayProcessor(int[] numArray, Integer arraySize){
        int i;
        float average=0;
        for (i=0; i<arraySize && numArray[i]!=0; i++){
            System.out.print(" "+numArray[i]);
            average+=(float)numArray[i];
        }
        System.out.print("\n");
        System.out.println("Avarage is "+(average/=i)+"\n");

    }
}