package com.pradedov.lab7.task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private final Set<WildAnimal> animals = new HashSet<>();
    private final Set<PetAnimal> pets = new HashSet<>();

    private static final int MIN_PETS = 1;
    private static final int MAX_PETS = 5;
    private static final int MIN_ANIMALS = 3;
    private static final int MAX_ANIMALS = 10;
    private static final String [] names = {"Альма","Багира","Барон","Бим","Боня","Буч","Вольт","Грей","Джек", "Джеси",
            "Дик","Каспер","Лаки","Лорд","Макс","Рей","Рекс","Тaйсон","Том","Хатико","Чарли"};

    public Zoo() {
        fillCollectionWithPetAnimals(pets);
        fillCollectionWithWildAnimals(animals);
    }

    public void fillCollectionWithPetAnimals(Set<? super PetAnimal> pets) {
        int numOfPets = getRandom(MIN_PETS, MAX_PETS + 1);
        do {
            PetAnimal pet;
            if (0 == getRandom(0,2)) {
                pet = new Cat(names[getRandom(0, names.length)]);
            }
            else {
                pet = new Dog(names[getRandom(0, names.length)]);
            }

            if (pets.add(pet)) {
                numOfPets--;
            }
            else {
                System.out.println("Pet is already in zoo: " + pet.getClass().getSimpleName() + " - " + pet.getName() + ". Try another one");
            }
        } while(numOfPets > 0);
    }

    public void fillCollectionWithWildAnimals(Set<? super WildAnimal> animals) {
        int numOfAnimals = getRandom(MIN_ANIMALS, MAX_ANIMALS + 1);
        do {
            WildAnimal animal;
            if (0 == getRandom(0,2)) {
                animal = new Wolf(names[getRandom(0, names.length)]);
            }
            else {
                animal = new Fox(names[getRandom(0, names.length)]);
            }

            if (animals.add(animal)) {
                numOfAnimals--;
            }
            else {
                System.out.println("Animal is already in zoo: " + animal.getClass().getSimpleName() + " - " + animal.getName() + ". Try another one");
            }
        } while(numOfAnimals > 0);
    }

    public void printAnimals() {
        printAnimalsFromCollection(animals);
        printAnimalsFromCollection(pets);
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " - " + animal.getName() + " - eats " + animal.getFavoriteMeal().name().toLowerCase());
        }
    }

    private int getRandom(int minBoundary, int maxBoundary) {
        Random random = new Random();
        if (minBoundary > maxBoundary) {
            throw new IllegalArgumentException("min("+minBoundary+") > max("+maxBoundary+")");
        }
        return minBoundary + random.nextInt(maxBoundary - minBoundary);
    }

}
