package iljicheva.lesson7.task1;

class WildAnimal extends Animal {
    WildAnimal(String name) {
        this.name = name;
    }

    @Override
    String getFavoriteMeal() {
        return null;
    }
}
