import java.util.Random;

public class TallPineapplesFactory extends AbstractFactory {

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Pineapple((1 + random.nextInt(40)), (10 + random.nextInt(10)));
    }
}
