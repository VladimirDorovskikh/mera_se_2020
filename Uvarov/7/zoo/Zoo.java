package mera.zoo;

import mera.animals.*;

import java.util.*;

public class Zoo {
    private final int MIN_PET_ANIMALS = 1;
    private final int MAX_PET_ANIMALS = 5;
    private final int MIN_WILD_ANIMALS = 3;
    private final int MAX_WILD_ANIMALS = 10;

    private Set<WildAnimal> wildAnimalSet;
    private Set<PetAnimal> petAnimalSet;

    public Zoo() {
        wildAnimalSet = new HashSet<>();
        petAnimalSet = new HashSet<>();
        this.fillCollectionWithWildAnimals(wildAnimalSet);
        this.fillCollectionWithPetAnimals(petAnimalSet);
    }

    private void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimalSet) {
        String[] wolfNames = {"Alpha", "Akela", "Seriy", "Volk", "Volchara"};
        String[] foxNames = {"Alice", "Lizaveta", "Patrikeevna", "RedFox", "StonedFox"};

        Random rnd = new Random();
        int numberOfAnimals = rnd.nextInt(MAX_WILD_ANIMALS - MIN_WILD_ANIMALS + 1) + MIN_WILD_ANIMALS;

        for (int i = 0; i < numberOfAnimals; i++) {
            boolean isWolfToCreate = rnd.nextBoolean();
            if (isWolfToCreate) {
                int wolfNameIndex = rnd.nextInt(wolfNames.length);
                wildAnimalSet.add(new Wolf(wolfNames[wolfNameIndex]));
            } else {
                int foxNameIndex = rnd.nextInt(foxNames.length);
                wildAnimalSet.add(new Fox(foxNames[foxNameIndex]));
            }
        }
    }

    private void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimalSet) {
        String[] catNames = {"Snowball", "Barsik", "Begemot", "Bazilio", "Matroskin", "Myauchelo"};
        String[] dogNames = {"WhiteFang", "Sharik", "Sparky", "Backster", "Hachiko", "Reks"};

        Random rnd = new Random();
        int numberOfAnimals = rnd.nextInt(MAX_PET_ANIMALS - MIN_PET_ANIMALS + 1) + MIN_PET_ANIMALS;

        for (int i = 0; i < numberOfAnimals; i++) {
            boolean isCatToCreate = rnd.nextBoolean();
            if (isCatToCreate) {
                int catNameIndex = rnd.nextInt(catNames.length);
                petAnimalSet.add(new Cat(catNames[catNameIndex]));
            } else {
                int dogNameIndex = rnd.nextInt(dogNames.length);
                petAnimalSet.add(new Dog(dogNames[dogNameIndex]));
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet) {
        System.out.println(Arrays.toString(animalSet.toArray()));
    }

    public void printAllAnimals(){
        System.out.println("Wild animals: " + wildAnimalSet.size());
        printAnimalsFromCollection(wildAnimalSet);
        System.out.println("Pet animals: " + petAnimalSet.size());
        printAnimalsFromCollection(petAnimalSet);
    }
}
