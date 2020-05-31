package lecture7.task1;

public class Dog extends PetAnimal {
    public Dog(String name) {
        super(name, Meal.MEAL2);
    }

    @Override
    public String toString() {
        return String.format("Dog: %s", super.toString());
    }
}
