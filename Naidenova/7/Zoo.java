import java.util.*;

public class Zoo {
    static Set<PetAnimal> petAnimalSet;
    static Set<WildAnimal> wildAnimalSet;

    public Zoo(){
        wildAnimalSet = new HashSet<>();
        petAnimalSet = new HashSet<>();
        fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    public void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimals){
        String[] catsList = {"Tom", "Felix", "Simon", "Tim", "Leo"};
        String[] dogsList = {"Beethoven", "Rocky", "Pluto", "Rex", "Leo"};
        int n_pets = new Random().nextInt(4)+1;            //Случайное количество животных(кошек или собак) от 1 до 5
        System.out.println("Random n pets - " + n_pets);
        int choosePet = new Random().nextInt(2);           //Тип животного тоже выбирается случайно.
        if (choosePet==0){
            System.out.println("Choosing pet - cats");
            do {  //генерировать случайное животное и добавлять только уникальное, пока не заполнится нужное количество n_pets
                petAnimals.add(new Cat(catsList[new Random().nextInt(5)]));     //Случайная кошка из списка  5 имен
            } while (petAnimals.size() < n_pets);
        }else {
            System.out.println("Choosing pet - dogs");
            do {  //генерировать случайное животное и добавлять только уникальное, пока не заполнится нужное количество n_pets
                petAnimals.add(new Dog(dogsList[new Random().nextInt(5)]));     //Случайная собак из списка  5 имен
            } while (petAnimals.size() < n_pets);
        }
    }


    public void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimals){
        String[] wolvesList = {"Tom", "Felix", "Simon", "Tim", "Leo", "Baks", "Sam", "Rockfor", "Stepan", "Max"};
        String[] foxesList = {"Beethoven", "Rocky", "Pluto", "Rex", "Leo", "Baks", "Sam", "Rockfor", "Stepan", "Max"};
        int n_wild = new Random().nextInt(7)+3;           //Случайное количество животных(волков или лис) от 3 до 10
        System.out.println("Random n wild - " + n_wild);
        int chooseWild = new Random().nextInt(2);         //Тип животного тоже выбирается случайно.
        if (chooseWild==0){
            System.out.println("Choosing wild - wolves");
            do {  //генерировать случайное животное и добавлять только уникальное, пока не заполнится нужное количество n_wild
                wildAnimals.add(new Woolf(wolvesList[new Random().nextInt(10)]));       //Случайный волк из списка 10 имен
            } while (wildAnimals.size() < n_wild);
        }else {
            System.out.println("Choosing wild - foxes");
            do {  //генерировать случайное животное и добавлять только уникальное, пока не заполнится нужное количество n_wild
                wildAnimals.add(new Fox(foxesList[new Random().nextInt(10)]));          //Случайная лиса из списка  10 имен
            } while (wildAnimals.size() < n_wild);
        }
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> animals){
        System.out.println("\n"+ animals);
    }

    public void printAllAnimals(){
        printAnimalsFromCollection(petAnimalSet);
        printAnimalsFromCollection(wildAnimalSet);
    }


}
