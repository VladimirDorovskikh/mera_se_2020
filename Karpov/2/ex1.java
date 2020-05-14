import java.util.Random;

class Ex1 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[10];
        Integer min, max, summ=0;
        Random filler = new Random();
        // initialize first element, min, max
        nums[0]=filler.nextInt(10)+1;
        min = nums[0];
        max = nums[0];
        summ+=nums[0];
        // start array print
        System.out.print(nums[0]);
        // fill array and print every new element
        for (int i=1; i<10; i++ ) {
            nums[i]=filler.nextInt(10)+1;
            summ+=nums[i];
            if (nums[i]<min) min = nums[i];
            if (nums[i]>max) max = nums[i];
            System.out.print(" "+nums[i]);
        }
        System.out.print("\n");
        // print min, max, summ
        System.out.println("Min is: "+min+"\nMax is: "+max+"\nSumm is: "+summ);
    }
}