package com.mera.Lesson8;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Deserializer {

    static public Object[] deserializeObjects(String jsonString, Class className) {
        jsonString = jsonString.replaceAll("\n", "");

        String[] objectStrings = jsonString.split("(?<=})");
        // objectStrings[i] example "{"name":"Cat","age":1.0}"

        Object[] objects = new Object[objectStrings.length];

        for (int i = 0; i < objectStrings.length; i++) {
            objects[i] = deserializeObject(objectStrings[i], className);
        }
        return objects;
    }

    static public Object deserializeObject(String jsonString, Class className) {
        jsonString = jsonString.replaceAll("[{}\"]", "");
        // jsonString = "name:Cat,age:1.0"

        try {
            Object object = className.newInstance();
            String[] objectFields = jsonString.split(",");
            Map<String, String> map = new HashMap<>();

            // objectFields[0] = "name:Cat", objectFields[1] = "age:1.0"
            for (int i = 0; i < objectFields.length; i++) {
                int delimiterIndex = objectFields[i].indexOf(":");
                String key = objectFields[i].substring(0, delimiterIndex); // key = "name"
                String value = objectFields[i].substring(delimiterIndex + 1); // value = "Cat"
                map.put(key, value);
            }
            for (Field field : className.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonName.class)) {
                    String key = field.getAnnotation(JsonName.class).key();
                    String value = map.get(key);
                    if (value != null) {
                        if ((!value.equals(Serializer.FIELD_NULL)) && (!value.equals(Serializer.FIELD_INACCESSIBLE))) {
                            if (field.getType() == String.class) {
                                field.set(object, value);
                            } else if (field.getType() == double.class) {
                                field.set(object, Double.parseDouble(value));
                            }
                        }
                    }
                }
            }
            return object;
        } catch (IllegalAccessException|InstantiationException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}