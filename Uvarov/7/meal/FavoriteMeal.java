package mera.meal;

public enum FavoriteMeal {
    FAVORITE_WOLF_MEAL(Meal.SHEEP),
    FAVORITE_FOX_MEAL(Meal.RABBIT),
    FAVORITE_CAT_MEAL(Meal.FISH),
    FAVORITE_DOG_MEAL(Meal.CHAPPI);

    private final Meal mealForAnimal;

    FavoriteMeal(Meal meal) {
        this.mealForAnimal = meal;
    }

    public Meal getFavoriteMealForAnimal() {
        return mealForAnimal;
    }

}
