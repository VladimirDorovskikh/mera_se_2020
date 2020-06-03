package bicycle;
import java.util.Objects;


public class Bicycle {
    private String modelName;
    private int maxSpeed; // (от 5 до 50км\ч);
    private final int MAX_SPEED = 50;
    private final int MIN_SPEED = 5;

    public Bicycle() {
        modelName = "NoNamed";
        maxSpeed = MIN_SPEED;
    }
    public Bicycle(String modelName, int maxSpeed) {

        this.modelName = modelName;

        if (maxSpeed > MAX_SPEED)
            this.maxSpeed = MAX_SPEED;
        else if (maxSpeed < MIN_SPEED)
            this.maxSpeed = MIN_SPEED;
        else
            this.maxSpeed = maxSpeed;

    }

    public Bicycle(String modelName) {
        this.modelName = modelName;
        this.maxSpeed = MIN_SPEED;
    }

    public int getSpeed() {

        return this.maxSpeed;
    }
    
    @Override
    public String toString() {
        return (modelName + ", maxSpeed = " + maxSpeed);
    }


    @Override
    public boolean equals(Object obj) {

        boolean res = false;
        if (obj == this) {
            res = true;

        }
        return res;
    }


    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }
}
