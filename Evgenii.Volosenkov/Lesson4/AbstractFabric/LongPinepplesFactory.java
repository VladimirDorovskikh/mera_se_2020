package AbstractFabric;
import Fruits.Fruit;
import Fruits.Pineapple;

public class LongPinepplesFactory extends AbstactFruitFabric{
    public Fruit createFruit()
    {
        Pineapple fruit = new Pineapple(RandomSingleton.rand.nextInt(999) + 1,
                RandomSingleton.rand.nextInt(100) + 11);
        return fruit;
    }
}
