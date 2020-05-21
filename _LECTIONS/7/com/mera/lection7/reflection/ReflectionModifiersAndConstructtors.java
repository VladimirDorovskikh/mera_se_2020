package com.mera.lection7.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionModifiersAndConstructtors {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> personClazz = Person.class;

        int modifiers = personClazz.getModifiers();
        boolean isAbstract = Modifier.isAbstract(modifiers);
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isStatic = Modifier.isStatic(modifiers);
        boolean isSyncronized = Modifier.isSynchronized(modifiers);
        boolean isTransient = Modifier.isTransient(modifiers);

        System.out.println(isPublic);
        System.out.println(isAbstract);
        System.out.println(isInterface);


        Class<? super Person> superclass = Person.class.getSuperclass();

        Class[ ] interfaces = PersonWithMiddleName.class.getInterfaces();
        for (int i = 0; i < interfaces.length; i++)  {
            System.out.println(interfaces[i].getTypeName());
        }


        final Class<PersonWithMiddleName> personWithMiddleNameClass = PersonWithMiddleName.class;
        // Constructors
        Constructor[] constructors = personWithMiddleNameClass.getConstructors();
        Constructor constructor = personWithMiddleNameClass.getConstructor(String.class, String.class, String.class);//throws NoSuchMethodException
        Class[] parameterTypes = constructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++)  {
            System.out.println("parameter " + i + " " + parameterTypes[i]);
        }

        final PersonWithMiddleName personWithMiddleName = PersonWithMiddleName.class.newInstance();
        final Object o = constructor.newInstance("Пупкин","Василий","Олегович");


    }
}
