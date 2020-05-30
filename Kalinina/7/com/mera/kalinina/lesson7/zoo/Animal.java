package com.mera.kalinina.lesson7.zoo;

import java.util.Objects;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public String getFavoriteMeal();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "name='" + name + "' loves to eat " + getFavoriteMeal() +
                '}';
    }
}
