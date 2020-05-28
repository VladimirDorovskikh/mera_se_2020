package com.mera.kalinina.lesson7.zoo;

public class Dog extends PetAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "Bone";
    }
}
