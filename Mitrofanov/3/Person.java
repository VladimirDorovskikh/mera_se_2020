import java.util.Arrays;
import java.util.Random;

public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int selector;
        String selectedName;
        String selectedLastName;
        String[] names = {"Сергей", "Даниил", "Алексей", "Антон", "Андрей"};
        String[] lastNames = {"Митрофанов", "Сергеев", "Панов", "Авдеев", "Лабутин", "Всеядов"};
        Person[] crowd = new Person[50];

        for (int i = 0; i < crowd.length; i++) {
            selector = random.nextInt(5);
            selectedName = names[selector];
            selector = random.nextInt(6);
            selectedLastName = lastNames[selector];
            crowd[i] = new Person(selectedName, selectedLastName);
            System.out.println("Person #" + (i + 1) + " is " + crowd[i].toString());
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ";";
    }
}
