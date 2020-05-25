package com.pradedov.lab7.task1;

import java.util.Objects;

public abstract class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Meal getFavoriteMeal();

    @Override
    public boolean equals(Object obj) {
        boolean result;

        if (null == obj) {
            result = false;
        } else if (this == obj) {
            result = true;
        } else {
            boolean isClassTheSame = obj.getClass() == this.getClass();
            boolean isNameTheSame = ((Animal) obj).name.equals(this.name);
            result = isClassTheSame && isNameTheSame;
        }

        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, this.getClass());
    }
}

enum Meal {
    BONE,
    MILK,
    MOUSE,
    LAMB
}
