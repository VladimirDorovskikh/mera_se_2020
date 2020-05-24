package iljicheva.lesson6;

import iljicheva.lesson6.task1.MyArrayList;
import iljicheva.lesson6.task1.MyArrayStoreExceptoion;
import iljicheva.lesson6.task2.Bicycle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = new Bicycle[11];
        MyArrayList<Bicycle> myBikes = new MyArrayList();

        try {
            for (int i = 0; i < 11; i++){
                bicycles[i] = new Bicycle();
                myBikes.add(bicycles[i]);
            }
        } catch (MyArrayStoreExceptoion e){
            System.out.println(e.getMessage());
        }

        final int speedLimit = new Random().nextInt(50);
        for (int i = 0; i < myBikes.size(); i++){
            myBikes.remove(o -> o.getMaxSpeed() > speedLimit);
        }

        System.out.println("\nSpeed limit: " + speedLimit + "\n");
        for (int i = 0; i < myBikes.size(); i++){
            System.out.println(myBikes.get(i).toString());
        }

        ///////////////////////////////////////////////////////////////////

        MyArrayList<Integer> myIntegers = new MyArrayList();
        for (int i = 0; i < 10; i++){
            myIntegers.add(new Random().nextInt(10));
        }
        print(myIntegers);

        for (int i = 0; i < 10; i++){
            myIntegers.remove(o -> o%2 == 0);
        }
        print(myIntegers);
    }

    private static void print(MyArrayList arrayList){
        String result = "";
        for (int i = 0; i < arrayList.size(); i++){
            result += arrayList.get(i).toString() + " ";
        }
        System.out.println(result);
    }
}
