package VostrikovaE.Lesson3;

import VostrikovaE.Lesson3.Exercise1.Person;
import VostrikovaE.Lesson3.Exercise2.SequentialRandom;

import java.util.Random;

public class MainLesson3 {

    public static void main(String[] args) {
	 String[] names = {"John", "Mary", "David", "Ann", "Patrick"};
	 String[] surnames = {"Smith", "Green", "Potter", "Black", "Grey", "Johnson"};
	 Person[] Persons = new Person[50];
      Random rndName = new Random();
      Random rndSurname = new Random();
        for(int i = 0; i < Persons.length; i++) {
	     Persons[i] = new Person(names[rndName.nextInt(5)], surnames[rndSurname.nextInt(6)]);
     }
        for(int i = 0; i < Persons.length; i++) {
            System.out.println("Person # " + (i+1) + " " + Persons[i].toString());
        }
        SequentialRandom[] Array = new SequentialRandom[7];
        for (int i=0; i< Array.length; i++) {
             Array[i] = new SequentialRandom();
             if (i==5) {
                 SequentialRandom.resetRandom();
             }
             System.out.println(Array[i].getRandom());
        }



    }

}

