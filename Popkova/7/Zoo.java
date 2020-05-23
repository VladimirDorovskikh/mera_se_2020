import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private static final short MIN_PET_BOUND = 1;
    private static final short MAX_PET_BOUND = 5;
    private static final short MIN_WILD_BOUND = 3;
    private static final short MAX_WILD_BOUND = 10;
    private static final short MAX_INDEX_BOUND = 5;

    public Set<WildAnimal> wildAnimalSet;
    public Set<PetAnimal> petAnimalSet;

    public Zoo() {
        wildAnimalSet = new HashSet<>();
        petAnimalSet = new HashSet<>();
        fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    private void fillCollectionWithPetAnimals(Set<? super PetAnimal> animalSet) {
        int size = new Random().nextInt(MAX_PET_BOUND - MIN_PET_BOUND + 1) + MIN_PET_BOUND;
        String[] names = {"Bobik", "Sharik", "Vas'ka", "Timofey", "Graf"};
        for(int i = 0; i < size; i++) {
            int index = new Random().nextInt(MAX_INDEX_BOUND);
            boolean isCat = new Random().nextBoolean();
            if(isCat) {
                animalSet.add(new Cat(names[index]));
            }
            else {
                animalSet.add(new Dog(names[index]));
            }
        }
    }

    private void fillCollectionWithWildAnimals(Set<? super WildAnimal> animalSet) {
        int size = new Random().nextInt(MAX_WILD_BOUND - MIN_WILD_BOUND + 1) + MIN_WILD_BOUND;
        String[] names = {"Leopold", "Mikhail", "Charles", "Simona", "Tyoma"};
        for(int i = 0; i < size; i++) {
            int index = new Random().nextInt(MAX_INDEX_BOUND);
            boolean isWolf = new Random().nextBoolean();
            if(isWolf) {
                animalSet.add(new Wolf(names[index]));
            }
            else {
                animalSet.add(new Fox(names[index]));
            }
        }
    }

    public void printAllAnimals() {
        System.out.println("Pets:");
        printAnimalsFromCollection(petAnimalSet);
        System.out.println("Wild animals:");
        printAnimalsFromCollection(wildAnimalSet);
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet) {
        for (Animal animal : animalSet) {
            System.out.println(animal.getClass().getSimpleName() + " - " + animal.getName());
        }
            System.out.println();
    }
}