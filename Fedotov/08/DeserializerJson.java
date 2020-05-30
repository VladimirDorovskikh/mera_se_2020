package com.mera.training.task08;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class DeserializerJson {

    public Object deserializeObject(String serializedObj, Class<?> simpleJsonClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object object = Class.forName(simpleJsonClass.getName()).newInstance();
        String pats[] = serializedObj.split("\n");

        System.out.println("\nDeserialize\n");

        for (String part : pats) {
            for (Field field : simpleJsonClass.getDeclaredFields()) {
                field.setAccessible(true);
                part = part.replace("\"", "");
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if (fieldAnnotation != null) {
                    if (part.contains(fieldAnnotation.fieldJsonName())) {
                        List<String> str = Arrays.asList(part.split(":"));
                        String s = str.get(1);

                        if (field.getAnnotatedType().getType().getTypeName() == "java.lang.String") {
                            field.set(object, s);
                        } else if (field.getAnnotatedType().getType() == double.class) {
                            field.set(object, Double.valueOf(str.get(1)));
                        }
                        System.out.println(object.toString());
                    }
                }
            }
        }

        return object;
    }
}
