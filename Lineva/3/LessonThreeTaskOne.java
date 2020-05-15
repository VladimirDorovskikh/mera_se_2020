import java.util.Random;

public class LessonThreeTaskOne {

    public static void main(String[] args) {

        final int PERSONS_COUNT = 50;

        String[] firstNames = {"Kate", "Ann", "John", "James", "Tom"};
        String[] lastNames = {"Smith", "Williams", "Miller", "Johnson", "Jones", "Carter"};

        Person[] persons = new Person[PERSONS_COUNT];

        Random random = new Random();

        for (int i = 0; i < persons.length; i++) {
            int firstNamesIndex = random.nextInt(firstNames.length);
            int lastNamesIndex = random.nextInt(lastNames.length);
            persons[i] = new Person(firstNames[firstNamesIndex], lastNames[lastNamesIndex]);
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person #"+ i + " " + persons[i].toString());
        }
    }
}