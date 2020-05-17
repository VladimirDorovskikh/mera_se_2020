public class ThinOrangeFactory extends AbstractFabric {
    public Fruit makeFruit() {
        return new Orange();
    }
}
