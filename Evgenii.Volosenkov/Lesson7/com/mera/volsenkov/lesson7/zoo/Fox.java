package com.mera.volsenkov.lesson7.zoo;
public class Fox extends WildAnimal{
    public Fox(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "крольчатина";
    }
}
