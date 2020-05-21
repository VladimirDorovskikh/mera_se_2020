package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static array.Bicycle.getBicycle;

public class BiMain {
    public static void main(String[] args) {
// Task 1
        MyArrayList<Bicycle> bicycles = new MyArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            bicycles.add(getBicycle());
        }

        Random r = new Random();
        int test = r.nextInt(50);
        System.out.println("Max speed allowed = " + test);

        List<Bicycle> toRemove = new ArrayList<>();

        for (int i = 0; i < bicycles.size(); i++) {
            if (bicycles.get(i).getMaxSpeed() < test) {
                toRemove.add(bicycles.get(i));
            }
        }
        for (Bicycle bicycle : toRemove) {
            bicycles.remove(bicycle);
            System.out.println(bicycle + " is removed");
        }
// Task 2
        MyArrayList<Integer> numbers = new MyArrayList<>(10);
        for (int i = 0; i < numbers.getStorageSize(); i++) {
            numbers.add(r.nextInt(11));
        }
        List<Integer> remover = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                remover.add(numbers.get(i));
            }
        }
        System.out.println(numbers.toString());
        numbers.remove(remover);
        System.out.println(numbers.toString());
    }
}






