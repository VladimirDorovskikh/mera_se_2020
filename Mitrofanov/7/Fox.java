import java.util.Objects;

public class Fox extends WildAnimal {
    Meal meal;

    public Fox(String name, Meal meal) {
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
        if (!(o instanceof Fox)) return false;
        Fox fox = (Fox) o;
        return fox.getName().equals(getName()) && fox.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName() + " is a fox which prefers " + meal + "\n";
    }
}
