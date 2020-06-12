/**
 * Дженерики и коллекции
 * 1. Коллекционный зоопарк
 * - Создать абстрактный класс Animal с полем для имени (name - String) и абстрактным методом getFavoriteMeal() - который возвращает любимую еду животного.
 * - Создать два класса наследника от Animal: WildAnimal и PetAnimal: дикие и домашние животные
 * - Создать классы для конкретных животных: кошка, собака, волк, лиса. Реализовать метод getFavoriteMeal().
 * Создать класс Zoo, который состоит из двух коллекций уникальных животных:
 * Set<WildAnimal> и Set<PetAnimal>
 * уникальность животного определяется его именем и классом: собака и волк могут быть с одинаковым именем, но двух волков с одинаковым именем быть не может.
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

package Rafis.u7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Problem1 {
    static final Random random = new Random();

    abstract class Animal {
        private String name;

        Animal() {
            this.name = ANIMAL_NAMES[random.nextInt(ANIMAL_NAMES.length)];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + " named '" + name + '\'';
        }

        abstract String getFavoriteMeal();
    }

    class WildAnimal extends Animal {
        @Override
        String getFavoriteMeal() {
            return null;
        }
    }

    class PetAnimal extends Animal {
        @Override
        String getFavoriteMeal() {
            return null;
        }
    }

    class Cat extends PetAnimal {
        @Override
        String getFavoriteMeal() {
            return "Fish";
        }
    }

    class Dog extends PetAnimal {
        @Override
        String getFavoriteMeal() {
            return "Bone";
        }
    }

    class Wolf extends WildAnimal {
        @Override
        String getFavoriteMeal() {
            return "Red Hat";
        }
    }

    class Fox extends WildAnimal {
        @Override
        String getFavoriteMeal() {
            return "Chicken";
        }
    }

    static final String[] ANIMAL_NAMES = {"Bob", "Marley", "Stan", "Robby", "Lukas", "Belka", "Strelka", "Druzhok"};

    class Zoo {
        private Set<WildAnimal> wildAnimals = new HashSet<>();
        private Set<PetAnimal> petAnimals = new HashSet<>();

        Zoo() {
            fillCollectionWithPetAnimals(petAnimals);
            fillCollectionWithWildAnimals(wildAnimals);
        }

        private void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimals) {
            final int MIN_NUM = 1;
            final int MAX_NUM = 5;

            final int animalNum = random.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
            for (int i = 0; i < animalNum; i++) {
                final String animalName = ANIMAL_NAMES[random.nextInt(ANIMAL_NAMES.length)];
                if (random.nextInt() > 0) {
                    petAnimals.add(new Cat());
                } else {
                    petAnimals.add(new Dog());
                }
            }
        }

        private void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimals) {
            final int MIN_NUM = 3;
            final int MAX_NUM = 10;

            final int animalNum = random.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
            for (int i = 0; i < animalNum; i++) {
                final String animalName = ANIMAL_NAMES[random.nextInt(ANIMAL_NAMES.length)];
                if (random.nextInt() > 0) {
                    wildAnimals.add(new Fox());
                } else {
                    wildAnimals.add(new Wolf());
                }
            }
        }

        private void printAnimalsFromCollection(Set<? extends Animal> animals) {
            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }
        }

        public void printAllAnimals() {
            System.out.println("\nPet animals:\n");
            printAnimalsFromCollection(wildAnimals);
            System.out.println("\nWild animals:\n");
            printAnimalsFromCollection(petAnimals);
        }
    }

    void doTheJob() {
        Zoo zoo = new Zoo();
        zoo.printAllAnimals();
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.doTheJob();
    }
}
