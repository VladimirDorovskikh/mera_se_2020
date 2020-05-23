package com.mera.training.task07;

public class Cat extends PetAnimal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return FavoriteMeal.CAT_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", " + getFavoriteMeal();
    }
}
