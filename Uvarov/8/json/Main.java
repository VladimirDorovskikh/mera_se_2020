package mera.json;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Person person = new Person();
        Chupakabra chupakabra = new Chupakabra();

        System.out.println(Serializator.serialize(person));
        System.out.println(Deserializator.deserialize(Serializator.serialize(person), Person.class) + "\n");

        System.out.println(Serializator.serialize(chupakabra));
        System.out.println(Deserializator.deserialize(Serializator.serialize(chupakabra), Chupakabra.class));

    }
}
