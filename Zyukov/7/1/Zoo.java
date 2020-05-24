package lecture7.task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private final String possibleNames[] = {"Jack", "Bonny", "Lord", "Jessy", "Allma", "Beem", "Alex", "Gerda"};
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
                    animals.add(new Cat(possibleNames[new Random().nextInt(possibleNames.length)]));
                    break;
                default:
                    animals.add(new Dog(possibleNames[new Random().nextInt(possibleNames.length)]));
                    break;
            }
        }
    }

    public void fillCollectionWithWildAnimals(Set<WildAnimal> animals) {
        int randNumber = new Random().nextInt(8) + 3;

        for (int i = 0; i < randNumber; i++) {
            switch (new Random().nextInt(2)) {
                case 0:
                    animals.add(new Fox(possibleNames[new Random().nextInt(possibleNames.length)]));
                    break;
                default:
                    animals.add(new Wolf(possibleNames[new Random().nextInt(possibleNames.length)]));
                    break;
            }
        }
    }

    private <T> void printAnimalsFromCollection(Set<T> animals) {
        for (T animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public void printAnimals() {
        printAnimalsFromCollection(wildAnimalSet);
        printAnimalsFromCollection(petAnimalSet);
    }
}
