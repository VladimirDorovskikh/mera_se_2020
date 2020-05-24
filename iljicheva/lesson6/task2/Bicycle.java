package iljicheva.lesson6.task2;

import java.util.Objects;
import java.util.Random;

public class Bicycle implements Comparable<Bicycle> {
    private String[] brands = new String[]{
            "Stels1",
            "Stels2",
            "Stels3",
            "Stels4",
            "Stels5",
            "Stels6",
            "Stels7",
            "Stels8",
            "Stels9",
            "Stels10"
    };

    private String modelName;
    private int maxSpeed;

    public Bicycle() {
        this.modelName = brands[new Random().nextInt(10)];
        this.maxSpeed = new Random().nextInt(45) + 5;
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
        Bicycle bycicle = (Bicycle) o;
        return maxSpeed == bycicle.maxSpeed &&
                Objects.equals(modelName, bycicle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }

    @Override
    public String toString() {
        return  "ModelName: " + this.getModelName() +
                "\nMaxSpeed: " + this.getMaxSpeed();
    }

    @Override
    public int compareTo(Bicycle o) {
        return 0;
    }
}
