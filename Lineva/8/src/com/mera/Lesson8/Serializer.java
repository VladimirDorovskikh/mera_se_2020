package com.mera.Lesson8;

import java.util.List;
import java.lang.reflect.Field;

class Serializer {

    final static String FIELD_NULL = "null", FIELD_INACCESSIBLE = "inaccessible";

    static public String serializeObject(Object object) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("{\n");

        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(JsonIgnore.class) &&
                    (field.isAnnotationPresent(JsonName.class))) {
                String value = "";
                try {
                    if (field.getType() == String.class) {
                        value = "\"" + field.get(object).toString() + "\"";
                    } else if (field.getType() == double.class) {
                        value = field.get(object).toString();
                    }
                }
                catch (NullPointerException exception) {
                    value = FIELD_NULL;
                }
                catch (IllegalAccessException exception) {
                    value = FIELD_INACCESSIBLE;
                }
                stringBuilder.append("\"" + field.getAnnotation(JsonName.class).key() + "\":" + value + ",\n");
            }
        }

        int lastDelimiterIndex = stringBuilder.lastIndexOf(",");
        stringBuilder.deleteCharAt(lastDelimiterIndex);
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    static public String serializeObjects(List<?> objects) {

        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : objects) {
            stringBuilder.append(serializeObject(object));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}