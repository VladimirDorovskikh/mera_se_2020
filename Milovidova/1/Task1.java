
public class Main {
	public static void main (String args[]){

		int var1 = 47;
		int var2 = 47;
					
		if (var1 > var2)
		{
			System.out.println("var1 is more then var2" );
		} 
		else if (var1 < var2)
		{
			System.out.println("var2(" + var2 + ") is more then var1(" + var1 + ")" );
		} 
		else if (var1 == var2)
		{
			System.out.println("var2 equals var1" );
		}
		
		
		System.out.println("The sum of the values of two variables being compared (var1 + var2) is " + (var1 + var2) );
				
	}
	
}

