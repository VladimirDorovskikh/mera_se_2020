/**
 * 2. Фруктовая абстрактность
 * Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
 * Создайте следующие подклассы:
 *
 * ThinOrangeFactory - которая создает  только апельсины с толщиной кожуры от 1 до 5
 * RedApplesFactory - которая создает только красные яблоки
 * GreenApplesFactory - которая создает только зеленые яблоки.
 * LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
 *
 * Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
 * Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */

package Rafis.u4;

import java.util.Random;

import static Rafis.u4.Problem1.Fruit.MAX_FRUIT_WEIGHT;
import static Rafis.u4.Problem1.Pineapple.MAX_LEAFS_H;

public class Problem2 {
    static public Random rnd = new Random();

    static abstract class AbstractFabric {
        public abstract Problem1.Fruit makeFruit();
    }

    static class ThinOrangeFactory extends AbstractFabric {
        final static int MIN_RIND = 1;
        final static int MAX_RIND = 5;

        @Override
        public Problem1.Fruit makeFruit() {
            return new Problem1.Orange(rnd.nextInt(MAX_FRUIT_WEIGHT),
                    rnd.nextInt(MAX_RIND - MIN_RIND + 1) + MIN_RIND);
        }
    }

    static class RedApplesFactory extends AbstractFabric {
        @Override
        public Problem1.Fruit makeFruit() {
            return new Problem1.Apple(rnd.nextInt(MAX_FRUIT_WEIGHT), Problem1.Apple.Color.RED);
        }
    }

    static class GreenApplesFactory extends AbstractFabric {
        @Override
        public Problem1.Fruit makeFruit() {
            return new Problem1.Apple(rnd.nextInt(MAX_FRUIT_WEIGHT), Problem1.Apple.Color.GREEN);
        }
    }

    static class LongPinepplesFactory extends AbstractFabric {
        final static int MIN_LEAFS_H = 10;

        @Override
        public Problem1.Fruit makeFruit() {
            return new Problem1.Pineapple(Problem2.rnd.nextInt(MAX_FRUIT_WEIGHT),
                    rnd.nextInt( MAX_LEAFS_H - MIN_LEAFS_H + 1) + MIN_LEAFS_H);
        }
    }

    static final Class<?>[] FABRIC_TYPES = {ThinOrangeFactory.class, RedApplesFactory.class,
            GreenApplesFactory.class, LongPinepplesFactory.class};

    static AbstractFabric ReturnFabric(int k) {
        AbstractFabric fabric = null;

        if (ThinOrangeFactory.class.equals(FABRIC_TYPES[k])) {
            fabric = new ThinOrangeFactory();
        }
        else if (RedApplesFactory.class.equals(FABRIC_TYPES[k])) {
            fabric = new RedApplesFactory();
        }
        else if (GreenApplesFactory.class.equals(FABRIC_TYPES[k])) {
            fabric = new GreenApplesFactory();
        }
        else if (LongPinepplesFactory.class.equals(FABRIC_TYPES[k])) {
            fabric = new LongPinepplesFactory();
        }

        return fabric;
    }

    public static void main(String[] args) {
        // Part 1:
        System.out.println(">> Creating 10 fabrics of one random fabric type and printing fruits using each of them:\n");

        final int FABRIC_NUM = 10;
        AbstractFabric[] fabrics = new AbstractFabric[FABRIC_NUM];

        for (int i = 0; i < FABRIC_NUM; i++) {
            fabrics[i] = ReturnFabric(rnd.nextInt(FABRIC_TYPES.length));
            System.out.println(fabrics[i].makeFruit());
        }

        // Part 2:
        System.out.println("\n>> Printing 20 fruits, 2 of each fabric type:\n");

        final int FRUIT_NUM = 20;
        final int FRUIT_NUM_PER_FABRIC = 2;
        Problem1.Fruit[] fruits = new Problem1.Fruit[FRUIT_NUM];

        for (int i = 0; i < FRUIT_NUM; i++) {
            System.out.println(fabrics[i/FRUIT_NUM_PER_FABRIC].makeFruit());
        }
    }
}