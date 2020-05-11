//The first task

public class Main {

    private final static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] arr = new int[ARRAY_SIZE];
        makeAndPrintArray(arr);
        System.out.println();
        getAndPrintSum(arr);
        getAndPrintMinElem(arr);
    }

    private static void makeAndPrintArray(int[] arr) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
            System.out.print(arr[i] + " ");
        }
    }

    private static void getAndPrintSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма равна " + sum);
    }

    private static void getAndPrintMinElem(int[] arr) {
        int minElem = arr[0], minElemPos = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minElem) {
                minElem = arr[i];
                minElemPos = i;
            }
        }
        System.out.println("Минимальный элемент - " + minElem + " и его позиция " + minElemPos);
    }
}