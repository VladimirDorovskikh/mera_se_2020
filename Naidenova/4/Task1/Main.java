import java.util.Random;
import java.util.Arrays;

public class Main {

    public static Fruit getRandomFruit(){
        int randomfruit = new Random().nextInt(2);
        Fruit fruit;
        if (randomfruit == 0) {
            String[] colorList = {"red", "green", "yellow"};
            fruit = new Apple(new Random().nextInt(100)+100, colorList[new Random().nextInt(2)]);
        }
        else if (randomfruit == 1) {
            fruit = new Orange(new Random().nextInt(150)+100, new Random().nextInt(20));
            //System.out.println(fruit);
        }
        else {
            fruit = new Pineapple(new Random().nextInt(300)+200, new Random().nextInt(15)+5);
            //System.out.println(fruit);
        }

        return fruit;
    }

    public static void main(String[] args) {
        Fruit[] fruitList = new Fruit[4];
        for (int n=0; n<4; n++) {
            fruitList[n] = getRandomFruit();

        }
        System.out.println(Arrays.toString(fruitList));


    }

}
