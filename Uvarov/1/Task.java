package at;

public class Task {

	public static void main(String args[]) {
		int firstNumber = Integer.valueOf(args[0]);
		int secondNumber = Integer.valueOf(args[1]);
		
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " больше " + secondNumber);
		}
		else {
			System.out.println(firstNumber + " не больше " + secondNumber);
		}
		System.out.println(firstNumber + secondNumber);
	}
}
