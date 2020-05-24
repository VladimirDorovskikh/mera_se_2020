package com.pradedov.lab6.task1;

import java.util.Objects;
import java.util.Random;

public class Bicycle {
    private static final int MIN_SPEED = 5;
    private static final int MAX_SPEED = 50;
    private final String modelName;
    private final int maxSpeed;

    public Bicycle() {
        Random random = new Random();
        int vendorIdx = random.nextInt(BikeVendor.values().length);
        this.modelName = BikeVendor.values()[vendorIdx].getVendor();
        this.maxSpeed = MIN_SPEED + random.nextInt(MAX_SPEED - MIN_SPEED + 1);
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
                modelName.equals(bicycle.modelName);
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

enum BikeVendor {
    MERIDA("Merida"),
    CUBE("Cube"),
    KONA("Kona"),
    ATOM("Atom"),
    KROSS("Kross");

    private final String vendor;

    BikeVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }
}
