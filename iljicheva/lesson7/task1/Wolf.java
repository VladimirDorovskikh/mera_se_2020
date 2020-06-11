package iljicheva.lesson7.task1;

class Wolf extends WildAnimal {
    Wolf(String name) {
        super(name);
    }

    @Override
    String getFavoriteMeal() {
        return "cow";
    }
}
