public class Wolf extends WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String getFavouriteMeal() {
        return Meal.WOLF_MEAL.getValue();
    }
}
