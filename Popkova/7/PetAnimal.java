public class PetAnimal extends Animal {

    public PetAnimal(String name) {
       this.name = name;
}

    @Override
    public String getFavouriteMeal() {
        return Meal.PET_ANIMAL_MEAL.getValue();
    }
}
