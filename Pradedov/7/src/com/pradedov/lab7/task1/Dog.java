package com.pradedov.lab7.task1;

public class Dog extends PetAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.BONE;
    }
}
