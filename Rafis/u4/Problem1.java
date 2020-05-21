/**
 * 1. Фруктовая неоднозначность
 * Создать класс Fruit со свойством "вес" типа int и методом toString
 * Создать наследники:
 * Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
 * Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
 * Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20
 *
 * переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)
 *
 * создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
 * Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
 */

package Rafis.u4;

import java.util.Random;

public class Problem1 {
    static private Random rnd = new Random();

    final static public Class<?>[] OBJ_TYPES = {Fruit.class, Apple.class, Orange.class, Pineapple.class};

    public static Fruit getRandomFruit() {
        Fruit fruit = null;
        final int fruitType = rnd.nextInt(OBJ_TYPES.length);

        if (Fruit.class.equals(OBJ_TYPES[fruitType])) {
            fruit = new Fruit(rnd.nextInt(Fruit.MAX_FRUIT_WEIGHT));
        }
        else if (Apple.class.equals(OBJ_TYPES[fruitType])) {
            fruit = new Apple(rnd.nextInt(Fruit.MAX_FRUIT_WEIGHT),
                    Apple.Color.values()[(rnd.nextInt(Apple.Color.values().length))]);
        }
        else if (Orange.class.equals(OBJ_TYPES[fruitType])) {
            fruit = new Orange(rnd.nextInt(Fruit.MAX_FRUIT_WEIGHT),
                    // [MIX_RIND; MAX_RIND] range, [0; 20] for instance
                    rnd.nextInt(Orange.MAX_RIND + 1));
        }
        else if (Pineapple.class.equals(OBJ_TYPES[fruitType])) {
            fruit = new Pineapple(rnd.nextInt(Fruit.MAX_FRUIT_WEIGHT),
                    // [MIN_LEAFS_H; MAX_LEAFS_H] range, [5; 20] for instance
                    rnd.nextInt(Pineapple.MAX_LEAFS_H - Pineapple.MIN_LEAFS_H + 1) + Pineapple.MIN_LEAFS_H);
        }

        return fruit;
    }

    static class Fruit {
        final static int MAX_FRUIT_WEIGHT = 10; // fruit with higher mass might seem really odd
        protected int weight;

        public Fruit(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Fruit {weight=" + weight + '}';
        }
    }

    static class Apple extends Fruit {
        public enum Color {RED("Red"), GREEN("Green"), YELLOW("Yellow");
            private String color;
            Color(final String color) {
                this.color = color;
            }

            @Override
            public String toString() {
                return color;
            }
        }

        private String colorStr;

        public Apple(int weight, Color color) {
            super(weight);
            this.colorStr = color.toString();
        }

        @Override
        public String toString() {
            return "Apple {" + "weight=" + weight +", color=" + colorStr + '}';
        }
    }

    static class Orange extends Fruit {
        final static int MIN_RIND = 0;
        final static int MAX_RIND = 20;
        private Integer rindThickness;

        public Orange(int weight, int rindThickness) {
            super(weight);
            // considering constraints
            if ((rindThickness >= MIN_RIND) && (rindThickness <= MAX_RIND)) {
                this.rindThickness = rindThickness;
            }
        }

        @Override
        public String toString() {
            return "Orange {" + "weight=" + weight + ", rindThickness=" + rindThickness + '}';
        }
    }

    static class Pineapple extends Fruit {
        final static int MIN_LEAFS_H = 5;
        final static int MAX_LEAFS_H = 20;
        private Integer leafsHeight;

        public Pineapple(int weight, int leafsHeight) {
            super(weight);
            // considering constraints
            if ((leafsHeight >= MIN_LEAFS_H) && (leafsHeight <= MAX_LEAFS_H)) {
                this.leafsHeight = leafsHeight;
            }
        }

        @Override
        public String toString() {
            return "Pineapple {" + "weight=" + weight + ", leafsHeight=" + leafsHeight + '}';
        }
    }

    public static void main(String[] args) {
        final int FRUIT_NUM = 4;
        Fruit[] fruits = new Fruit[FRUIT_NUM];

        System.out.println("\n>> Filling array with " + FRUIT_NUM + " random fruits and printing them:\n");
        for (int i = 0; i < FRUIT_NUM; i++) {
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i].toString());
        }
    }
}
