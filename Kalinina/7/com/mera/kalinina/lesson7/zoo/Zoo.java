package com.mera.kalinina.lesson7.zoo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {

    private Set<WildAnimal> wildAnimals;
    private Set<PetAnimal> petAnimals;

    public Zoo() {
        wildAnimals = new HashSet<>();
        petAnimals = new HashSet<>();
        this.fillCollectionWithWildAnimals(wildAnimals);
        this.fillCollectionWithPetAnimals(petAnimals);
    }

    private void fillCollectionWithWildAnimals(Collection<WildAnimal> wildAnimalCollection) {
        String[] animalNames = {"Zak", "Oskar", "Alice", "Moon", "Saymon","Akela", "Grey", "Zevz", "Amber", "Nick"};
        int randomAnimalNumber = Utils.getRandomIntFromInterval(3, 10);
        while(randomAnimalNumber != 0) {
            int randomAnimalType = new Random().nextInt(2); // Fox and Wolf
            if(randomAnimalType == 0) {
                String randomName = animalNames[new Random().nextInt(animalNames.length)];
                if(wildAnimalCollection.add(new Fox(randomName))) {
                    randomAnimalNumber--;
                }
            }
            else {
                String randomName = animalNames[new Random().nextInt(animalNames.length)];
                if(wildAnimalCollection.add(new Wolf(randomName))) {
                    randomAnimalNumber--;
                }
            }
        }
    }

    private void fillCollectionWithPetAnimals(Collection<PetAnimal> petAnimalCollection) {
        String[] animalNames = {"Barsik", "Vaska", "Murka", "Mashka", "Fiona", "Charlie", "Luke", "Buddy", "Toby", "Richy"};
        int randomAnimalNumber = Utils.getRandomIntFromInterval(1, 5);
        while(randomAnimalNumber != 0) {
            int randomAnimalType = new Random().nextInt(2); // Cats and Dogs
            if(randomAnimalType == 0) {
                String randomName = animalNames[new Random().nextInt(animalNames.length)];
                if(petAnimalCollection.add(new Cat(randomName))) {
                    randomAnimalNumber--;
                }
            }
            else {
                String randomName = animalNames[new Random().nextInt(animalNames.length)];
                if(petAnimalCollection.add(new Dog(randomName))) {
                    randomAnimalNumber--;
                }
            }
        }
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> animals) {
        for(Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(wildAnimals);
        printAnimalsFromCollection(petAnimals);
    }
}
