package com.mera.kalinina.lesson8.annotation;

/*
Задание 8.Аннотации и рефлексия
Аннотированная де\сериализация.
Создайте класс, который может записывать любой объект в упрощенном формате JSON:
- Объект начинается с { и заканчивается }
- Свойство это пара "ключ:значение"
- Все свойства отделены друг от друга точкой с запятой
- Все названия свойств в двойных кавычках
- Значениями свойств могут быть только строки ( в двойных кавычках) или числа (с плавающей точкой, без кавычек)

- Создайте аннотацию @JsonName, чтобы определять имя свойства в JSON формате
- Создайте аннотацию @JsonIgnore, чтобы исключить поля из сериализации
Например, класс Person {
@JsonName("name")
String firstName="Vasya";

@JsonName("years")
double age=12
@JsonIgnore
String password;
}
будет выглядеть так
{
"name":"Vasya",
"age":12
}
Создайте класс, который может читать любой объект в упрощенном формате JSON.
например ,deserialize(<пример выше>, Person.class) вернет экземпляр Person{name="Vasya",age=12,password=null}
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IllegalAccessException, UnsupportedFieldTypeException, InstantiationException, ClassNotFoundException {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Ivan", 18, "qwerty"));
        persons.add(new Person("Petya", 20, "12345"));
        persons.add(new Person("Vasya", 30, "11111"));

        for(Person person : persons) {
            System.out.println(person);
        }

        // JSON Serializer Test
        System.out.println(JsonSerializer.serializeObjects(persons));

        // JSON Deserializer Test
        String personInJsonFormat = JsonSerializer.serializeObject(persons.get(0));
        System.out.println(JsonDeserializer.deserializeObject(personInJsonFormat, Person.class));
    }
}
