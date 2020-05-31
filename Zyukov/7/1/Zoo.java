package lecture7.task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private final String possibleNames[] = {"Jack", "Bonny", "Lord", "Jessy", "Allma", "Beem", "Alex", "Gerda", "Max",
            "Ray", "Casper"};
    private Set<WildAnimal> wildAnimalSet = new HashSet<>();
    private Set<PetAnimal> petAnimalSet = new HashSet<>();

    public Zoo() {
        fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    private void fillCollectionWithPetAnimals(Set<PetAnimal> animals) {
        int randNumber = new Random().nextInt(5) + 1;

        for (int i = 0; i < randNumber; i++) {
            switch (new Random().nextInt(2)) {
                case 0:
                    animals.add(new Cat(possibleNames[i]));
                    break;
                default:
                    animals.add(new Dog(possibleNames[i]));
                    break;
            }
        }
    }

    public void fillCollectionWithWildAnimals(Set<WildAnimal> animals) {
        int randNumber = new Random().nextInt(8) + 3;

        for (int i = 0; i < randNumber; i++) {
            switch (new Random().nextInt(2)) {
                case 0:
                    animals.add(new Fox(possibleNames[i]));
                    break;
                default:
                    animals.add(new Wolf(possibleNames[i]));
                    break;
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public void printAnimals() {
        printAnimalsFromCollection(wildAnimalSet);
        printAnimalsFromCollection(petAnimalSet);
    }
}
