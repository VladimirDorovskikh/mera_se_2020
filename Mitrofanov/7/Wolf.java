import java.util.Objects;

public class Wolf extends WildAnimal {
    Meal meal;

    public Wolf(String name, Meal meal) {
        super(name);
        this.meal = meal;
    }

    @Override
    public Meal getFavouriteMeal() {
        return meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        Wolf wolf = (Wolf) o;
        return wolf.getName().equals(getName()) && wolf.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName() + " is a wolf which prefers " + meal + "\n";
    }
}
