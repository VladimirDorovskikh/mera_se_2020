package com.mera.training.task06;

import java.util.Objects;

public class Bicycle implements Comparable<Bicycle> {

    private String modelName;
    private int maxSpeed;

    public Bicycle(String modelName, int maxSpeed) throws IllegalArgumentException {
        this.modelName = modelName;
        if (maxSpeed >= 5 && maxSpeed <= 50) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Invalid Bicycle Speed value: " + maxSpeed + ". Valid values are: 5 - 50.");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
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
    public int compareTo(Bicycle o) {
        return 0;
    }
}
