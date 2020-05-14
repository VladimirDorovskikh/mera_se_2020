public class Fruit {
    protected int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Fruit: weight " +weight;
    }
}

class Apple extends Fruit {
    String color;

    public Apple(int weight, String color){
        super(weight);
        this.color = color;
    }

    public String toString() {
        return "\nApple: weight "+ super.weight +" gr,  color "+ this.color;
    }
}

class Orange extends Fruit {
    int skinThickness;

    public Orange(int weight, int skinThickness){
        super(weight);
        this.skinThickness = skinThickness;
    }

    public String toString() {
        return "\nOrange: weight "+ super.weight +" gr,  skin thickness "+ skinThickness;
    }

}

class Pineapple extends Fruit {
    int tailHeight;

    public Pineapple(int weight, int tailHeight){
        super(weight);
        this.tailHeight = tailHeight;
    }

    public String toString() {
        return "\nPineapple: weight "+ super.weight +" gr, tail height "+ tailHeight;
    }

}
