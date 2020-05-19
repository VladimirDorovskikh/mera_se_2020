package com.mera.gokhmak.les6;

import java.util.Date;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        MyArrayList<Bicycle> bicycles = new MyArrayList<>();
        Date date = new Date();
        Random rand = new Random(date.getTime());

        loop1:
        for (int i = 0; i < 11; i++) {
            loop:
            while (true) {
                Bicycle bicycle = null;
                try {
                    bicycle = new Bicycle(Bicycle.getRandomBrand(), rand.nextInt(51));
                    bicycles.add(bicycle);
                } catch (MyArrayStoreException e) {
                    System.out.println(e);
                    if (bicycle != null) {
                        System.out.println("Игнорирован: " + bicycle);
                    }
                    break loop1;
                } catch (Exception e) {
                    System.out.println("Debug: " + e);
                    continue loop;
                }
            }
        }
        // Output:
        System.out.println("Список велосипедов ДО (размер: " + bicycles.size() + "): ");
        for (int i = 0; i < bicycles.size(); i++) {
            System.out.printf("   %s\n",  bicycles.get(i).toString());
        }

        int randomNumber = rand.nextInt(51);
        System.out.println("Велоспиеды со скоростью меньше " + randomNumber + " будут удалены из коллекции.");
        bicycles.remove(o -> o.getMaxSpeed() < randomNumber);

        System.out.println("Список велосипедов ПОСЛЕ (размер: " + bicycles.size() + "): ");
        for (int i = 0; i < bicycles.size(); i++) {
            System.out.printf("   %s\n", bicycles.get(i));
        }
    }
}
