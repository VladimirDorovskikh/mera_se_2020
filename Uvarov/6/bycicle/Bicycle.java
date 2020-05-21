package mera.bycicle;

import java.util.Objects;

public class Bicycle {
    public static final int MAX_SPEED = 50;
    public static final int MIN_SPEED = 5;

    private String modelName;
    private int maxSpeed;

    public Bicycle(String modelName, int maxSpeed) {
        this.setModelName(modelName);
        this.setMaxSpeed(maxSpeed);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= MAX_SPEED && maxSpeed >= MIN_SPEED) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new WrongBicycleSpeedException("Maximum bicycle speed can not be " + maxSpeed + '\n'
                    + "it should be between " + MIN_SPEED + " and " + MAX_SPEED);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return maxSpeed == bicycle.maxSpeed &&
                Objects.equals(modelName, bicycle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
