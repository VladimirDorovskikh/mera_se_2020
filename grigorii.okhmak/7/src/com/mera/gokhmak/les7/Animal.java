package com.mera.gokhmak.les7;

import java.util.Objects;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getFavoriteMeal();

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return true;
    }
}

abstract class WildAnimal extends Animal {

    public WildAnimal(String name) {
        super(name);
    }
}

abstract class PetAnimal extends Animal {

    public PetAnimal(String name) {
        super(name);
    }
}