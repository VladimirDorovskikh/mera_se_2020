public abstract class Animal {
    public String name;
    public Meal meal;

    abstract Meal getFavoriteMeal();
}

class WildAnimal extends Animal {
    public WildAnimal(String name){
        this.name = name;
    }

    @Override
    public Meal getFavoriteMeal() {
        return meal;
    }
}
class PetAnimal extends Animal {

    public PetAnimal(String name){
        this.name = name;
    }

    @Override
    public Meal getFavoriteMeal() {
        return meal;
    }
}

enum Meal {
    MEAT,
    BONE,
    FRESH_MEAT,
    MOUSE;
}





