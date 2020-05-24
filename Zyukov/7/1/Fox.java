package lecture7.task1;

public class Fox extends WildAnimal {
    public Fox(String name) {
        super(name, Meal.MEAL4);
    }

    @Override
    public String toString() {
        return String.format("Fox: %s", super.toString());
    }
}
