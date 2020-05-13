import java.util.Random;

public class Orange extends Fruit {
    private int peelThick = 0;
    Random random = new Random();

    public Orange(int weight, int peelThick) {
        super(weight);
        if (0 != peelThick && peelThick <= 20) {
            this.peelThick = peelThick;
        } else {
            throw new IllegalArgumentException("Peel thickness could be from 0 to 20");
        }
    }

    public int getPeelThick() {
        return peelThick;
    }

    public void setPeelThick(int peelThick) {
        this.peelThick = peelThick;
    }

    @Override
    public String toString() {
        return "This orange has " + getWeight() + " of weight and " + getPeelThick() + " of thickness\n";
    }
}
