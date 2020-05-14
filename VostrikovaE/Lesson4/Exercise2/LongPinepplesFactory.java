package VostrikovaE.Lesson4.Exercise2;

import VostrikovaE.Lesson4.Exercise1.Fruit;
import VostrikovaE.Lesson4.Exercise1.Pineapple;

import java.util.Random;

public class LongPinepplesFactory extends AbstractFabric{
    private int maxTopHeight;
    private int minTopHeight;

    public LongPinepplesFactory (int minTopHeight, int maxTopHeight) {
        if (minTopHeight>maxTopHeight) throw new IllegalArgumentException("Max top height must be above min peel");
        if (minTopHeight<0) throw new IllegalArgumentException("Min top height must be above zero");
        if (maxTopHeight<0) throw new IllegalArgumentException("Max top heightl must be above zero");
        this.minTopHeight=minTopHeight;
        this.maxTopHeight=maxTopHeight;
    }
    @Override
    public Fruit makeFruit() {
        Pineapple returnedPineApple = new Pineapple();
        Random rnd = new Random();
        returnedPineApple.setTopHeight(rnd.nextInt(maxTopHeight-minTopHeight)+minTopHeight);
        return returnedPineApple;
    }
}
