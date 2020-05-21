package com.mera.lection7.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Methods {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Class<PersonWithMiddleName> clazz = PersonWithMiddleName.class;
        // public методы из суперклассов
        final Method[] publicMethods = clazz.getMethods();
        // все методы из одного класса
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        // если метод приватный - его надо сделать доступным
        //declaredMethods[0].setAccessible(true);
        final Method setFirstName = clazz.getMethod("setFirstName", String.class);

        PersonWithMiddleName p = new PersonWithMiddleName();
        setFirstName.invoke(p, "Вася");
        System.out.println(p.getFirstName());

    }
}
