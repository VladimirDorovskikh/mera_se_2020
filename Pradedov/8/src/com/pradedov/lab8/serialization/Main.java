package com.pradedov.lab8.serialization;

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

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasya", "Rogov",6, "qwerty1","Sovetskaya, 5, 1"));
        persons.add(new Person("Petya", "Antipov",17,"qwerty2","Sovetskaya, 5, 2"));
        persons.add(new Person("Anton","Sidorov",13,"qwerty3","Sovetskaya, 5, 3"));

        SimpleJsonSerializer serializer = new SimpleJsonSerializer();

        try {
            String serializationResult = serializer.serialize(persons);
            System.out.println(serializationResult);

            List<Person> deserializationResult = serializer.deserialize(serializationResult, Person.class);
            for (Person person: deserializationResult) {
                System.out.println(person.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
