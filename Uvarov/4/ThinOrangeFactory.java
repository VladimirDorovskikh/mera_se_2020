package mera.fabric;

import mera.Orange;
import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {

    @Override
    public Orange makeFruit() {
        Random rnd = new Random();
        int weight = rnd.nextInt(100)+1;
        int peelThickness = rnd.nextInt(5)+1;
        return new Orange(weight,peelThickness);
    }
}
