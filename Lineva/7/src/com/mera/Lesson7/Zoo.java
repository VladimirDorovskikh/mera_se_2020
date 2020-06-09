package com.mera.Lesson7;

import java.util.*;

class Zoo {
    Set<WildAnimal> wildAnimals = new HashSet<>();
    Set<PetAnimal> petAnimals = new HashSet<>();

    Random random = new Random();

    enum PetAnimals {CAT, DOG}
    enum WildAnimals {FOX, WOLF}

    final static int PET_ANIMALS_MIN_NUMBER = 1, PET_ANIMALS_MAX_NUMBER = 5;
    final static int WILD_ANIMALS_MIN_NUMBER = 3, WILD_ANIMALS_MAX_NUMBER = 10;

    public Zoo() {
        fillCollectionWithPetAnimals(petAnimals);
        fillCollectionWithWildAnimals(wildAnimals);
    }

    private void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimals) {
        int animalsNumber = random.nextInt(PET_ANIMALS_MAX_NUMBER) + PET_ANIMALS_MIN_NUMBER;

        for (int i = 0; i < animalsNumber; i++) {
            int petAnimalIndex = random.nextInt(PetAnimals.values().length);
            switch(PetAnimals.values()[petAnimalIndex]) {
                case CAT:
                    while (!petAnimals.add(new Cat()));
                    break;
                case DOG:
                    while (!petAnimals.add(new Dog()));
                    break;
            }
        }
    }

    private void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimals) {
        int animalsNumber = random.nextInt(WILD_ANIMALS_MAX_NUMBER - WILD_ANIMALS_MIN_NUMBER + 1) + WILD_ANIMALS_MIN_NUMBER;

        for (int i = 0; i < animalsNumber; i++) {
            int wildAnimalIndex = random.nextInt(WildAnimals.values().length);
            switch(WildAnimals.values()[wildAnimalIndex]) {
                case FOX:
                    while (!wildAnimals.add(new Fox()));
                    break;
                case WOLF:
                    while (!wildAnimals.add(new Wolf()));
                    break;
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal.toString());
        }
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(wildAnimals);
        printAnimalsFromCollection(petAnimals);
    }
}