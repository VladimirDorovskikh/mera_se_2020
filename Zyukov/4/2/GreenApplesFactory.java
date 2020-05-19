public class GreenApplesFactory extends AbstractFabric {
    public Fruit makeFruit() {
        return new Apple("GREEN");
    }
}
