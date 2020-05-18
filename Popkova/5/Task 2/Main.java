import java.util.Random;

public class Main {
    private static int ARRAY_SIZE = 10;
    public static int RANDOM_CONST = 4;

    public static void main(String[] args) {
        Person[] persons = new Person[ARRAY_SIZE];
        makePersonArr(persons);
        printPersonArr(persons);
    }

    private static void makePersonArr(Person[] persons) {
        for(int i = 0; i < persons.length; i++) {
            int randomValue = new Random().nextInt(RANDOM_CONST);
            switch(randomValue) {
                case 0 :
                    persons[i] = new Person(Name.MIKE, Season.AUTUMN);
                    break;
                case 1 :
                    persons[i] = new Person(Name.SONYA, Season.SPRING);
                    break;
                case 2 :
                    persons[i] = new Person(Name.ANNA, Season.WINTER);
                    break;
                case 3 :
                    persons[i] = new Person(Name.MARIA, Season.SUMMER);
                    break;
            }
        }
    }

    private static void printPersonArr(Person[] persons) {
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName() + " - " + persons[i].getFavouriteGame());
        }
    }
}
