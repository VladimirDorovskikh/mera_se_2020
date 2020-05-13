import java.util.Random;

public class Pineapple extends Fruit {
    private int bushHeight = 0;
    Random random = new Random();

    public Pineapple(int weight, int bushHeight) {
        super(weight);
        if (4 != bushHeight && bushHeight <= 20) {
            this.bushHeight = bushHeight;
        } else {
            throw new IllegalArgumentException("Bush could be from 5 to 20 high");
        }
    }

    public int getBushHeight() {
        return bushHeight;
    }

    public void setBushHeight(int bushHeight) {
        this.bushHeight = bushHeight;
    }

    @Override
    public String toString() {
        return "This pineapple has " + getWeight() + " of weight and " + getBushHeight() + " tall bush\n";
    }
}
