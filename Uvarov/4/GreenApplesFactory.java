package mera.fabric;

import mera.Apple;
import java.util.Random;

public class GreenApplesFactory extends AbstractFabric {
    @Override
    public Apple makeFruit() {
        Random rnd = new Random();
        int weight = rnd.nextInt(100)+1;
        return new Apple(weight,"green");
    }
}
