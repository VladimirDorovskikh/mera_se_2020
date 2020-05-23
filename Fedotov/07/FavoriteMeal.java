package com.mera.training.task07;

public enum FavoriteMeal {
    CAT_MEAL("Cat's favorite meal"),
    DOG_MEAL("Dog's favorite meal"),
    WOLF_MEAL("Wolf's favorite meal"),
    FOX_MEAL("Fox's favorite meal");

    private final String favoriteMeal;

    FavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    public String getFavoriteMealForAnimal() {
        return favoriteMeal;
    }
}
