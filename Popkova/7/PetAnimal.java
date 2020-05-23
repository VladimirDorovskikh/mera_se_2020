public class PetAnimal extends Animal {

    public PetAnimal(String name) {
       this.name = name;
}

    @Override
    public String getFavouriteMeal() {
        return "Pet food";
    }
}