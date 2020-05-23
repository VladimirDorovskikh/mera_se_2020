package com.mera.training.task07;

public class Dog extends PetAnimal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return FavoriteMeal.DOG_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + ", " + getFavoriteMeal();
    }
}
