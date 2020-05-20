package array;

import java.util.Objects;
import java.util.Random;

public class Bicycle {
    private final String modelName;
    private final int maxSpeed;

    public Bicycle(String modelName, int maxSpeed) throws IllegalArgumentException {
        if (maxSpeed < 5 || maxSpeed > 50) {
            throw new IllegalArgumentException("Max speed should be 5 to 50");
        }
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static Bicycle getBicycle() {
        Random r = new Random();
        String[] manufacturer = new String[]{"Merida", "Stern", "Trek", "GT", "Scott"};
        Bicycle bicycle = new Bicycle(manufacturer[r.nextInt(manufacturer.length)], (5 + r.nextInt(45)));
        return bicycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bycicle = (Bicycle) o;
        return getMaxSpeed() == bycicle.getMaxSpeed() &&
                getModelName().equals(bycicle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Bycicle " + modelName + '\'' + maxSpeed;
    }
}
