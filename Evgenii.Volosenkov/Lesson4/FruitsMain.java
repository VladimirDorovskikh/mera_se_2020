import Fruits.Apple;
import Fruits.Fruit;
import Fruits.Orange;
import Fruits.Pineapple;

import java.util.Random;

public class FruitsMain {
    private static Random rand = new Random();
    private  static String[] colors = {"красный", "зеленый", "желтый"};
    public static  void main(String[] args)
    {
        Fruit[] arrayOfFruits = new Fruit[4];
        for( int fruitInd = 0; fruitInd< arrayOfFruits.length; fruitInd++ )
        {
            arrayOfFruits[fruitInd] = getRandomFruit();
        }
        for( Fruit fruit:arrayOfFruits)
        {
            System.out.println(fruit.toString());
        }
    }

    public static  Fruit getRandomFruit()
    {
        int fruitID = rand.nextInt(3);
        int weight = rand.nextInt(1000);
        switch (fruitID)
        {
            case 0:
                return new Apple(weight, colors[rand.nextInt(3)]);
            case 1:
                return new Orange(weight, rand.nextInt(20));
            case 2:
                return new Pineapple(weight, 5 + rand.nextInt(15));
        }
        return null;
    }
}
