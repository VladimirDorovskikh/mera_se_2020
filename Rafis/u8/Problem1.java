/**
 * Задание 8.Аннотации и рефлексия
 * Аннотированная де\сериализация.
 * Создайте класс, который может записывать любой объект в упрощенном формате JSON:
 * - Объект начинается с { и заканчивается }
 * - Свойство это пара "ключ:значение"
 * - Все свойства отделены друг от друга точкой с запятой
 * - Все названия свойств в двойных кавычках
 * - Значениями свойств могут быть только строки ( в двойных кавычках) или числа (с плавающей точкой, без кавычек)
 *
 * - Создайте аннотацию @JsonName, чтобы определять имя свойства в JSON формате
 * - Создайте аннотацию @JsonIgnore, чтобы исключить поля из сериализации
 * Например, класс Person {
 * @JsonName("name")
 * String firstName="Vasya";
 *
 * @JsonName("years")
 * double age=12
 * @JsonIgnore
 * String password;
 * }
 * будет выглядеть так
 * {
 * "name":"Vasya",
 * "age":12
 * }
 * Создайте класс, который может читать любой объект в упрощенном формате JSON.
 * например ,deserialize(<пример выше>, Person.class) вернет экземпляр Person{name="Vasya",age=12,password=null}
 */

package Rafis.u8;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MySerializable {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface JsonName {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface JsonIgnore {}


public class Problem1 {

    @MySerializable("Person")
    static class Person {

        @JsonName("name")
        public String firstName;

        @JsonName("years")
        public double age;

        @JsonIgnore
        public String password;

        public Person(String firstName, int age, String password) {
            this.firstName = firstName;
            this.age = age;
            this.password = password;
        }

        public Person() {}

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", age=" + age +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    static class Serializer {
        static public String serializeJson(Object object) throws IllegalAccessException {
            StringBuilder stringBuilder = new StringBuilder();

            for (Annotation annotation : object.getClass().getAnnotations()) {
                if (annotation instanceof MySerializable) {
                    stringBuilder.append("{\n");

                    for (Field field : object.getClass().getFields()) {
                        final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                        if (fieldAnnotation != null) {
                            if (field.getType() == String.class) {
                                stringBuilder.append("\t\"" + fieldAnnotation.value() + "\": \"" +
                                        field.get(object).toString() + "\",\n");
                            } else if (field.getType() == double.class) {
                                stringBuilder.append("\t\"" + fieldAnnotation.value() + "\": " +
                                        field.get(object).toString() + ",\n");
                            }
                        }
                    }
                    // remove last comma
                    final int lastCommaPos = stringBuilder.length() - 2;
                    stringBuilder.deleteCharAt(lastCommaPos);

                    stringBuilder.append("}\n");
                }
            }

            return stringBuilder.toString();
        }
    }

    @SuppressWarnings("unchecked")
    static class Deserializer {
        static public <T> T deserializeJson(String obj, Class<?> objClass)
                throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Object object = objClass.getConstructor().newInstance();

            for (String row : obj.split("\n")) {
                for (Field field : objClass.getDeclaredFields()) {
                    field.setAccessible(true);
                    final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                    if (fieldAnnotation != null) {
                        if (row.contains(fieldAnnotation.value())) {
                            String fieldVal = row.substring(row.indexOf(':')).replaceAll("[ ,:\"]", "");

                            if (field.getAnnotatedType().getType() == String.class) {
                                field.set(object, fieldVal);
                            } else if (field.getAnnotatedType().getType() == double.class) {
                                field.set(object, Double.valueOf(fieldVal));
                            }
                        }
                    }
                }
            }

            return (T) object;
        }
    }

    void doTheJob() {
        Person p = new Person("Vasya", 12, "VasyaTheKing");

        try {
            String serialized = Serializer.serializeJson(p);
            System.out.println(serialized);

            Person deserialized = Deserializer.deserializeJson(serialized, Person.class);
            System.out.println(deserialized.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.doTheJob();
    }
}
