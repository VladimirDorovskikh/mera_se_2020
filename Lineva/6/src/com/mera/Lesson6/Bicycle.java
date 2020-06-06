package com.mera.Lesson6;

import java.util.Objects;
import java.util.Random;

class Bicycle {
    private String modelName;
    private int maxSpeed;

    private static String[] models = {"Giant", "Trek", "Merida", "GT", "Cube", "Scott", "Author", "Norco"};
    final static int MIN_SPEED = 5, MAX_SPEED = 50;

    private Random random = new Random();

    public Bicycle() {
        int modelIndex = random.nextInt(models.length);
        modelName = models[modelIndex];

        maxSpeed = MIN_SPEED + random.nextInt(MAX_SPEED - MIN_SPEED + 1);
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