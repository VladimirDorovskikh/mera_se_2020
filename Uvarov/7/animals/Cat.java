package mera.animals;

import mera.meal.FavoriteMeal;
import mera.meal.Meal;

public class Cat extends PetAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return FavoriteMeal.FAVORITE_CAT_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return "Cat: " + "name= " + name;
    }
}
