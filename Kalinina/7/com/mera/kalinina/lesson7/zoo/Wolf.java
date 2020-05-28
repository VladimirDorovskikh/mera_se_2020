package com.mera.kalinina.lesson7.zoo;

public class Wolf extends WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "Sheep";
    }
}
