package mera.animals;

import mera.meal.FavoriteMeal;
import mera.meal.Meal;

public class Dog extends PetAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return FavoriteMeal.FAVORITE_DOG_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return "Dog: " + "name= " + name;
    }
}
