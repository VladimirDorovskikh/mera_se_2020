package com.mera.training.task07;

public class Fox extends WildAnimal{

    public Fox(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return FavoriteMeal.FOX_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", " + getFavoriteMeal();
    }
}
