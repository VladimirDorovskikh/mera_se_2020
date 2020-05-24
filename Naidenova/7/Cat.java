public class Cat extends PetAnimal{

    public Cat(String name){
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.MEAT;
    }

    @Override
    public String toString() {
        return "Cat " + name +" (meal " + getFavoriteMeal() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat a_cat = (Cat) obj;
        return a_cat.name.equals(name) && a_cat.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
