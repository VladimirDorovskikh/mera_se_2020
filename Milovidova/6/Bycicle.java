package Lecture6;

import java.util.Objects;

public class Bycicle {
    String modelName;
    int maxSpeed;

    public Bycicle() {
        this.modelName ="";
        this.maxSpeed = 0;
    }

    public Bycicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bycicle bycicle = (Bycicle) o;
        return maxSpeed == bycicle.maxSpeed &&
                Objects.equals(modelName, bycicle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }
}
