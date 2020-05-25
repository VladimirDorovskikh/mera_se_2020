package com.mera.lection7.annotations;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@EnclosingTag(tagName = "Persons")
public class Person {

    @TagName(fieldTagName = "FirstName")
    public String firstName;

    @TagName(fieldTagName = "LastName")
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @EnclosingTag(tagName = "Animals")
    public static class Animal {
        @TagName(fieldTagName = "AnimalName")
        public String name;
        @TagName(fieldTagName = "AnimalAge")
        public int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    /***
     * <Persons>
     *
     *     <Person>
     *         <FirstName>$$$</FirstName>
     *         <LastName>$$$</LastName>
     *     </Person>
     *
     *      <Person>
     *      *         <FirstName>$$$</FirstName>
     *      *         <LastName>$$$</LastName>
     *      </Person>
     *
     * </Persons>
     * @param args
     */


    public static void main(String[] args) throws IllegalAccessException {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Vasya", "Pupkin"));
        persons.add(new Person("Petya", "Zvezdochkin"));

        System.out.println(serializeObjects(persons));

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Sharik", 7));
        animals.add(new Animal("Barsik", 3));

        System.out.println(serializeObjects(animals));


    }

     static public String serializeObjects(List<?> persons) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
         final Object person = persons.get(0);
         final EnclosingTag annotation = person.getClass().getAnnotation(EnclosingTag.class);
         final String tagName = annotation.tagName();
         stringBuilder.append("<" + tagName + ">\n");


         for (Object onePerson : persons) {
             stringBuilder.append("\t<" + onePerson.getClass().getSimpleName() + ">\n");

             for (Field field : onePerson.getClass().getFields()) {
                 final TagName fieldAnnotation = field.getAnnotation(TagName.class);
                 if (fieldAnnotation != null) {
                     stringBuilder.append("\t\t<" + fieldAnnotation.fieldTagName() + ">" + field.get(onePerson).toString()
                             + "\t</" + fieldAnnotation.fieldTagName() + ">\n"
                     );

                 }
             }

             stringBuilder.append("\t</" + onePerson.getClass().getSimpleName() + ">\n");


         }
         stringBuilder.append("</" + tagName + ">\n");


         return stringBuilder.toString();
     }
}
