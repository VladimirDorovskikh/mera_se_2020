package com.mera.training.task07;

public class Wolf extends WildAnimal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return FavoriteMeal.WOLF_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", " + getFavoriteMeal();
    }

}
