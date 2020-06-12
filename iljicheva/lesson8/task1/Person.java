package iljicheva.lesson8.task1;

public class Person {
    @JsonName("name")
    public String name;
    @JsonName("surname")
    public String surname;
    @JsonIgnore
    double age;

    public Person() {
        this.name = null;
        this.surname = null;
        this.age = .0;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, double age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
