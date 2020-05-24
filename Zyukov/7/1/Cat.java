package lecture7.task1;

public class Cat extends PetAnimal {
    public Cat(String name) {
        super(name, Meal.MEAL1);
    }

    @Override
    public String toString() {
        return String.format("Cat: %s", super.toString());
    }
}
