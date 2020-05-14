package VostrikovaE.Lesson4.Exercise2;

import VostrikovaE.Lesson4.Exercise1.Fruit;
import VostrikovaE.Lesson4.Exercise1.Orange;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric{
    private int minPeel;
    private int maxPeel;
    public ThinOrangeFactory(int minPeel, int maxPeel){
        if (minPeel>maxPeel) throw new IllegalArgumentException("Max peel must be above min peel");
        if (minPeel<0) throw new IllegalArgumentException("Min peel must be above zero");
        if (maxPeel<0) throw new IllegalArgumentException("Max peel must be above zero");
        this.minPeel=minPeel;
        this.maxPeel=maxPeel;


    }
    @Override
    public Fruit makeFruit() {
        Orange returnedOrange = new Orange();
        Random rnd = new Random();
        returnedOrange.setPeel(rnd.nextInt(maxPeel-minPeel)+minPeel);
        return returnedOrange;
    }
}
