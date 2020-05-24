public class Fox extends WildAnimal {

    public Fox(String name) {
        super(name);
    }

    @Override
    public String getFavouriteMeal() {
        return Meal.FOX_MEAL.getValue();
    }
}
