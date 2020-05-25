package com.mera.lection7.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LessonSample {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        try {
            final Class<?> personClazz = Class.forName("com.mera.lection7.reflection.Person");
            final Object personObject = personClazz.newInstance();

            final Field lastName = personClazz.getDeclaredField("lastName");
            lastName.setAccessible(true);
            lastName.set(personObject,"Пупкин");

            final Method setFirstName = personClazz.getMethod("setFirstName", String.class);
            setFirstName.invoke(personObject, "Вася");

            System.out.println(personObject.toString());


            for (Method declaredMethod : personClazz.getDeclaredMethods()) {
                System.out.println(declaredMethod.getName() + " : " + Arrays.toString(declaredMethod.getParameters()));
            }


        } catch (ClassNotFoundException e) {
            System.out.println("Нет такого класса");
        }

    }
}
