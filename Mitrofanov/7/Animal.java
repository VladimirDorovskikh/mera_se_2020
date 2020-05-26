import java.util.Random;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Meal getFavouriteMeal();
}

enum Meal {
    MILK,
    BONES,
    ROTTEN_MEAT,
    MICE;

    private static final Meal[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random r = new Random();

    public static Meal getRandomMeal() {
        return VALUES[r.nextInt(SIZE)];
    }
}

abstract class WildAnimal extends Animal {
    public WildAnimal(String name) {
        super(name);
    }
}

abstract class PetAnimal extends Animal {
    public PetAnimal(String name) {
        super(name);
    }
}