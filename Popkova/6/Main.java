import java.util.Random;

public class Main {
    private static short BICYCLE_COUNT = 11;
    private static short INTEGER_COUNT = 10;
    private static short RANDOM_SPEED_BOUND = 51;
    private static short MAX_INTEGER_BOUND = 10;
    private static short MIN_INTEGER_BOUND = 1;
    private static short NAME_INDEX_BOUND = 5;

    public static void main(String[] args) {
        MyArrayList<Bicycle> bicycleList = new MyArrayList<>();
        fillBicycleList(bicycleList);

        int speed = new Random().nextInt(RANDOM_SPEED_BOUND);
        deleteBicycles(bicycleList, speed);

        MyArrayList<Integer> integerArrayList = new MyArrayList<>();
        fillIntegerList(integerArrayList);
        deleteEvenNumbers(integerArrayList);
        printIntegerList(integerArrayList);
    }

    private static void fillBicycleList(MyArrayList<Bicycle> list) {
        String [] models = {"BMX", "Cube", "Stern", "Merida", "Scott"};
        for(int i = 0; i < BICYCLE_COUNT; i++) {
            int index = new Random().nextInt(NAME_INDEX_BOUND);
            Bicycle bicycle = new Bicycle(models[index]);
            try {
                list.add(bicycle);
            }
            catch(MyArrayStoreException ex) {
                System.out.println("The bicycle that has not been added to MyArrayList: " + bicycle);
            }
        }
    }

    private static void deleteBicycles(MyArrayList<Bicycle> list, int speed) {
        for(int i = 0; i < list.size(); i++) {
            Bicycle bicycle = list.get(i);
            if(bicycle.getMaxSpeed() < speed) {
                list.remove(bicycle);
                i--;
            }
        }
    }

    private static void fillIntegerList(MyArrayList<Integer> list) {
        for(int i = 0; i < INTEGER_COUNT; i++) {
            Integer value = new Random().nextInt(MAX_INTEGER_BOUND - MIN_INTEGER_BOUND + 1) + MIN_INTEGER_BOUND;
            try {
                list.add(value);
            }
            catch(MyArrayStoreException ex) {
                System.out.println("The integer value that has not been added to MyArrayList: " + value);
            }
        }
    }

    private static void deleteEvenNumbers(MyArrayList<Integer> list) {
       for(int i = 0; i < list.size(); i++) {
           Integer value = list.get(i);
           if(value % 2 == 0) {
               list.remove(value);
               i--;
           }
       }
    }

    public static void printIntegerList(MyArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}