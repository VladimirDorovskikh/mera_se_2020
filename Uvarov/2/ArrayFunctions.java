import java.util.Random;

public class ArrayFunctions {

    public void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int sum(int[] array){
        int result = 0;
        for (int i=0; i<array.length;i++){
            result += array[i];
        }
        return result;
    }

    public int average(int[] array){
        int sum = 0;
        for (int i=0; i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public void printMinElement(int[] array){
        int result = array[0];
        int indexOfMin = 0;
        for(int i=0; i<array.length;i++){
            if (array[i]<result){
                result = array[i];
                indexOfMin = i;
            }
        }
        System.out.println("Minimal element: " + result);
        System.out.println("Index of minimal element: " + indexOfMin );
    }

    public int [] fillArray(int[] array, Random rnd){
        for (int i=0; i<array.length;i++){
            array[i] = rnd.nextInt(1000);
        }
        return array;
    }

    public int [] fillArray(int [] array, int bound, boolean isPositive){
        int count = 0;
        int positive = isPositive ? 0 : bound;
        Random rnd = new Random();
        while(count < array.length){
            array[count] = rnd.nextInt(bound)- positive;
            count++;
        }
        return array;
    }

    public int [] sumOfArrays(int[] firstArray, int [] secondArray){
        int [] result = new int[firstArray.length];

        for (int i=0; i<result.length;i++){
            result[i] = firstArray[i]+secondArray[i];
        }
        return result;
    }

    public int [] getSubArray(int [] array, boolean evenness){
        int count = 0;
        int even = evenness ? 0 : 1;

        for(int i =0; i<array.length; i++){
            if (Math.abs(array[i]%2) == even){
                count++;
            }
        }

        int [] result = new int [count];
        count = 0;
        for(int i =0; i<array.length; i++){
            if (array[i]%2 == even){
                result[count] = array[i];
                count++;
            }
        }
        return result;
    }

}
