import java.util.Random;

public class ThinOrangeFactory extends AbstractFactory {

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Orange((1 + random.nextInt(40)), (1 + random.nextInt(4)));
    }
}