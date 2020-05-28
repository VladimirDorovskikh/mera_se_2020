package com.mera.training.task08;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Task0801 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        List<MyPerson> myPersons = new ArrayList<>();

        myPersons.add(new MyPerson("FirstName01", "Pswd01", 12));
        myPersons.add(new MyPerson("FirstName02", "Pswd02", 22));
        myPersons.add(new MyPerson("FirstName03", "Pswd03", 32));

        SerializerJson serializerJson = new SerializerJson();
        System.out.println(serializerJson.serializeObject(myPersons));

        DeserializerJson deserializerJson = new DeserializerJson();
        System.out.println(deserializerJson.deserializeObject(serializerJson.serializeObject(myPersons), MyPerson.class));
    }
}
