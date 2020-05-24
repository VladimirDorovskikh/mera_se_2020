public class Cat extends PetAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getFavouriteMeal() {
        return Meal.CAT_MEAL.getValue();
    }
}
