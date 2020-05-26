package com.pradedov.lab7.task1;

public class Cat extends PetAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.MILK;
    }
}
