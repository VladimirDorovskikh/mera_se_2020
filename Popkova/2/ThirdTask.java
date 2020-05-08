//The third task

public class ThirdTask {

    private final static int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        int[] positiveArr = new int[ARRAY_SIZE], negativeArr = new int[ARRAY_SIZE];
        makeArrays(positiveArr, negativeArr);

        System.out.print("The fist array with positive elements is  ");
        printArray(positiveArr);
        System.out.print("The fist array with negative elements is  ");
        printArray(negativeArr);

        int[] sumArr = new int[ARRAY_SIZE];
        makeSumArr(sumArr, positiveArr, negativeArr);
    }

    private static void makeArrays(int[] firstArr, int[] secondArr) {
        Random random = new Random();
        int i = 0, j = 0;
        while(i < firstArr.length || j < secondArr.length) {
            int value = random.nextInt(100) - 50;
            if(value > 0 && i < firstArr.length) {
                firstArr[i++] = value;
            }
            if(value < 0 && j < secondArr.length) {
                secondArr[j++] = value;
            }
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void makeSumArr(int[] sumArr, int[] firstArr, int[] secondArr) {
        for(int i = 0; i < firstArr.length; i++) {
            sumArr[i] = firstArr[i] + secondArr[i];
        }
    }
}