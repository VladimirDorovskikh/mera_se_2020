package mera.fabric;

import mera.Pineapple;
import java.util.Random;

public class LongPineapplesFactory extends AbstractFabric {
    @Override
    public Pineapple makeFruit() {
        Random rnd = new Random();
        int weight = rnd.nextInt(100)+1;
        int tailHeight = rnd.nextInt(20-10+1)+10;
        return new Pineapple(weight,tailHeight);
    }
}
