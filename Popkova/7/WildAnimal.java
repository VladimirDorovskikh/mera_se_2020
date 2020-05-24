public class WildAnimal extends Animal {

    public WildAnimal(String name) {
        this.name = name;
    }

    @Override
    public String getFavouriteMeal() {
        return Meal.WILD_ANIMAL_MEAL.getValue();
    }
}
