package iljicheva.lesson7.task1;

import java.util.Objects;

public abstract class Animal {
    String name;

    abstract String getFavoriteMeal();

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Animal: " + this.getClass().getSimpleName() +
                "\nName: " + this.getName() +
                "\nFavourite meal: " + this.getFavoriteMeal() + "\n";
    }
}
