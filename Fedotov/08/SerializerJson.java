package com.mera.training.task08;

import java.lang.reflect.Field;
import java.util.List;

public class SerializerJson {

    public String serializeObject(List<?> myObjects) throws IllegalAccessException {

        final Object jsonObject = myObjects.get(0);
        final EnclosingJson annotation = jsonObject.getClass().getAnnotation(EnclosingJson.class);
        final String jsonName = annotation.jsonName();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n" + jsonName + "\n");

        System.out.println("\nSerialize\n");

        stringBuilder.append("{");
        for (Object oneJsonObject : myObjects) {
            for (Field field : oneJsonObject.getClass().getDeclaredFields()) {
                final JsonIgnore fieldAnnotationIgnore = field.getAnnotation(JsonIgnore.class);
                if (fieldAnnotationIgnore != null) {
                    System.out.println("Ignore: " + fieldAnnotationIgnore.fieldJsonIgnore() + "\":\"" + field.get(oneJsonObject).toString());
                }
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if (fieldAnnotation != null) {
                    if (field.getAnnotatedType().getType().getTypeName() == "java.lang.String") {
                        stringBuilder.append("\n\"" + fieldAnnotation.fieldJsonName() + "\":\"" + field.get(oneJsonObject).toString()
                                + "\""
                        );
                    } else if (field.getAnnotatedType().getType() == double.class) {
                        stringBuilder.append(",\n\"" + fieldAnnotation.fieldJsonName() + "\":" + field.get(oneJsonObject).toString()
                        );
                    }
                }
            }
        }
        stringBuilder.append("\n}");

        return stringBuilder.toString();
    }
}
