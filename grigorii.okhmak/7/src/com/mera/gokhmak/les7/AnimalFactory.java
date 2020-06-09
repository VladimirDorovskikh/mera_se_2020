package com.mera.gokhmak.les7;

import java.util.Date;
import java.util.Random;

public class AnimalFactory {
    private static final Random rand;
    private static final String NAMES[] = {"Пушок","Дружок","Шарик","Пушистик","Роджер","Ворчун","Кэнди","Пирожок",
                                   "Трэвис","Рыжик","Белый Клык","Балто","Филя"};
    static final Generator<PetAnimal> HOME_PET_GENERATOR = new Generator<PetAnimal>() {
        Generator g[] = {
                new Generator<PetAnimal>() {
                    @Override
                    public PetAnimal getNext() {
                        return (PetAnimal) new Cat(NAMES[rand.nextInt(NAMES.length)]);
                    }
                },
                new Generator<PetAnimal>() {
                    @Override
                    public PetAnimal getNext() {
                        return (PetAnimal) new Dog(NAMES[rand.nextInt(NAMES.length)]);
                    }
                }
        };

        @Override
        public PetAnimal getNext() {
            return (PetAnimal) g[rand.nextInt(g.length)].getNext();
        }
    };
    static final Generator<WildAnimal> WILD_PET_GENERATOR = new Generator<WildAnimal>() {
        Generator g[] = {
                new Generator<WildAnimal>() {
                    @Override
                    public WildAnimal getNext() {
                        return (WildAnimal) new Fox(NAMES[rand.nextInt(NAMES.length)]);
                    }
                },
                new Generator<WildAnimal>() {
                    @Override
                    public WildAnimal getNext() {
                        return (WildAnimal) new Wolf(NAMES[rand.nextInt(NAMES.length)]);
                    }
                }
        };

        @Override
        public WildAnimal getNext() {
            return (WildAnimal) g[rand.nextInt(g.length)].getNext();
        }
    };

    static {
        Date date = new Date();
        rand = new Random(date.getTime());
    }
}

class Cat extends PetAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "кошачий корм";
    }

    @Override
    public String toString() {
        return "Cat{ name=" + getName() +
                " }";
    }
}

class Dog extends PetAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "собачий корм";
    }

    @Override
    public String toString() {
        return "Dog{ name=" + getName() +
                " }";
    }
}

class Fox extends WildAnimal {
    public Fox(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "кролика";
    }

    @Override
    public String toString() {
        return "Fox{ name=" + getName() +
                " }";
    }
}

class Wolf extends WildAnimal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String getFavoriteMeal() {
        return "овцу";
    }

    @Override
    public String toString() {
        return "Wolf{ name=" + getName() +
                " }";
    }
}