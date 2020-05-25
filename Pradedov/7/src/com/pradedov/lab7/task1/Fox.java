package com.pradedov.lab7.task1;

public class Fox extends WildAnimal{
    public Fox(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.MOUSE;
    }
}
