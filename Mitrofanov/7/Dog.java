import java.util.Objects;

public class Dog extends PetAnimal {
    Meal meal;

    public Dog(String name, Meal meal) {
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
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return dog.getName().equals(getName()) && dog.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName() + " is a dog which prefers " + meal + "\n";
    }
}
