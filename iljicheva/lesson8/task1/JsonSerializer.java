package iljicheva.lesson8.task1;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonSerializer {
    public JsonSerializer() {
    }

    static String jsonSerialize(Object inputObject) throws IllegalAccessException {
        StringBuilder resultObject = new StringBuilder();
        resultObject.append("{\n");

        for (Field field : inputObject.getClass().getFields()){
            if(!field.isAnnotationPresent(JsonIgnore.class) &&
                    field.isAnnotationPresent(JsonName.class)){
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if(field.getAnnotatedType().getType() == double.class){
                    resultObject.append("\t\"").append(fieldAnnotation.value()).append("\":")
                            .append(field.get(inputObject).toString()).append(",\n");
                } else if(field.getAnnotatedType().getType() == String.class){
                    resultObject.append("\t\"").append(fieldAnnotation.value()).append("\":\"")
                            .append(field.get(inputObject).toString()).append("\"").append(",\n");
                } else {
                    throw new IllegalArgumentException("Unsupported parameter type");
                }
            }
        }
        resultObject.append("}");
        return resultObject.toString();
    }

    static public String serializeObjects(List<?> objects) throws IllegalAccessException {

        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : objects) {
            stringBuilder.append(jsonSerialize(object));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    static public Object jsonDeSerialize(String inputString, Class<?> objectClass) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Object object = Class.forName(objectClass.getName()).newInstance();
        Map<String,String> map = new HashMap<>();
        String[] deserializeString = inputString.replaceAll("[{\n\t\"}]", "").split(",");
        for(String str : deserializeString){
            int pos = str.indexOf(":");
            String fieldName = str.substring(0, pos);
            String fieldValue = str.substring(pos + 1);
            map.put(fieldName, fieldValue);
        }
        for (Field field : objectClass.getDeclaredFields()){
            if (field.getAnnotation(JsonIgnore.class) == null) {
                if (field.getType() == double.class) {
                    field.set(object, Double.parseDouble(map.get(field.getAnnotation(JsonName.class).value())));
                } else if (field.getType() == String.class){
                    field.set(object, map.get(field.getAnnotation(JsonName.class).value()));
                } else {
                    throw new IllegalArgumentException("Unsupported parameter type");
                }
            }
        }
        return object;
    }
}
