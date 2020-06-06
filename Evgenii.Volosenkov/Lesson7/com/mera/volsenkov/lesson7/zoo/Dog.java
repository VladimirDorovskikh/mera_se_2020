package com.mera.volsenkov.lesson7.zoo;
public class Dog extends PetAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "кость";
    }
}
