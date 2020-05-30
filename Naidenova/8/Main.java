import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class Main {
    @EnclosingTag(JsonName = "Persons")
    static class Person {

        @JsonName(fieldJsonName = "first name")
        public String name;

        @JsonName(fieldJsonName = "nick name")
        public String nick;

        @JsonIgnore
        public String level;

        public Person() {
        }

        public Person(String name, String nick, String level) {
            this.name = name;
            this.nick = nick;
            this.level = level;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNick() {
            return nick;
        }
        public void setNick(String nick) {
            this.nick = nick;
        }
        public String getLevel() {
            return level;
        }
        public void setLevel(String level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return "Person{Name: " + name + " Nick Name: " + nick + "}";
        }
    }
        @EnclosingTag(JsonName = "Fruits")
        static class Fruit {

            @JsonName(fieldJsonName = "fruit")
            public String name;

            @JsonName(fieldJsonName = "color")
            public String color;

            @JsonIgnore
            public float weight;

            public Fruit() {
            }

            public Fruit(String name, String color, float weight) {
                this.name = name;
                this.color = color;
                this.weight = weight;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getColor() {
                return color;
            }
            public void setColor(String color) {
                this.color = color;
            }
            public float getWeight() {
                return weight;
            }
            public void setWeight(float weight) {
                this.weight = weight;
            }

            @Override
            public String toString() {
                return "Fruit{Name: " + name + " color: " + color + "}";
            }
        }

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Hawk", "1"));

        SerializeToJson objectToJson = new SerializeToJson();
        System.out.println(SerializeToJson.serializeObject(persons));

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "red", 100));

        System.out.println(SerializeToJson.serializeObject(fruits));

        DeserializeFromJson jsonToObject = new DeserializeFromJson();

        System.out.println(DeserializeFromJson.deserializeObject(SerializeToJson.serializeObject(persons), Person.class));

        System.out.println(DeserializeFromJson.deserializeObject(SerializeToJson.serializeObject(fruits), Fruit.class));

    }

}



