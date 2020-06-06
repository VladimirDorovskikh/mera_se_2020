package com.mera.volsenkov.lesson7.zoo;
import java.util.*;

public class Zoo {
    private Set<WildAnimal> wildAnimals;
    private Set<PetAnimal> petAnimals;
    private static Random rand = new Random();
    private static String[] names = {
            "Алиса", "Василий", "Умка", "Герда", "Снежок", "Рыжик", "Барбос", "Энокентий", "Белый", "Рыжый", "Пушок",
            "Соня", "Белка", "Стрелка", "Джек"
    };
    public Zoo() {
        wildAnimals = new HashSet<>();
        petAnimals =  new HashSet<>();
        fillCollectionWithPetAnimals(petAnimals);
        fillCollectionWithWildAnimals(wildAnimals);
    }

    private void fillCollectionWithPetAnimals(Collection<PetAnimal> petAnimals)
    {
        int additionalPets = rand.nextInt(4) + 1;
        while(additionalPets>0){
            String randName = names[rand.nextInt(names.length)];
            PetAnimal pet;
            if(rand.nextInt(2)==0)
            {
               pet = new Cat(randName);
            }
            else
            {
                pet = new Dog(randName);
            }
            if(petAnimals.add(pet))
            {
                additionalPets--;
            }
        }
    }

    private void fillCollectionWithWildAnimals(Collection<WildAnimal> wildAnimals)
    {
        int additionalAnimals = rand.nextInt(7) + 3;
        while(additionalAnimals>0){
            String randName = names[rand.nextInt(names.length)];
            WildAnimal animal;
            if(rand.nextInt(2)==0)
            {
                animal = new Fox(randName);
            }
            else
            {
                animal = new Wolf(randName);
            }
            if(wildAnimals.add(animal))
            {
                additionalAnimals--;
            }
        }
    }
    private void printAnimalsFromCollection(Collection<? extends Animal> animals)
    {
        for(Animal animal:animals)
        {
            System.out.println(animal);
        }
    }
    public void printAllAnimals()
    {
        System.out.println("Pet animals:");
        printAnimalsFromCollection(petAnimals);
        System.out.println();
        System.out.println("Wild animals:");
        printAnimalsFromCollection(wildAnimals);

    }
}
