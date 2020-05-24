public class Dog extends PetAnimal{

    public Dog(String name){
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.BONE;
    }

    @Override
    public String toString() {
        return "Dog " + name + " (meal " + getFavoriteMeal() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Dog)){
            return false;
        }
        Dog a_dog = (Dog) obj;
        return a_dog.name.equals(name) && a_dog.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
