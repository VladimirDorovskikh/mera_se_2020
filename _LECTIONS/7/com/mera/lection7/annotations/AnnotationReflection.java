package com.mera.lection7.annotations;

import java.lang.annotation.Annotation;

public class AnnotationReflection {
    public static void main(String[] args) {
        final Class<MyPerson> personClazz = MyPerson.class;
        for (Annotation annotation : personClazz.getAnnotations()) {
            if (annotation instanceof DatabaseTable) {
                final DatabaseTable tableAnnotation = (DatabaseTable) annotation;
                final int id = tableAnnotation.firstId();
                final String tableName = tableAnnotation.tableName();

                System.out.println(String.format("id %s, name %s", id,tableName));
            }
        };

        // TODO show field annotations
    }
}
