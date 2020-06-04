package com.mera.volsenkov.lesson7.zoo;
import java.util.Objects;

public abstract class Animal {
    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + "\' , favorite_food=" + this.getFavoriteMeal() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getFavoriteMeal();
}
