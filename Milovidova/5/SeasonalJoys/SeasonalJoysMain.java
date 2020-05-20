package com.company.SeasonalJoys;

import java.util.Random;

public class SeasonalJoysMain {
    public static void main (String[] arrgs){

        String [] arrayFirstName = new String [] { "Platon" , "Filipp" , "Avvakum" , "Villi" , "Albert", "Zahar", "Terentiy", "Gennadiy", "Arhip", "Pafnutiy" };
        Random random = new Random();
       // Person [] person;//не скомпилировалось без инициализации
        Person [] person = new Person[10]; //не скомпилировалось без инициализации

        for (int i = 0; i < 10; i++)
        {
            person[i] = new Person (arrayFirstName[random.nextInt(arrayFirstName.length)], Season.getRandomSeason());
            System.out.printf("The person № %s:\t %s.\n",(i+1),person[i].firstName);
            System.out.printf("His favorit game: %s\n", person[i].favoriteSeason.seasonalGame.gameDescription);
        }

    }
}
