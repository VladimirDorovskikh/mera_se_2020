import java.util.Random;


public class Task1{
      
    public static void main(String[] args) {
        
        int maxName = 5;
        int maxLastName = 6;
         
        String[] firstNames  = new String[] {"Роман", "Тимофей", "Владимир", "Афанасий", "Алексей"};
         
        String[] lastNames  = new String[] {"Березов", "Прыткий", "Мальцев", "Кружкин", "Лопатин", "Ленин"};
        int n=50;
        int name=0, lastName=0;
        
        Random rnd = new Random(System.currentTimeMillis());
        
        Person[] persons  = new Person[n]; 
        
        for(int i=0;i<n;i++) {
        name = rnd.nextInt(maxName);
        lastName = rnd.nextInt(maxLastName);
        persons[i] = new Person(firstNames[name], lastNames[lastName]);
        System.out.printf("Человек №%d - %s, %s\n", i, persons[i].lastName, persons[i].firstName);
        }
    }
}
class Person{
     
    String firstName;    // имя
    String lastName;    // фамилия

    Person()
    {
        firstName = "Undefined";
        lastName = "Undefined";
    }
    Person(String n)
    {
        firstName = n;
        lastName = "Undefined";
    }
        Person(String n, String ln)
    {
        firstName = n;
        lastName = ln;
    }

    
       public String getFirstName() {
       return firstName;
   }
   
          public String getlastName () {
       return lastName;
   }
   
   public String toString() {
        return (lastName + ", " + firstName);
        
   }
   
}
