import AbstractFabric.*;
import Fruits.Fruit;

public class AbstractFabricMain {
    public static void main(String[] args)
    {
        AbstactFruitFabric[] fabrics = new AbstactFruitFabric[10];
        for(int fabricID = 0; fabricID<10; fabricID++)
        {
            fabrics[fabricID] = genRandomFruitFabric();
        }
        Fruit[] fruits = new Fruit[20];
        for(int fabricID = 0; fabricID<10; fabricID++)
        {
            fruits[2*fabricID] = fabrics[fabricID].makeFruit();
            fruits[2*fabricID + 1] = fabrics[fabricID].makeFruit();
        }
        for(Fruit fruit:fruits)
        {
            System.out.println(fruit.toString());
        }
    }

    private static AbstactFruitFabric genRandomFruitFabric()
    {
        int fabricId = RandomSingleton.rand.nextInt(4);
        switch(fabricId)
        {
            case 0:
                return new GreenApplesFactory();
            case 1:
                return new RedApplesFactory();
            case 2:
                return new ThinOrangeFactory();
            case 3:
                return new LongPinepplesFactory();
        }
        return null;
    }
}
