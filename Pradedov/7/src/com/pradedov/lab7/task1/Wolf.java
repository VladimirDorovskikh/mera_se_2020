package com.pradedov.lab7.task1;

public class Wolf extends WildAnimal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.LAMB;
    }
}
