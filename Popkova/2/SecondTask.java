// The second task

public class SecondTask {

    private final static int ARRAY_SIZE = 5;

    public  static void main(String[] args) {
        int[] arr = new int[ARRAY_SIZE];
        makeArray(arr);
        printArray(arr);

        int[] evenAndOddCount = checkNums(arr);
        int[] evenNums = new int[evenAndOddCount[0]], oddNums = new int[evenAndOddCount[1]];
        divideArray(arr, evenNums, oddNums);

        System.out.print("The array with even numbers ");
        printArray(evenNums);
        System.out.print("The array with odd numbers ");
        printArray(oddNums);

        System.out.println("The avarage value of the arrays with even numbers is " + getAverageVal(evenNums));
        System.out.println("The avarage value of the arrays with odd numbers is " + getAverageVal(oddNums));
    }

    private static void makeArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] checkNums(int[] arr) {
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                ++evenCount;
            }
        }
        int oddCount = ARRAY_SIZE - evenCount;
        int[] evenAndOddCount = {evenCount, oddCount};
        return evenAndOddCount;
    }

    private static void divideArray(int[] arr, int[] evenNums, int[] oddNums) {
        int j = 0, k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
               evenNums[j++] = arr[i];
            }
            else {
                oddNums[k++] = arr[i];
            }
        }
    }

    private static float getAverageVal(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (float) sum / arr.length;
    }
}