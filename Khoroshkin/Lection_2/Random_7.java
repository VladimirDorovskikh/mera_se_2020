package Lection_2;
import java.util.Random;

public class Random_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		int [] iArray = new int [7];
		int [] iArray2 = new int[7];
		int [] iArray3 = new int[7];
		int randInt;
		for (int i = 0; i < iArray.length; i++) {
			randInt = rand.nextInt()%100;
		    while (randInt < 0) {
		    	randInt = rand.nextInt()%100;
		         }
		    iArray[i] = randInt;
		    System.out.print(iArray[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < iArray2.length; i++) {
			randInt = rand.nextInt()%100;
	            while (randInt > 0) {
	            	randInt = rand.nextInt()%100;
	            }
	            iArray2[i] = randInt;
	            System.out.print(iArray2[i] + " ");
	        }
		System.out.println();
     for (int i = 0; i < iArray3.length; i++) {
    	iArray3[i] = iArray[i] + iArray2[i];
    	System.out.print(iArray3[i] + " ");
    }
  }

}
