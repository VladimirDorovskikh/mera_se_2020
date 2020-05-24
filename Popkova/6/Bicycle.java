import java.util.Random;

public class Bicycle {
    private final static short HIGHEST_MAX_SPEED = 50;
    private final static short LOWEST_MAX_SPEED = 5;

    private String modelName;
    private int maxSpeed;

    public Bicycle(String name) {
        modelName = name;
        maxSpeed = new Random().nextInt(HIGHEST_MAX_SPEED - LOWEST_MAX_SPEED + 1) + LOWEST_MAX_SPEED;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bicycle = (Bicycle) o;

        if (maxSpeed != bicycle.maxSpeed) return false;
        return modelName != null ? modelName.equals(bicycle.modelName) : bicycle.modelName == null;
    }

    @Override
    public int hashCode() {
        int result = modelName != null ? modelName.hashCode() : 0;
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicycle{");
        sb.append("modelName='").append(modelName).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}