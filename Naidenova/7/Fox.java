public class Fox extends WildAnimal{

    public Fox(String name){
        super(name);
    }
    @Override
    public Meal getFavoriteMeal() {
        return Meal.MOUSE;
    }

    @Override
    public String toString() {
        return "Fox " + name +" (meal " + getFavoriteMeal() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Fox)){
            return false;
        }
        Fox a_fox = (Fox) obj;
        return a_fox.name.equals(name) && a_fox.getClass().equals(getClass());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
