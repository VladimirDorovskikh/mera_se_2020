public class Dog extends PetAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getFavouriteMeal() {
        return Meal.DOG_MEAL.getValue();
    }
}
