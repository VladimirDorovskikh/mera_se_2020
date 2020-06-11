package iljicheva.lesson7.task1;

class Cat extends PetAnimal {
    Cat(String name) {
        super(name);
    }

    @Override
    String getFavoriteMeal() {
        return "milk";
    }
}
