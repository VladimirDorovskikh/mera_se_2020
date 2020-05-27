package VostrikovaE.Lesson6;

import java.util.Objects;
import java.util.Random;

public class Bycicle {
    private String modelName;
    private int maxSpeed;

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
        if (maxSpeed >=5 & maxSpeed <=50) {
            this.maxSpeed = maxSpeed;
        } else
            throw new IllegalArgumentException("max speed must be from 5 to 50");
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
        return getMaxSpeed() == bycicle.getMaxSpeed() &&
                getModelName().equals(bycicle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getMaxSpeed());
    }

    public static Bycicle getRandomBycicle() {
        Random rnd = new Random();
        Bycicle bycicle = new Bycicle();

        bycicle.setMaxSpeed(rnd.nextInt(45) + 5);
        bycicle.setModelName("bycicle super jet-" + (rnd.nextInt(1000) + 1) );
        return bycicle;
    }

}
