package com.mera.volosenkov.lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class LFunctionMainSorting {
    private static Random rand = new Random();
    public static void main(String[] args)
    {
        String[] names = {"Jack", "Dany", "Andy", "Jay", "Andrew", "John", "Betty", "Sara", "July", "Lesli"};
        List<Person> persons = new ArrayList<>();
        for(int personInd = 0; personInd< rand.nextInt(189)+10;personInd++)
        {
            persons.add(new Person(names[rand.nextInt(names.length)], rand.nextInt(99)+1));
        }
        persons.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
        System.out.println("Sorting by name:");
        printPersons(persons);
        System.out.println("Sorting by age:");
        persons.sort((o1, o2)->o1.getAge().compareTo(o2.getAge()));
        printPersons(persons);
    }
    private static void printPersons(Collection<Person> persons)
    {
        for( Person person:persons)
        {
            System.out.println(person.toString());
        }
    }
}
