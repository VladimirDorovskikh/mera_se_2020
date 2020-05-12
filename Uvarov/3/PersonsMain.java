import java.util.Random;

public class PersonsMain {
    public static void main(String[] args) {
        final int NUMBER_OF_FIRST_NAMES = 5;
        final int NUMBER_OF_LAST_NAMES = 6;
        final int NUMBER_OF_PERSONS = 50;

        String[] firstNames = new String[NUMBER_OF_FIRST_NAMES];
        firstNames[0] = "Александр";
        firstNames[1] = "Борис";
        firstNames[2] = "Валерий";
        firstNames[3] = "Владимир";
        firstNames[4] = "Павел";

        String[] lastNames = new String[NUMBER_OF_LAST_NAMES];
        lastNames[0] = "Буре";
        lastNames[1] = "Датсюк";
        lastNames[2] = "Михайлов";
        lastNames[3] = "Овечкин";
        lastNames[4] = "Петров";
        lastNames[5] = "Харламов";

        Random firstNamesRnd = new Random();
        Random lastNamesRnd = new Random();

        Person[] persons = new Person[NUMBER_OF_PERSONS];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(firstNames[firstNamesRnd.nextInt(NUMBER_OF_FIRST_NAMES)], lastNames[lastNamesRnd.nextInt(NUMBER_OF_LAST_NAMES)]);
            System.out.println(persons[i].toString());
        }
    }
}
