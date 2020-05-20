package com.mera.gokhmak.les6;

import java.util.Objects;

public class Bicycle implements Comparable<Bicycle> {
    private static MyArrayList<String> BRANDS = new MyArrayList<>();

    static {
        try {
            BRANDS.add(new String("Stels"));
            BRANDS.add(new String("Kama"));
            BRANDS.add(new String("BMX"));
            BRANDS.add(new String("Giant"));
            BRANDS.add(new String("Forward"));
            BRANDS.add(new String("Convaw"));
            BRANDS.add(new String("Minerva"));
            BRANDS.add(new String("Merida"));
            BRANDS.add(new String("GT"));
            BRANDS.add(new String("USSR"));
        } catch (MyArrayStoreException e) {
            e.printStackTrace();
        }
    }

    public static String getRandomBrand() {
        return BRANDS.select();
    }

    private String modelName;
    private Integer maxSpeed;

    public Bicycle(String modelName, int maxSpeed) throws IllegalArgumentException {
        this.modelName = modelName;
        if (5 <= maxSpeed && maxSpeed <= 50) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Скорость велосипеда должна лежать в диапазоне [5, 50] км/ч");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bicycle bicycle = (Bicycle) obj;
        return Objects.equals(modelName, bicycle.modelName) &&
                maxSpeed == bicycle.maxSpeed;
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                " modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                " }";
    }

    @Override
    public int compareTo(Bicycle o) {
        int result = this.modelName.compareTo(o.modelName);
        if (result == 0) {
            result = this.maxSpeed.compareTo(o.maxSpeed);
        }
        return result;
    }
}
