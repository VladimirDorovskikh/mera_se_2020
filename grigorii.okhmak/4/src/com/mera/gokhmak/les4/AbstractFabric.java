package com.mera.gokhmak.les4;

public abstract class AbstractFabric {
    static final AbstractFabric[] FABRICS = {new RedApplesFactory(),
                                             new ThinOrangeFactory(),
                                             new GreenApplesFactory(),
                                             new LongPineApplesFactory()
                                            };

    abstract Fruit makeFruit();
    public static AbstractFabric getRandomFabric() {
        return FABRICS[Randomizer.getRandomInRange(0, FABRICS.length - 1)];
    }
}

/**
 * Апельсины с тольщиной кожуры от 1 до 5.
 */
class ThinOrangeFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        int[] randomValues = Randomizer.getRandomSequence(2, 1, 50, 1, 5);
        return new Orange(randomValues[0], randomValues[1]);
    }
}

/**
 * Только красные яблоки.
 */
class RedApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Apple(Randomizer.getRandomInRange(1,50), Fruit.COLORS[2]);
    }
}

/**
 * Только зеленые яблоки.
 */
class GreenApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Apple(Randomizer.getRandomInRange(1,50), Fruit.COLORS[1]);
    }
}

/**
 * Ананасы с длиной хвоста больше 10 см.
 */
class LongPineApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        int[] randomValues = Randomizer.getRandomSequence(2, 1, 50, 11, 25);
        return new Pineapple(randomValues[0], randomValues[1]);
    }
}