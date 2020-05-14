package VostrikovaE.Lesson4;

import VostrikovaE.Lesson4.Exercise1.Apple;
import VostrikovaE.Lesson4.Exercise1.Fruit;
import VostrikovaE.Lesson4.Exercise1.Orange;
import VostrikovaE.Lesson4.Exercise1.Pineapple;
import VostrikovaE.Lesson4.Exercise2.*;

import java.util.Random;

public class MainLesson4 {

    public static Fruit getRandomFruit() {
        Random rnd = new Random();
        Fruit returnedFruit=null;
        switch (rnd.nextInt(3)) {
            case 0 -> returnedFruit= Apple.getRandomInstance();
            case 1 ->  returnedFruit= Orange.getRandomInstance();
            case 2 ->  returnedFruit= Pineapple.getRandomInstance();
        }
        return returnedFruit;
    }
    public static AbstractFabric getRandomFabric(){
        Random rnd = new Random();
        AbstractFabric returnedFabric=null;
        switch (rnd.nextInt(4)){
            case 0->returnedFabric=new GreenApplesFactory();
            case 1->returnedFabric=new RedApplesFactory();
            case 2-> returnedFabric=new ThinOrangeFactory(1,5);
            case 3->returnedFabric=new LongPinepplesFactory(11, 20);
        }
        return returnedFabric;
    }


    public static void main(String[] args) {
        System.out.println("exercise 1");
        Fruit[] fruits=new Fruit[4];
        for(int i=0; i<fruits.length; i++){
            fruits[i]=getRandomFruit();
            System.out.println(fruits[i]);
        }
        System.out.println("exercise 2");
        AbstractFabric[] fabrics=new AbstractFabric[10];
        final int fruitsFromFactory=2; // количество фруктов с одной фабрики
        int fruitsIterator=0; // итератор для заполнения массива фруктов
        Fruit[] fabricatedFruits= new Fruit[fabrics.length*fruitsFromFactory];
        for (int i=0; i<fabrics.length;i++){
            fabrics[i]=getRandomFabric();
            for (int j=0; j<fruitsFromFactory; j++){ // создаем по 2 фрукта с одной фабрики
                fabricatedFruits[fruitsIterator]=fabrics[i].makeFruit();
                System.out.println(fabrics[i].getClass().getSimpleName()+" Create fruit: "+ fabricatedFruits[fruitsIterator]);
                fruitsIterator++;
            }
        }
    }

}
