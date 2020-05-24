package lecture7.task1;

public abstract class Animal {
    public enum Meal { MEAL1, MEAL2, MEAL3, MEAL4};

    private String name;
    private Meal favoriteMeal;

    protected Animal(String name, Meal favoriteMeal) {
        this.name = name;
        this.favoriteMeal = favoriteMeal;
    }

    public String getName() {
        return name;
    }

    public Meal getFavoriteMeal() {
        return favoriteMeal;
    }

    public String toString() {
        return String.format("Name: %s, Meal: %s", getName(), getFavoriteMeal().toString());
    }
}
