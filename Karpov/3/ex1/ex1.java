import java.util.Random;

class Ex1 {

    public static void main(String[] args) {
        Random index = new Random();
        String[] firstNames = { "John", "Johan", "Peter", "Michael", "Martin" };
        String[] lastNames = { "Jackson","Franklin","Rusvelt","Brown","McFly","Johansson" };
        Person[] persons = new Person[60];
        for (int i=0; i<persons.length; i++){
            persons[i] = new Person(firstNames[index.nextInt(firstNames.length)],lastNames[index.nextInt(lastNames.length)]);
        }
        for (int i=0; i < persons.length; i++){
            System.out.printf("%d\t%s\n", i+1, persons[i].toString());
        }


    }
}

class Person {
    String firstName, lastName;

    public Person(){
        firstName="";
        lastName="";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return getFirstName()+" "+getLastName();
    }
}