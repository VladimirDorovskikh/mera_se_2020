package AbstractFabric;

import Fruits.Apple;
import Fruits.Fruit;

public class RedApplesFactory extends AbstactFruitFabric{
    public Fruit createFruit()
    {
        Apple fruit = new Apple(RandomSingleton.rand.nextInt(999) + 1, "красный");
        return fruit;
    }
}
