package Lection_2;
import java.util.Random;

public class Random_div {
	public static void main(String[] args) {
		Random rand = new Random();
		int evenNums = 0;
		int [] iArray = new int [5];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = rand.nextInt()%100;
			if(iArray[i]%2 == 0){
				evenNums++;
			}
			}
		for(int i = 0; i<5; i++) {
			System.out.print(iArray[i] + " ");
    	}
		int [] iArray2 = new int[evenNums];
		int [] iArray3 = new int [5-evenNums];
		int index = 0;
		int index1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 0; i < 5; i++) {
			if(iArray[i]%2 == 0){
				iArray2[index] = iArray[i];
				sum2 = sum2 + iArray[i];
				index++;
			}
			else {
				iArray3[index1] = iArray[i];
				sum3 = sum3 + iArray[i];
				index1++;
			}
		}
		sum2 = sum2/evenNums;
		sum3 = sum3/(5-evenNums);
		
		System.out.println();
		for(int i = 0; i<evenNums; i++) {
			System.out.print(iArray2[i] + " ");
    	}
		System.out.println();
		for(int i = 0; i<(5-evenNums); i++) {
			System.out.print(iArray3[i] + " ");
    	}
		System.out.println();
		System.out.println("Cреднее значение четного массива" + sum2);
		System.out.println("Cреднее значение нечетного массива" + sum3);
	}
	}



