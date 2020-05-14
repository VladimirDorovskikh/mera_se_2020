package VostrikovaE.Lesson4.Exercise2;

import VostrikovaE.Lesson4.Exercise1.Apple;
import VostrikovaE.Lesson4.Exercise1.Fruit;

public class GreenApplesFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
            Apple returnedApple=new Apple();
            returnedApple.setColour("Green");
            return returnedApple;
    }
}
