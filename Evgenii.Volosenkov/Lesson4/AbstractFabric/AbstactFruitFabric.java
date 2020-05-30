package AbstractFabric;
import Fruits.Fruit;

public abstract class AbstactFruitFabric {
    public Fruit makeFruit()
    {
        return createFruit();
    }
    protected abstract Fruit createFruit();
}
