import java.util.*;

public class Zoo {

    Set<WildAnimal> wildAnimals = new HashSet<>();
    Set<PetAnimal> petAnimals = new HashSet<>();


    public void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimals) {
        String[] catsList = {"Maxim", "Tom", "Barsik", "Pushok", "Tim", "Red"};
        String[] dogsList = {"Milo", "Beam", "Lord", "Rex", "Jack"};
        Random r = new Random();
        int qtyOfPets = new Random().nextInt(4) + 1;
        System.out.println("Adding " + qtyOfPets + " pets");
        for (int i = 0; i < qtyOfPets; i++) {
            int classChooser = new Random().nextInt(10);
            if (classChooser < 5) {
                petAnimals.add(new Cat(catsList[r.nextInt(catsList.length)], Meal.getRandomMeal()));
            } else {
                petAnimals.add(new Dog(dogsList[r.nextInt(dogsList.length)], Meal.getRandomMeal()));
            }
        }
    }

    public void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimals) {
        String[] foxList = {"Maxim", "Tom", "Barsik", "Pushok", "Tim", "Red"};
        String[] wolfList = {"Milo", "Beam", "Lord", "Rex", "Jack"};
        Random r = new Random();
        int qtyOfWilds = new Random().nextInt(10) + 3;
        System.out.println("Adding " + qtyOfWilds + " wild animals");
        for (int i = 0; i < qtyOfWilds; i++) {
            int classChooser = new Random().nextInt(10);
            if (classChooser < 5) {
                wildAnimals.add(new Fox(foxList[r.nextInt(foxList.length)], Meal.getRandomMeal()));
            } else {
                wildAnimals.add(new Wolf(wolfList[r.nextInt(wolfList.length)], Meal.getRandomMeal()));
            }
        }
    }

    public Zoo() {
        fillCollectionWithWildAnimals(wildAnimals);
        fillCollectionWithPetAnimals(petAnimals);
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> animals) {
        System.out.println("\n" + animals);
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petAnimals);
        printAnimalsFromCollection(wildAnimals);
    }
}
