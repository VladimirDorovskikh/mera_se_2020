public class RedApplesFactory extends AbstractFabric {
    public Fruit makeFruit() {
        return new Apple("RED");
    }
}
