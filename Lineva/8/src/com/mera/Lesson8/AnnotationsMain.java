package com.mera.Lesson8;


import java.util.ArrayList;
import java.util.List;

class AnnotationsMain {
    public static void main(String[] args) {

        System.out.println("Persons list:\n");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person());
        persons.add(new Person("John", "Johnson"));
        persons.add(new Person("Jack", "Jackson", "J.", 1, "111"));
        persons.add(new Person("Richard", "Richardson", "R.", 20, "222222"));

        for (Person person: persons) {
            System.out.println(person.toString());
        }

        System.out.println();
        System.out.print("Serialized:\n");
        String serializedPersons = Serializer.serializeObjects(persons);
        System.out.println(serializedPersons);

        System.out.print("Deserialized persons list:\n");
        Object[] deserializedPersons = Deserializer.deserializeObjects(serializedPersons, Person.class);
        for (int i = 0; i< deserializedPersons.length; i++){
            Person person = (Person) deserializedPersons[i];
            if (person != null) {
                System.out.println(person.toString());
            }
        }

        System.out.println();
        System.out.println("Animals list:\n");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal("Rabbit"));
        animals.add(new Animal("Cat", 1, "Mouse"));
        animals.add(new Animal("Dog", 2, "Bone"));

        for (Animal animal: animals) {
            System.out.println(animal.toString());
        }
        System.out.println();
        System.out.print("Serialized:\n");
        String serializedAnimals = Serializer.serializeObjects(animals);
        System.out.println(serializedAnimals);

        System.out.print("Deserialized animals list:\n");
        Object[] deserializedAnimals = Deserializer.deserializeObjects(serializedAnimals, Animal.class);
        for (int i = 0; i< deserializedAnimals.length; i++){
            Animal animal = (Animal) deserializedAnimals[i];
            if (animal != null) {
                System.out.println(animal.toString());
            }
        }
    }
}