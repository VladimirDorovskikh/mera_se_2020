import java.util.Random;

public class RedApplesFactory extends AbstractFactory{

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Apple((1 + random.nextInt(40)), "Red");
    }
}
