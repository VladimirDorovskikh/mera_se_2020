import java.util.Scanner;

public class task {
    public static void main(String[] args) {  
	    System.out.println("Введите два числа для сложения: ");  
	    Scanner readInput = new Scanner(System.in);  
	    int a = readInput.nextInt();  
	    int b = readInput.nextInt();  
	    readInput.close();  
	    // It will return the sum of a and b.  
	    System.out.println("Сумма a и b = " + Integer.sum(a, b));  
	    if (a>b) {
	    	System.out.println("Число" + " " + a + " " + "больше" + " " + b);
	    }
	    if (a<b) {
	    	System.out.println("Число" + " " + a + " " + "меньше" + " " + b);
	    }	    
	    	
	    }  
	} 