package mera.animals;

import mera.meal.FavoriteMeal;
import mera.meal.Meal;

public class Fox extends WildAnimal {

    public Fox(String name) {
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return FavoriteMeal.FAVORITE_FOX_MEAL.getFavoriteMealForAnimal();
    }

    @Override
    public String toString() {
        return "Fox: " + "name= " + name;
    }
}
