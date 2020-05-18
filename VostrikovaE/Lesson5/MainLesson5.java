package VostrikovaE.Lesson5;

import VostrikovaE.Lesson5.Excercise1.Circle;
import VostrikovaE.Lesson5.Excercise1.Figure;
import VostrikovaE.Lesson5.Excercise1.Rectangle;
import VostrikovaE.Lesson5.Excercise2.Person;
import VostrikovaE.Lesson5.Excercise2.Season;

import java.util.Random;

public class MainLesson5 {

    static Season getRandomSeason() {
        Random rnd = new Random();
        Season returnedSeason = null;
        switch (rnd.nextInt(4) + 1) {
            case 1:
                returnedSeason = Season.SPRING;
                break;
            case 2:
                returnedSeason = Season.SUMMER;
                break;
            case 3:
                returnedSeason = Season.AUTUMN;
                break;
            case 4:
                returnedSeason = Season.WINTER;
                break;
        }
        return returnedSeason;
    }


    public static void main(String[] args) {
        System.out.println("exercise 1");
        Figure[] figures = new Figure[5];
        Random rnd = new Random();
        int maxRadius=10;
        int maxLength=20;
        int maxWidth=20;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                figures[i] = new Circle(rnd.nextInt(maxRadius-1)+1, rnd.nextDouble(), rnd.nextDouble());
            } else {
                figures[i] = new Rectangle(rnd.nextInt(maxLength-1)+1, rnd.nextInt(maxWidth-1)+1, rnd.nextDouble(), rnd.nextDouble());
            }
            System.out.println("figure is " + figures[i].getFigureName() + " and it's square is " + figures[i].square());
            System.out.println("figure is in quadrant " + figures[i].getQuadrant());
        }

        System.out.println("exercise 2");
        String[] names = {"Petr", "Ivan", "Svetlana", "Maria", "Denis", "Alena", "Oksana", "Andrey"};
        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(names[rnd.nextInt(names.length)], getRandomSeason());
            System.out.println("Person number " + i + " " + persons[i].getName() + " favorite game is " + " " + persons[i].getFavoriteSeason().getGame());
        }

    }
}






