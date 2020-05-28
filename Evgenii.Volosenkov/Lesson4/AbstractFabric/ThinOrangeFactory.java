package AbstractFabric;
import Fruits.Fruit;
import Fruits.Orange;
public class ThinOrangeFactory extends AbstactFruitFabric {
    public Fruit createFruit()
    {
        Orange fruit = new Orange(RandomSingleton.rand.nextInt(999) + 1,
                RandomSingleton.rand.nextInt(4) + 1);
        return fruit;
    }
}
