package com.mera.lection7.reflection;

import java.lang.reflect.Field;

public class ReflectionFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // только public поля класса и всех его родителей
        final Field[] fields = PersonWithMiddleName.class.getFields();
        // все поля класса, без полей родительских классов
        final Field[] declaredFields = PersonWithMiddleName.class.getDeclaredFields();


        final Field middleNameField = PersonWithMiddleName.class.getDeclaredField("middleName");
        // делаем доступными private поля
        middleNameField.setAccessible(true);

        PersonWithMiddleName obj = new PersonWithMiddleName();

        middleNameField.set(obj, new String("Олегович"));

        final String middleNameFromGetter = obj.getMiddleName();
        System.out.println(middleNameFromGetter);
        final Object middleNameFromReflection = middleNameField.get(obj);
        System.out.println(middleNameFromReflection);

        System.out.println(middleNameFromReflection == middleNameFromGetter);

    }
}
