package com.mera.training.task07;

import java.util.*;

public class Zoo {

    private Set<PetAnimal> petSet;
    private Set<WildAnimal> wildSet;

    public Zoo() {
        this.petSet = new HashSet<PetAnimal>();
        this.wildSet = new HashSet<WildAnimal>();

        fillCollectionWithPetAnimals(petSet);
        fillCollectionWithWildAnimals(wildSet);
    }

    private void fillCollectionWithPetAnimals(Set<PetAnimal> petSet) {
        String[] catNames = {"CatName01", "CatName02", "CatName03", "CatName04", "CatName05"};
        String[] dogNames = {"DogName01", "DogName02", "DogName03", "DogName04", "DogName05"};

        final int minPet = 1;
        final int maxPet = 5;

        Random random = new Random();
        int petCounter = random.nextInt(minPet + ((maxPet - minPet) + 1));

        for (int i = 0; i < petCounter; i++) {
            if  (random.nextBoolean()) {
                petSet.add(new Cat(catNames[random.nextInt(catNames.length)]));
            }
            else {
                petSet.add(new Dog(dogNames[random.nextInt(dogNames.length)]));
            }
        }
    }

    private void fillCollectionWithWildAnimals(Set<WildAnimal> wildSet) {
        String[] wolfNames = {"WolfName01", "WolfName02", "WolfName03", "WolfName04", "WolfName05"};
        String[] foxNames = {"FoxName01", "FoxName02", "FoxName03", "FoxName04", "FoxName05"};

        final int minWild = 3;
        final int maxWild = 10;

        Random random = new Random();
        int wildCounter = random.nextInt(minWild + ((maxWild - minWild) + 1));

        for (int i = 0; i < wildCounter; i++) {
            if  (random.nextBoolean()) {
                wildSet.add(new Wolf(wolfNames[random.nextInt(wolfNames.length)]));
            }
            else {
                wildSet.add(new Fox(foxNames[random.nextInt(foxNames.length)]));
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet) {
        System.out.println("\n" + Arrays.toString(animalSet.toArray()));
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petSet);
        printAnimalsFromCollection(wildSet);
    }
}
