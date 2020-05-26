public class Woolf extends WildAnimal{

    public Woolf(String name){
        super(name);
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.FRESH_MEAT;
    }

    @Override
    public String toString() {
        return "Woolf " + name +" (meal " + getFavoriteMeal() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Woolf)){
            return false;
        }
        Woolf a_woolf = (Woolf) obj;
        return a_woolf.name.equals(name) && a_woolf.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
