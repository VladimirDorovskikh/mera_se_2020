import java.util.Arrays;
import java.util.Random;

public class FruitShop {

    public static void main(String[] args) {

        Fruit[] shelf = new Fruit[10];
        Fruit[] orderedFruits = new Fruit[20];
        AbstractFactory[] suppliers = new AbstractFactory[10];
        int orderPerFactory = 2;

        for (int i = 0; i < suppliers.length; i++) {
            suppliers[i] = getSupplier();
        }

        for (int i = 0; i < orderedFruits.length; ) {
            for (AbstractFactory supplier : suppliers) {
                for (int j = 0; j < orderPerFactory; j++, i++) {
                    orderedFruits[i] = supplier.makeFruit();
                }
            }
        }
        System.out.print(Arrays.toString(orderedFruits));

        for (int i = 0; i < shelf.length; i++) {
            shelf[i] = getRandomFruit();
        }
        System.out.println("\n----------------------------");
        System.out.println(Arrays.toString(shelf));
    }

    public static Fruit getRandomFruit() {
        Fruit fruit;
        Random random = new Random();
        if (random.nextInt(3) == 2) {
            String[] range = new String[]{"Red", "Green", "Yellow"};
            fruit = new Apple((1 + random.nextInt(40)), range[(int) Math.floor(Math.random() * range.length)]);
        } else if (random.nextInt(3) == 1) {
            fruit = new Orange((1 + random.nextInt(40)), (1 + random.nextInt(19)));
        } else {
            fruit = new Pineapple((1 + random.nextInt(40)), (5 + random.nextInt(14)));
        }
        return fruit;
    }

    public static AbstractFactory getSupplier() {
        AbstractFactory factory;
        Random random = new Random();
        if (random.nextInt(5) == 4) {
            factory = new RedApplesFactory();
        } else if (random.nextInt(5) == 3) {
            factory = new GreenApplesFactory();
        } else if (random.nextInt(5) == 2) {
            factory = new ThinOrangeFactory();
        } else {
            factory = new TallPineapplesFactory();
        }
        return factory;
    }
}
