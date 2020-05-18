package com.mera.lection6;

import java.util.ArrayList;
import java.util.List;

public class AnimalsTest {

   static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }
    static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        public void giveBone() {
            System.out.println("Собка съела косточку");
        }
    }

    static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {

        final Dog sharik = new Dog("Шарик");
        final Dog barbos = new Dog("Барбос");
        Dog[] dogs = new Dog[3];
        dogs[0] = sharik;
        dogs[1] = barbos;
        printAnimalsArray(dogs);

        for (Dog dog : dogs) {
            dog.giveBone();
        }


        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(sharik);
        dogsList.add(barbos);

      //  printAnimals(dogsList);
    }


   static void printAnimalsArray(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.name);
            }
        }

       animals[2] = new Cat("Васька");
    }

   static void printAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
