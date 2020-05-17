import java.util.Random;

public class DigitalPersonalisation{
    public static void main(String[] args)
    {
        String[] names = {"Татьяна", "Софья", "Дарья", "Мария", "Елена"};
        String[] surnames ={"Афронова", "Маринова", "Полищук", "Руськина", "Миронова", "Разина"};
        Person[] persons = new Person[50];
        Random rand = new Random();
        for(int personInd=0; personInd< persons.length; personInd++)
        {
            persons[personInd] = new Person(names[Math.abs(rand.nextInt()) % names.length],
                                            surnames[Math.abs(rand.nextInt()) % surnames.length]);
        }
        for(Person person : persons)
        {
            System.out.println(person.toString());
        }
    }
}
