package com.mera.kalinina.lesson8.annotation;


import java.lang.reflect.Field;
import java.util.List;

public class JsonSerializer {

    static public String serializeObject(Object object) throws IllegalAccessException, UnsupportedFieldTypeException {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");

        for (Field field : object.getClass().getFields()) {
            final JsonIgnore ignoreFieldAnnotation = field.getAnnotation(JsonIgnore.class);
            if(ignoreFieldAnnotation != null) {
                continue;
            }
            final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
            if (fieldAnnotation != null) {
                if (field.getAnnotatedType().getType() == double.class) {
                    stringBuilder.append("\t\"").append(fieldAnnotation.value()).append("\":").append(field.get(object).toString()).append(",\n");
                }
                else if (field.getAnnotatedType().getType() == String.class) {
                    stringBuilder.append("\t\"").append(fieldAnnotation.value()).append("\":\"").append(field.get(object).toString()).append("\",\n");
                }
                else {
                    throw new UnsupportedFieldTypeException("Class <" + object.getClass().getSimpleName() +
                            "> contains field of unsupported type: " + field.getAnnotatedType().getType() + ". Supported types are: String and double.");
                }
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static public String serializeObjects(List<?> objects) throws UnsupportedFieldTypeException, IllegalAccessException {
        final Object object = objects.get(0);
        final JsonEnclosing annotation = object.getClass().getAnnotation(JsonEnclosing.class);
        final String jsonEnclosingName = annotation.jsonEnclosingName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\"").append(jsonEnclosingName).append("\": [\n");
        for (Object obj : objects) {
            stringBuilder.append(serializeObject(obj)).append(",\n");
        }
        stringBuilder.append("\t\t]\n");
        return stringBuilder.toString();
    }


}
