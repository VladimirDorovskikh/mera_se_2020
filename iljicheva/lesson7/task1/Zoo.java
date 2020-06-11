package iljicheva.lesson7.task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Zoo {
    Set<WildAnimal> wildAnimalSet;
    Set<PetAnimal> petAnimalSet;
    private final String[] namesOfAnimals = {
            "Vasya",
            "Katya",
            "Musya",
            "Murzik",
            "Den",
            "Kolya",
            "Lika",
            "Zoy",
            "Guna",
            "Loki"
    };

    Zoo(){
        wildAnimalSet = new HashSet<>();
        petAnimalSet = new HashSet<>();
        fillCollectionWithPetAnimal(petAnimalSet);
        fillCollectionWithWildAnimal(wildAnimalSet);
    }

    void fillCollectionWithWildAnimal(Set<WildAnimal> wildAnimalSet){
        int index = new Random().nextInt(4) + 1;
        for(int i = 0; i < index; i++){
            WildAnimal animal;
            if(new Random().nextInt()%2 == 0){
                animal = new Fox(namesOfAnimals[new Random().nextInt(10)]);
            } else {
                animal = new Wolf(namesOfAnimals[new Random().nextInt(10)]);
            }
            if(!wildAnimalSet.add(animal)){
                index--;
                System.out.println(animal.getClass().getSimpleName() + " with name " +
                        animal.getName() + " already exist.");
            }
        }
    }

    void fillCollectionWithPetAnimal(Set<PetAnimal> petAnimalSet){
        int index = new Random().nextInt(7) + 3;
        for(int i = 0; i < index; i++){
            PetAnimal animal;
            if(new Random().nextInt()%2 == 0){
                animal = new Dog(namesOfAnimals[new Random().nextInt(10)]);
            } else {
                animal = new Cat(namesOfAnimals[new Random().nextInt(10)]);
            }
            if(!petAnimalSet.add(animal)){
                index--;
                System.out.println(animal.getClass().getSimpleName() + " with name " +
                        animal.getName() + " already exist.");
            }
        }
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> collection){
        for (Animal animal : collection){
            System.out.println(animal.toString());
        }
    }

    void printAllAnimals(){
        System.out.println("Collection: wild animals");
        printAnimalsFromCollection(wildAnimalSet);
        System.out.println("Collection: pet animals");
        printAnimalsFromCollection(petAnimalSet);
    }
}
