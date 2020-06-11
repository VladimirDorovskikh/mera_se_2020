package iljicheva.lesson7.task1;

class Fox extends WildAnimal {
    Fox(String name) {
        super(name);
    }

    @Override
    String getFavoriteMeal() {
        return "bird";
    }
}
