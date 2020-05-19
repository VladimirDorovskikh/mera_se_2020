package Lection_2;
import java.util.Random;

public class Random_sum {
	   public static int[] iArray;
	   public Random rand = new Random();
	 
	    Random_sum(int n) {
	        iArray = new int[n];
	    }
	    int[] randRandom_sum() {
	        for (int i = 0; i < iArray.length; i++) {
	            iArray[i] = rand.nextInt()%100;
	        }
	        return iArray;
	    }
	 
	   public static void main(String[] args) {
	    	Random_sum filler = new Random_sum(10);
	        for(int i: filler.randRandom_sum()) {
	            System.out.print(i + " ");
	        }
	    	int min = 0;
	    	int imin = 0;
			int sum = 0;
			   for( int i : iArray) {
			       sum = sum + i;
			   }
				for (int i = 0; i < iArray.length; i++) {
					if(iArray[i] < min) { min = iArray[i]; imin = i;}
				}
			System.out.println();   
			System.out.println("Сумма элементов массива равна: " + sum);	
			System.out.println("Минимальный элемент: " + min); 
			System.out.println("Индекс минимального элемента: " + imin);
	   } 	   
}

