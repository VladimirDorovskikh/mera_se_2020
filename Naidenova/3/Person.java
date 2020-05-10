import java.util.Random;
import java.util.Arrays;

public class Person {
    String firstName;                   //firstName class field
    String lastName;                    //lastName class field

    public Person(String firstName, String lastName) {      //Constructor with firstName and lastName args
        this.firstName = firstName;      //firstName field initiated with firstName value
        this.lastName = lastName;        //lastName field initiated with lastName value
    }

    String getFirstName() {             //get method to return firstName field
        return firstName;
    }

    String getLastName() {             //get method to return lastName field
        return lastName;
    }

    public String toString() {          //toString method to output "lastName firstName" view for user
        return lastName + " " + firstName+ "\n";
    }


    public static void main(String[] args) {
        String[] fisrtNamesList = {"Ivan", "Petr", "Sidor", "Fedor", "Anton"};          //create and declare array with firstNamelist
        String[] lastNamesList = {"Ivanov", "Petrov", "Sidorov", "Federov", "Antonov", "Vasiliev"};          //create and declare array with lastNamelist
        Person[] personList = new Person[50];           //create and declare array with personlist, firstNames and lastNames are random from these lists above
            for (int n=0; n<50; n++){
            personList[n] = new Person(fisrtNamesList[new Random().nextInt(5)], lastNamesList[new Random().nextInt(6)]);
            int personNumber = n+1;
            System.out.println("Person N" + personNumber + " - "+ personList[n]);           //print personList for user with N from 1 to 50
            }

    }
}
