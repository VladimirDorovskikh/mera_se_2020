import java.util.Random;

public class Bycicle {
    private String modelName;
    private int maxSpeed;

    public Bycicle(String modelName) {
        this.modelName = modelName;
        this.maxSpeed = new Random().nextInt(46) + 5;
    }

    public boolean equals(Bycicle bycicle) {
        return (bycicle.maxSpeed == this.maxSpeed) && (bycicle.modelName.equals(this.modelName));
    }

    public int hashCode() {
        return modelName.hashCode() + maxSpeed + 31;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
