import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, ClassNotFoundException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasya", "Petrov", 42, "ABCDE"));
        persons.add(new Person("Petya", "Vasechkin", 18, "ABCDE"));
        String serialPerson = JsonSerialise.serialise(persons);
        System.out.println(JsonDeserialise.deserialise(serialPerson, Person.class));
    }
}
