package com.company.Point;
import java.util.Random;

public class FruitAmbiguity {
    public static void main(String[] args) {
        Random random= new Random();
        Fruit [] fruitSurprise= new Fruit[4];

        for (int i = 0; i < fruitSurprise.length; i++)
        {
            fruitSurprise[i] = getRandomFruit(random);
            System.out.print("Fruit surprise №:" + (i+1) + " " );
            System.out.println(fruitSurprise[i].toString());
        }

    }

        public static Fruit getRandomFruit(Random random) {

            Fruit[] sameFruit = new Fruit[]{new Apple(random), new Orange(random), new Pineapple(random)};
            return sameFruit[random.nextInt(sameFruit.length)];
        }

/*так и не поняла можно ли именно тип фрукта (сам класс наследник) случайно выбирать, а уже потом рэндомный конструктор вызывать. Реализовала другим способом.
public static Fruit getRandomFruit(Random random) {
        // Fruit [] arrayTypeOfFruit = new Fruit[] { Apple.class , Orange.class , Pineapple.class };
        String[] arrayTypeOfFruit = new String[]{"Apple", "Orange", "Pineapple"};
        int i = random.nextInt(arrayTypeOfFruit.length);
        if (arrayTypeOfFruit[i] == "Apple") {
            Fruit randomFruit = new Apple(random);
            return randomFruit;

        } else if (arrayTypeOfFruit[i] == "Orange") {
            Fruit randomFruit = new Orange(random);
            return randomFruit;

        } else if (arrayTypeOfFruit[i] == "Pineapple") {
            Fruit randomFruit = new Pineapple(random);
            return randomFruit;

        }
    }*/

}
