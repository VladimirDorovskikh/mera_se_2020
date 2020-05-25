package com.mera.training.task07;

import java.util.*;

public class Zoo {

    private Set<PetAnimal> petSet = new HashSet<>();
    private Set<WildAnimal> wildSet = new HashSet<>();

    public Zoo() {
        fillCollectionWithPetAnimals(petSet);
        fillCollectionWithWildAnimals(wildSet);
    }

    private void fillCollectionWithPetAnimals(Set<PetAnimal> petSet) {
        String[] catNames = {"CatName01", "CatName02", "CatName03", "CatName04", "CatName05"};
        String[] dogNames = {"DogName01", "DogName02", "DogName03", "DogName04", "DogName05"};

        final int minPet = 1;
        final int maxPet = 5;

        Random random = new Random();
        int petCounter = random.nextInt(minPet + (int) (Math.random() * ((maxPet - minPet) + 1)));

        for (int i = 0; i < petCounter; i++) {
            int randPet = new Random().nextInt(petCounter);
            if  (random.nextBoolean()) {
                do {
                    if (petSet.isEmpty() || !petSet.toString().contains(catNames[randPet])) {
                        petSet.add(new Cat(catNames[randPet]));
                        break;
                    }
                } while (petSet.size() < randPet);
            }
            else {
                do {
                    if (petSet.isEmpty() || !petSet.toString().contains(dogNames[randPet])) {
                        petSet.add(new Dog(dogNames[randPet]));
                        break;
                    }
                } while (petSet.size() < randPet);
            }
        }
    }

    private void fillCollectionWithWildAnimals(Set<WildAnimal> wildSet) {
        String[] wolfNames = {"WolfName01", "WolfName02", "WolfName03", "WolfName04", "WolfName05"};
        String[] foxNames = {"FoxName01", "FoxName02", "FoxName03", "FoxName04", "FoxName05"};

        final int minWild = 3;
        final int maxWild = 10;

        Random random = new Random();
        int wildCounter = random.nextInt(minWild + (int) (Math.random() * ((maxWild - minWild) + 1)));

        for (int i = 0; i < wildCounter; i++) {
            int randWild = new Random().nextInt(wildCounter);
            if  (random.nextBoolean()) {
                do {
                    if (wildSet.isEmpty() || !wildSet.toString().contains(wolfNames[randWild])) {
                        wildSet.add(new Wolf(wolfNames[randWild]));
                        break;
                    }
                } while (wildSet.size() < randWild);
            }
            else {
                do {
                    if (wildSet.isEmpty() || !wildSet.toString().contains(foxNames[randWild])) {
                        wildSet.add(new Fox(foxNames[randWild]));
                        break;
                    }
                } while (wildSet.size() < randWild);
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet) {
        System.out.println("\n" + animalSet.toString());
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petSet);
        printAnimalsFromCollection(wildSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(petSet, zoo.petSet) &&
                Objects.equals(wildSet, zoo.wildSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petSet, wildSet);
    }
}
