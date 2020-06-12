package iljicheva.lesson8.task1;

public class main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Person person = new Person("Timur", "Davidovich", 45.0);
        Animal animal = new Animal("Bobik", 3.0, "bone");

        System.out.println(JsonSerializer.jsonSerialize(animal) + "\n");
        System.out.println(JsonSerializer.jsonDeSerialize(JsonSerializer.jsonSerialize(animal),
                Animal.class) + "\n");

        System.out.println(JsonSerializer.jsonSerialize(person) + "\n");
        System.out.println(JsonSerializer.jsonDeSerialize(JsonSerializer.jsonSerialize(person),
                Person.class));
    }
}
