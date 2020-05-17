import java.util.Random;

public class Main {
    private static int MAX_FRUITS = 4;
    private static Fruit fruits[] = new Fruit[MAX_FRUITS];

    public static void main(String[] args) {
        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = getRandomFruit();
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }

    private static Fruit getRandomFruit() {
        switch (new Random().nextInt(3)) {
            case 0: return new Apple();
            case 1: return new Pineapple();
            default: return new Orange();
        }
    }
}
