import java.util.Random;

public class GreenApplesFactory extends AbstractFactory {

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Apple((1 + random.nextInt(40)), "Green");
    }
}