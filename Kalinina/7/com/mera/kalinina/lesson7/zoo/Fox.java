package com.mera.kalinina.lesson7.zoo;

public class Fox extends WildAnimal {

    public Fox(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "Chicken";
    }
}
