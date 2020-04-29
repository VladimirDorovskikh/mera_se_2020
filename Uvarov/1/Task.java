package at;

public class Task {

	public static void main(String args[]) {
		
		int firstNumber = Integer.valueOf(args[0]);
		int secondNumber = Integer.valueOf(args[1]);
		
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is more then " + secondNumber);
		}
		else {
			System.out.println(firstNumber + " is no more then " + secondNumber);
		}
		System.out.println(firstNumber + secondNumber);
	}
}
