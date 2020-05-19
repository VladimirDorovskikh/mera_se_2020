package Lecture_3;
import java.util.Random;

public class Person {
	String firstName;
	String lastName;
		

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

    public String toString() {
        return getLastName() + ", " + getFirstName();
    }

	public static void main(String[] args) {
		String [] firstName = new String[] {"F1", "F2", "F3", "F4", "F5"};
		String [] lastName = new String[] {"L1", "L2", "L3", "L4", "L5", "L6"};
		Random rand = new Random();
		Person [] randName = new Person[50];
		
		for (int i = 0; i < 50; i++) {
			String x = firstName [rand.nextInt(firstName.length)];
			String z = lastName [rand.nextInt(lastName.length)];
			randName[i] = new Person(x, z);
			System.out.println (randName[i].toString());
		}
		

	}

}
