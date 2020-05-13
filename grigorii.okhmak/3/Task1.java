import java.util.*;

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        String result = lastName + ", " + firstName;
        return result;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        String[] names = {"Petr","Nikolai","Michail","Oleg","Dmitry"};
        String[] surnames = {"Ogurtsov","Ivanov","Medvedev","Gvozdev","Orechov","Pavlov"};
        Person[] persons = new Person[50];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(names[rand.nextInt(names.length)], surnames[rand.nextInt(surnames.length)]);
        }
        // Output
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Person #%02d - %s\n", i, persons[i]);
        }
    }
}