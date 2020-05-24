package lecture7.task1;

public class Wolf extends WildAnimal {
    public Wolf(String name) {
        super(name, Meal.MEAL3);
    }

    @Override
    public String toString() {
        return String.format("Wolf: %s", super.toString());
    }
}
