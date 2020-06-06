package com.mera.volsenkov.lesson7.zoo;
public class Cat extends PetAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "Рыба";
    }
}
