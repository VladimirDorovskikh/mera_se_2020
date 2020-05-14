package mera;

import java.util.Random;

public class FruitCreator {

    public static Fruit [] getRandomFruitArray(int arrayLength){
        Random rnd = new Random();
        Fruit [] fruits = new Fruit[arrayLength];

        for (int i=0; i<fruits.length;i++){
            int fruitNumber = rnd.nextInt(arrayLength-1);

            switch (fruitNumber){
                case 0:
                    fruits[i] = Apple.getRandomFruit();
                    break;
                case 1:
                    fruits[i] = Orange.getRandomFruit();
                    break;
                case 2:
                    fruits[i] = Pineapple.getRandomFruit();
                    break;
                default:
                    System.out.println("WrongFruitNumberException. " + "Number: " + fruitNumber);
            }
        }
        return fruits;
    }

    public static void main(String[] args) {

        Fruit [] fruits = getRandomFruitArray(4);

        for(Fruit fruit : fruits){
            System.out.println(fruit.toString());
        }
    }
}
