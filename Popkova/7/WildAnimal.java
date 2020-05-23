public class WildAnimal extends Animal {

    public WildAnimal(String name) {
        this.name = name;
    }

    @Override
    public String getFavouriteMeal() {
        return "Wild food";
    }
}