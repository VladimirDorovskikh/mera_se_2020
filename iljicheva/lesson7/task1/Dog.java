package iljicheva.lesson7.task1;

class Dog extends PetAnimal {
    Dog(String name) {
        super(name);
    }

    @Override
    String getFavoriteMeal() {
        return "bone";
    }
}
