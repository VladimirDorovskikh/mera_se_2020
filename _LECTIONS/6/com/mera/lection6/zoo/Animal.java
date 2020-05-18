package com.mera.lection6.zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Animal {
    abstract void saySomething();

    public static class Cat extends Animal {
        void saySomething() {
            System.out.println("Мяу");
        }
    }
    public static class Dog extends Animal {
        void saySomething() {
            System.out.println("Гав");
        }
    }

    public static void makeNoise(Collection<Animal> animals) {
        for (Animal animal : animals) {
            animal.saySomething();
        }
    }

    public static void addDogToCollection(Collection<? super Dog> animals) {
        animals.add(new Dog());
        for (Object animal : animals) {
       //     animal.saySomething();
        }
    }

    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        final Cat aCat = new Cat();
        zoo.add(aCat);

        final Dog aDog = new Dog();
        zoo.add(aDog);

        final Animal animal = zoo.get(0);
        animal.saySomething();

        makeNoise(zoo);

        List<Cat> catsOnly = new ArrayList<>();
        catsOnly.add(aCat);

        List<Dog> dogsOnly = new ArrayList<>();
        dogsOnly.add(aDog);

      //  makeNoise(dogsOnly);
      //  makeNoise(catsOnly);

    }



}
