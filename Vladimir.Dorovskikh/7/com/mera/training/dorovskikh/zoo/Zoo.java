package com.mera.training.dorovskikh.zoo;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * класс Zoo, который состоит из двух коллекций уникальных животных:
 * Set<WildAnimal> и Set<PetAnimal>
 * уникальность животного определяется его именем и классом:
 * собака и волк могут быть с одинаковым именем, но двух волков с одинаковым именем быть не может.
 *
 * - В классе создать два метода для заполнения коллекций животными:
 * 1. метод fillCollectionWithPetAnimals на вход принимает коллекцию домашних животных и добавляет в нее случайное (от 1 до 5) количество кошек или собак.
 * Тип животного тоже выбирается случайно.
 * 2. метод fillCollectionWithWildAnimals на вход принимает коллекцию диких животных и добавляет в в нее случайное (от 3 до 10) количество лис или волков.
 * Вызвать оба этим метода в конструкторе для заполнения зоопарка.
 * - создать приватный метод printAnimalsFromCollection, который на вход принимает коллекцию животных и печатает их имена на экран
 * - создать публичный метод printAllAnimals, который печатает на экран  из  коллекций с домашними и дикими животными, использую приватный метод
 * printAnimalsFromCollection
 */
public class Zoo
{
    Set<PetAnimal> petAnimalSet = new HashSet<>();
    Set<WildAnimal> wildAnimalSet = new HashSet<>();

    public Zoo()
    {
        fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimalSet)
    {
        Random r = new Random();
        //int counter = r.nextInt(5)+1;
        int counter = 5;
        PetAnimal  somePetAnimal;
        for (int i = 0; i < counter; i++)
        {
            switch (r.nextInt(2))
            {
                case 0:
                    while(!petAnimalSet.add(new Dog()));
                    break;
                case 1:
                default:
                    while(!petAnimalSet.add(new Cat()));
                    break;
            }
        }
    }

    void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimalSet)
    {
        Random r = new Random();
        int counter = r.nextInt(8)+3;
        for (int i = 0; i < counter; i++)
        {
            switch(r.nextInt(2))
            {
                case 0:
                    while(!wildAnimalSet.add(new Wolf()));
                    break;
                case 1:
                default:
                    while(!wildAnimalSet.add(new Fox()));
                    break;
            }
        }
    }

    private void printAnimalsFromCollection(Set<?> animalSet)
    {
        for (Object o : animalSet)
        {
            System.out.println(o.toString());
        }
    }

    public void printAllAnimals()
    {
        printAnimalsFromCollection(petAnimalSet);
        printAnimalsFromCollection(wildAnimalSet);
    }
}
