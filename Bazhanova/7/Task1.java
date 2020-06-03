import java.util.*;
import java.util.Random;


public class Task1 {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.printAllAnimals();

    }
}

abstract class Animal {

    String name;

    public abstract String getFavoriteMeal();

}

class WildAnimal extends Animal {
    String favoriteMeal;

    public String getFavoriteMeal() {
        return favoriteMeal;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof WildAnimal)) {
            return false;
        }

        WildAnimal animal = (WildAnimal) o;

        return animal.name.equals(name) &&
            animal.favoriteMeal.equals(favoriteMeal);
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + favoriteMeal.hashCode();
        return result;
    }
}

class PetAnimal extends Animal {
    String favoriteMeal;

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof PetAnimal)) {
            return false;
        }

        PetAnimal animal = (PetAnimal) o;

        return animal.name.equals(name) &&
            animal.favoriteMeal.equals(favoriteMeal);
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + favoriteMeal.hashCode();
        return result;
    }
}

class Cat extends PetAnimal {

    public Cat(String name, String favoriteMeal) {
        this.name = name;
        this.favoriteMeal = favoriteMeal;
    }

    @Override
    public String toString() {
        return ("Кот: " + name + ", любимая еда - " + this.favoriteMeal);
    }
}

class Dog extends PetAnimal {

    public Dog(String name, String favoriteMeal) {
        this.name = name;
        this.favoriteMeal = favoriteMeal;
    }

    @Override
    public String toString() {
        return ("Собака: " + name + ", любимая еда - " + this.favoriteMeal);
    }

}

class Wolf extends WildAnimal {

    public Wolf(String name, String favoriteMeal) {
        this.name = name;
        this.favoriteMeal = favoriteMeal;
    }

    @Override
    public String toString() {
        return ("Волк: " + name + ", любимая еда - " + this.favoriteMeal);
    }
}

class Fox extends WildAnimal {

    public Fox(String name, String favoriteMeal) {
        this.name = name;
        this.favoriteMeal = favoriteMeal;
    }

    @Override
    public String toString() {
        return ("Лиса: " + name + ", любимая еда - " + this.favoriteMeal);
    }
}

class Zoo {
    private final int MIN_PET = 1;
    private final int MAX_PET = 5;
    private final int MIN_WILD = 3;
    private final int MAX_WILD = 10;

    private final String[] names = new String[] {
        "Мефистофель",
        "Кот Бегемот",
        "Пельмень",
        "Фугас",
        "Кабачок",
        "Идефикс",
        "Гаргантюа",
        "Баранка",
        "Злодей",
        "Шерстяная Хрень",
        "Бешеная Мухоловка"
    };

    private final String[] food = new String[] {
        "мясо",
        "укроп",
        "батон",
        "котлеты",
        "рыба",
        "морковь",
        "курица",
        "картошка",
        "грибы",
        "паштет",
        "молоко"
    };

    private Set < WildAnimal > wildAnimalSet;
    private Set < PetAnimal > petAnimalSet;



    public Zoo() {
        wildAnimalSet = new HashSet < > ();
        petAnimalSet = new HashSet < > ();
        this.fillCollectionWithWildAnimals(wildAnimalSet);
        this.fillCollectionWithPetAnimals(petAnimalSet);
    }


    public void fillCollectionWithWildAnimals(Set < WildAnimal > wildAnimalSet) {

        Random rnd = new Random(System.currentTimeMillis());
        int numWildAnimals = MIN_WILD + rnd.nextInt(MAX_WILD - MIN_WILD + 1);

        for (int i = 0; i < numWildAnimals; i++) {
            switch (rnd.nextInt() % 2) {
                case (0):
                    {
                        wildAnimalSet.add(new Fox(names[rnd.nextInt(names.length)], food[rnd.nextInt(food.length)]));
                        break;
                    }
                case (1):
                    {
                        wildAnimalSet.add(new Wolf(names[rnd.nextInt(names.length)], food[rnd.nextInt(food.length)]));
                        break;
                    }
                default:
                    break;
            }

        }

    }

    public void fillCollectionWithPetAnimals(Set < PetAnimal > petAnimalSet) {

        petAnimalSet.add(new Cat("Васька", "мясо"));
        petAnimalSet.add(new Cat("Васька", "мясо"));
        petAnimalSet.add(new Cat("Васька", "мясо"));


        Random rnd = new Random(System.currentTimeMillis());
        int numPetAnimals = MIN_PET + rnd.nextInt(MAX_PET - MIN_PET + 1);

        for (int i = 0; i < numPetAnimals; i++) {
            switch (rnd.nextInt() % 2) {
                case (0):
                    {
                        petAnimalSet.add(new Cat(names[rnd.nextInt(names.length)], food[rnd.nextInt(food.length)]));
                        break;
                    }
                case (1):
                    {
                        petAnimalSet.add(new Dog(names[rnd.nextInt(names.length)], food[rnd.nextInt(food.length)]));
                        break;
                    }
                default:
                    break;
            }

        }
    }

    private void printAnimalsFromCollection(Set < ? extends Animal > animalSet) {
        System.out.println(Arrays.toString(animalSet.toArray()));
    }

    public void printAllAnimals() {
        System.out.println("Дикие животные: ");
        printAnimalsFromCollection(wildAnimalSet);

        System.out.println("Домашние животные: ");
        printAnimalsFromCollection(petAnimalSet);
    }


}
