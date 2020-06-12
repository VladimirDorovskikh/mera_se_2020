package iljicheva.lesson8.task1;

public class Animal {
    @JsonName("nameAnimal")
    public String nameAnimal;
    @JsonName("age")
    public double age;
    @JsonIgnore
    String favouriteMeal;

    public Animal() {
        this.nameAnimal = null;
        this.age = .0;
        this.favouriteMeal = null;
    }

    public Animal(String name, double age, String favouriteMeal) {
        this.nameAnimal = name;
        this.age = age;
        this.favouriteMeal = favouriteMeal;
    }

    public Animal(String name, double age) {
        this.nameAnimal = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + nameAnimal + '\'' +
                ", age=" + age +
                ", favouriteMeal='" + favouriteMeal + '\'' +
                '}';
    }
}
