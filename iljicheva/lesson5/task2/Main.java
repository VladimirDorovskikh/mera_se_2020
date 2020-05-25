package iljicheva.lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        for (int i = 0; i < 10; i++){
            people[i] = new Person();
            System.out.println(people[i].toString());
        }
    }
}
