package com.mera.lection5.ex2;
import com.mera.lection5.ex2.SeasonStuff.Season;

class Ex2 {
    public static void main(String[] args){
        Person[] personList = new Person[10];
        for (int i=0; i<personList.length; i++){
            personList[i]= new Person();
            System.out.println(personList[i]);
        }
    }
}
