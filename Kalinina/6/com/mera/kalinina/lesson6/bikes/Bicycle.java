package com.mera.kalinina.lesson6.bikes;

import java.util.Objects;

public class Bicycle {

    String modelName;
    int maxSpeed; // valid values are 5 - 50km\h

    public Bicycle(String modelName, int maxSpeed) throws InvalidBicycleSpeedException {
        if(maxSpeed < 5 || maxSpeed > 50)
            throw new InvalidBicycleSpeedException("Invalid bicycle speed value: " + maxSpeed + "Valid values are 5 - 50 km/h");
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
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
        return getMaxSpeed() == bicycle.getMaxSpeed() &&
                Objects.equals(getModelName(), bicycle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
