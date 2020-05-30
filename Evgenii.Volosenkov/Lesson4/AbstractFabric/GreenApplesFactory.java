package AbstractFabric;

import Fruits.Apple;
import Fruits.Fruit;

public class GreenApplesFactory  extends  AbstactFruitFabric{
    public Fruit createFruit()
    {
        Apple fruit = new Apple(RandomSingleton.rand.nextInt(999) + 1, "зеленый");
        return fruit;
    }
}
