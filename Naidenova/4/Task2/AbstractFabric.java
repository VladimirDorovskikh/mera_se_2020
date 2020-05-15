import java.util.Random;

public abstract class AbstractFabric {

    public Fruit makeFruit(){
        Fruit fruit = new Fruit(100);
        return fruit;
    }
}

class ThinOrangeFactory extends AbstractFabric {

    public Fruit makeFruit(){
        return new Orange(new Random().nextInt(150)+100, new Random().nextInt(4)+1);
    }
    public String toString(){
        return "\nOrange fabric";
    }
}

class RedApplesFactory extends AbstractFabric {

    public Fruit makeFruit(){
        return new Apple(new Random().nextInt(100)+100, "red");
    }
    public String toString(){
        return "\nRed apples fabric";
    }
}

class GreenApplesFactory extends AbstractFabric {

    public Fruit makeFruit(){
        return new Apple(new Random().nextInt(100)+100, "green");
    }
    public String toString(){
        return "\nGreen apples fabric";
    }
}

class LongPineapplesFactory extends AbstractFabric {

    public Fruit makeFruit(){
        return new Pineapple(new Random().nextInt(300)+200, new Random().nextInt(100)+10);
    }
    public String toString(){
        return "\nLong pineapples fabric";
    }
}

