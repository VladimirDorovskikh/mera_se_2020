package com.mera.lection5.ex2;

import com.mera.lection5.ex2.SeasonStuff.Season;
import java.util.Random;

class Person {
    private final String name;
    private Season favoriteSeason;

    Person(){
        Random dice = new Random();

        name=Name.values()[dice.nextInt(Name.values().length)].toString();
        favoriteSeason=Season.values()[dice.nextInt(Season.values().length)];
    }

    @Override
    public String toString(){
        return "It is "+name+". "+favoriteSeason;
    }


    enum Name{
        IVAN("Иван"),
        NIKITA("Никита"),
        ARSENY("Арсений"),
        VLADIMIR("Владимир"),
        IBRAGIM("Ибрагим"),
        NATALIA("Наталья"),
        ALICE("Алиса"),
        SVETLANA("Светлана"),
        ALEXANDRA("Алексанндра"),
        IRINA("Ирина");

        private final String name;

        Name(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return name;
        }

    }
}
