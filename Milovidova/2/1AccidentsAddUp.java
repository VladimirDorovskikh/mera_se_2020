
import java.util.Arrays;
import java.util.Random;
public class hello {
	public static void main (String args[]){

		int[] myArray = new int[10];
		Random random = new Random (); 
		int sum = 0;
		String MyArrayString = "";
		
		for (int i = 0; i < 10; i++)
		{
			myArray[i] = random.nextInt(50);
			sum = sum + myArray[i];
			MyArrayString = MyArrayString + myArray[i] + " ";
		}
		//output of the array option 1
		String myArrayString = Arrays.toString(myArray);
		System.out.println("Output of the array (option 1): " + myArrayString);
		//output of the array option 2
		System.out.println("Output of the array (option 2): " + MyArrayString);
		System.out.println("Sum of array elements = " + sum);
		//output of the minimum element option 1
		System.out.println("Output of the minimum element (option 1). MinElement ="); 
		var min = Arrays.stream(myArray).min();
	    System.out.println(min.isPresent() ? min.getAsInt() : "empty array");	
	    //output of the minimum element option 2
	    System.out.println("Output of the minimum element (option 2).");
	    int MinElement = myArray[0];
		int IndexMinElement = 0;
	    for (int i = 0; i < 10; i++)
		{
	    	if (myArray[i] < MinElement)
	    	{
	    		MinElement = myArray[i];
	    		IndexMinElement = i;
	    	}
	    				
		}
	    System.out.println("MinElement = " + MinElement);  
	    System.out.println("IndexMinElement = " + IndexMinElement);
	}
	
}

