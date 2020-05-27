import java.util.Objects;

public class Cat extends PetAnimal {
    Meal meal;


    public Cat(String name, Meal meal) {
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
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return cat.getName().equals(getName()) && cat.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName() + " is a cat which prefers " + meal + "\n";
    }
}
