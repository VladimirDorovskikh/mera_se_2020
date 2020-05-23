package mera.animals;

import mera.meal.FavoriteMeal;
import mera.meal.Meal;

public class Wolf extends WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return FavoriteMeal.FAVORITE_WOLF_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return "Wolf: " + "name= " + name;
    }
}
