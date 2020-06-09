package com.mera.gokhmak.les7;

import com.sun.istack.internal.NotNull;

import java.util.Formatter;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private Set<PetAnimal> petAnimals = new HashSet<>();
    private Set<WildAnimal> wildAnimals = new HashSet<>();
    static Formatter formatter = new Formatter(System.out);

    public Zoo() {
        fillCollectionWithPetAnimals(petAnimals, (int)(Math.random() * 5) + 1);
        fillCollectionWithWildAnimals(wildAnimals, (int) (Math.random() * 8) + 3);
    }

    public static void fillCollectionWithPetAnimals(@NotNull Set<? super  PetAnimal> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(AnimalFactory.HOME_PET_GENERATOR.getNext());
        }
    }

    public static void fillCollectionWithWildAnimals(@NotNull Set<? super WildAnimal> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(AnimalFactory.WILD_PET_GENERATOR.getNext());
        }
    }

    private static void printAnimalsFromCollection(@NotNull Set<? extends Animal> collection) {
        for (Animal animal : collection) {
            formatter.format("%s на обед предпочитает съесть %s\n", animal.getName(), animal.getFavoriteMeal());
        }
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petAnimals);
        printAnimalsFromCollection(wildAnimals);
    }
}
