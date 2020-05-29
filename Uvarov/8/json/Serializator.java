package mera.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Serializator {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface JsonName {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface JsonIgnore {
    }

    public static String serialize(Object object) throws IllegalAccessException {
        StringBuilder result = new StringBuilder();

        Class<?> serializedClass = object.getClass();
        ArrayList<Field> fields = new ArrayList<>();
        for (Field field : serializedClass.getDeclaredFields()) {
            if (field.getAnnotation(JsonIgnore.class) == null) {
                fields.add(field);
            }
        }

        for (int i = 0; i < fields.size(); i++) {
            {
                Field field = fields.get(i);
                field.setAccessible(true);
                String jsonName = field.getAnnotation(JsonName.class).value();
                result.append("\"").append(jsonName).append("\":\"").append(field.get(object)).append("\"");
                if (i != fields.size() - 1) {
                    result.append(";");
                }

            }
        }
        return "{" + result + "}";
    }
}
