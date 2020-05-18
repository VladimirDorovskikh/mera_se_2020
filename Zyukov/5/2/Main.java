import java.util.Random;

public class Main {
    private static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Person[] persons = new Person[ARRAY_SIZE];

        for (int i = 0; i < persons.length; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    persons[i] = new Person("Дима", Season.SUMMER);
                    break;
                case 1:
                    persons[i] = new Person("Михаил", Season.WINTER);
                    break;
                case 2:
                    persons[i] = new Person("Сергей", Season.FALL);
                    break;
                default:
                    persons[i] = new Person("Константин", Season.SPRING);
                    break;
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName() + " - " + persons[i].getFavouriteGame());
        }
    }
}