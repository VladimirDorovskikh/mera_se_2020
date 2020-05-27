import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class Main {
    @EnclosingTag(JsonName = "Persons")
    static class Person {

        @JsonName(fieldJsonName = "id")
        public long id;

        @JsonName(fieldJsonName = "first name")
        public String name;

        @JsonName(fieldJsonName = "nick name")
        public String nick;

        @JsonIgnore
        public String level;

        public Person() {
        }

        public Person(long id, String name, String nick, String level) {
            this.id = id;
            this.name = name;
            this.nick = nick;
            this.level = level;
        }

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
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
            return "Person{id: " + id + "; Name: " + name + ", Nick Name: " + nick + "}";
        }
    }
        @EnclosingTag(JsonName = "Fruits")
        static class Fruit {

            @JsonName(fieldJsonName = "fruit")
            public String name;

            @JsonName(fieldJsonName = "weight")
            public float weight;

            @JsonIgnore
            public String color;

            public Fruit() {
            }

            public Fruit(String name, float weight, String color) {
                this.name = name;
                this.weight = weight;
                this.color = color;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public float getWeight() {
                return weight;
            }
            public void setWeight(float weight) {
                this.weight = weight;
            }
            public String getColor() {
                return color;
            }
            public void setColor(String color) {
                this.color = color;
            }

            @Override
            public String toString() {
                return "Fruit{Name: " + name + ", weight: " + weight + "}";
            }
        }

    public static void main(String[] args) throws IllegalAccessException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ivan", "Hawk", "1"));
        persons.add(new Person(2, "Petr", "Dragon", "2"));
        persons.add(new Person(3, "Anton", "Spy", "3"));

        System.out.println(serializeObject(persons));

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", 100, "red"));
        fruits.add(new Fruit("orange", 200, "orange"));

        System.out.println(serializeObject(fruits));

    }

    static public String serializeObject(List<?> persons) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        final Object person = persons.get(0);
        final EnclosingTag annotation = person.getClass().getAnnotation(EnclosingTag.class);
        final String JsonName = annotation.JsonName();
        stringBuilder.append(JsonName+":\n");

        for (Object onePerson : persons) {
            stringBuilder.append(onePerson.getClass().getSimpleName()+"\n{\n");

            for (Field field : onePerson.getClass().getDeclaredFields()){
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);

                if (fieldAnnotation != null) {
                    stringBuilder.append("\"" + fieldAnnotation.fieldJsonName() + "\":"
                            + "\""+ field.get(onePerson).toString() +"\"" +"; \n");
                }
            }
            stringBuilder.append("}\n\n");
        }
        return stringBuilder.toString();
    }

}
