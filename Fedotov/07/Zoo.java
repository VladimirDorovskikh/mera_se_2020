package com.mera.training.task07;

import java.util.*;

public class Zoo {

    private Set<PetAnimal> petSet = new HashSet<>();
    private Set<WildAnimal> wildSet = new HashSet<>();

    public Zoo() {
        fillCollectionWithPetAnimals(petSet);
        fillCollectionWithWildAnimals(wildSet);
    }

    String[] animalNames = {"Name01", "Name02", "Name03", "Name04", "Name05", "Name06", "Name07", "Name08", "Name09", "Name10"};

    private void fillCollectionWithPetAnimals(Set<PetAnimal> petSet) {
        final int minPet = 1;
        final int maxPet = 5;

        Random random = new Random();
        int randPet = random.nextInt(maxPet) + minPet;
        if (randPet > maxPet) {randPet = maxPet;}
        if (random.nextBoolean()) {
            do {
                petSet.add(new Cat(animalNames[random.nextInt(animalNames.length)]));
            } while (petSet.size() < randPet);
        } else {
            do {
                 petSet.add(new Dog(animalNames[random.nextInt(animalNames.length)]));
            } while (petSet.size() < randPet);
        }
    }

    private void fillCollectionWithWildAnimals(Set<WildAnimal> wildSet) {
        final int minWild = 3;
        final int maxWild = 10;

        Random random = new Random();
        int randWild = random.nextInt(maxWild) + minWild;
        if (randWild > maxWild) {randWild = maxWild;}
        if (random.nextBoolean()) {
            do {
                wildSet.add(new Wolf(animalNames[random.nextInt(animalNames.length)]));
            } while (wildSet.size() < randWild);
        } else {
            do {
                wildSet.add(new Fox(animalNames[random.nextInt(animalNames.length)]));
            } while (wildSet.size() < randWild);
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet) {
        System.out.println("\n" + animalSet.toString());
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petSet);
        printAnimalsFromCollection(wildSet);
    }
}
