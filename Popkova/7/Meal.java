public enum Meal {
    WILD_ANIMAL_MEAL("Food for wild animals"),
    PET_ANIMAL_MEAL("Food for per animals"),
    WOLF_MEAL("Meat"),
    FOX_MEAL("Cheese"),
    DOG_MEAL("Cookies"),
    CAT_MEAL("Fish");

    private String mealName;

    Meal(String mealName) {
        this.mealName = mealName;
    }

    public String getValue() {
        return mealName;
    }
}