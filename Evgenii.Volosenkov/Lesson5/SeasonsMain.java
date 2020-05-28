import Seasons.Person;
import Seasons.Season;

import java.util.Random;

public class SeasonsMain {
    static Random rand = new Random();
    public static void main(String[] args)
    {
        String[] names = {"Сергей", "Андрей", "Антон", "Алексей", "Владимир",
                "Анна", "Елена", "Валентина", "Евгения", "Татьяна"};
        Person[] persons = new Person[10];
        for( int personInd = 0; personInd < 10; personInd++)
        {
            persons[personInd] = new Person(names[rand.nextInt(names.length)], randomSeason());
        }
        for( Person person: persons)
        {
            System.out.println(person.whatAmILike());
        }

    }
    private static Season randomSeason()
    {
        int seasonInd = rand.nextInt(4);
        switch(seasonInd)
        {
            case 0:
                return Season.WINTER;
            case 1:
                return Season.SPRING;
            case 2:
                return Season.SUMMER;
            case 3:
                return Season.AUTUMN;
        }
        return null;
    }
}
