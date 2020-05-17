public class LongPineapplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Pineapple();
    }
}
