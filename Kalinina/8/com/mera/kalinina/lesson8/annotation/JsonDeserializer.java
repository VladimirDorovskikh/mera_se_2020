package com.mera.kalinina.lesson8.annotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonDeserializer {

    static public Object deserializeObject(String objectInJsonFormat, Class<?> objectClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException, UnsupportedFieldTypeException {

        Object object = Class.forName(objectClass.getName()).newInstance();

        // parse object in JSON format and save parsed field names and field values to map
        Map<String, String> fieldMap = new HashMap<>();
        String[] fieldsInJsonFormat = objectInJsonFormat.replaceAll("[{}\n\t\"]", "").split(",");
        for (String field : fieldsInJsonFormat) {
            int pos = field.indexOf(":");
            String fieldName = field.substring(0, pos);
            String fieldValue = field.substring(pos + 1);
            fieldMap.put(fieldName, fieldValue);
        }

        for (Field field : objectClass.getDeclaredFields()) {
            final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
            if (fieldAnnotation != null) {
                String fieldValue = fieldMap.get(fieldAnnotation.value());
                if (fieldValue != null) {
                    if (field.getAnnotatedType().getType() == double.class) {
                        field.set(object, Double.valueOf(fieldValue));
                    } else if (field.getAnnotatedType().getType() == String.class) {
                        field.set(object, fieldValue);
                    } else {
                        throw new UnsupportedFieldTypeException("Class <" + objectClass.getSimpleName() +
                                "> contains field of unsupported type: " + field.getAnnotatedType().getType() + ". Supported types are: String and double.");
                    }
                }
            }
        }
        return object;
    }
}




