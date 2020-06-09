package com.mera.Lesson7;

import java.util.Objects;
import java.util.Random;

abstract class Animal {
    private String name;
    abstract String getFavoriteMeal();

    private final static String[] names = {"Tom", "Jerry", "Rex", "Leopold", "Totoshka",
            "Garfield", "Kowalski", "Timon", "Roger", "Sebastian"};

    public Animal() {
        int nameIndex = new Random().nextInt(names.length);
        name = names[nameIndex];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && (getClass() == o.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getClass());
    }

    @Override
    public String toString() {
        String className = getClass().toString();
        StringBuilder builder = new StringBuilder();
        builder.append(className.substring(className.lastIndexOf('.') + 1));
        builder.append(" ");
        builder.append(name);
        builder.append(", favorite meal is ");
        builder.append(getFavoriteMeal());
        return builder.toString();
    }
}