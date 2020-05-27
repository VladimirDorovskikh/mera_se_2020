package mera.json;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Deserializator {

    public static Object deserialize(String json, Class<?> outputClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String[] elementsArray = json.substring(1, json.length() - 1).split(";");
        Map<String, String> fieldsValues = new HashMap<>();

        for (String s : elementsArray) {
            fieldsValues.put(s.substring(0, s.indexOf(":")).replace("\"", ""),
                    s.substring(s.indexOf(":") + 1).replace("\"", ""));
        }

        Class<?> clazz = Class.forName(outputClass.getName());
        Object result = clazz.newInstance();

        Field[] fields = outputClass.getDeclaredFields();
        for (Field field : fields) {
            {
                if (field.getAnnotation(Serializator.JsonIgnore.class) == null) {
                    field.setAccessible(true);

                    String jsonName = field.getAnnotation(Serializator.JsonName.class).value();
                    if (field.getType() == double.class) {
                        field.set(result, Double.parseDouble(fieldsValues.get(jsonName)));
                    } else if (field.getType() == int.class) {
                        field.set(result, Integer.parseInt(fieldsValues.get(jsonName)));
                    } else {
                        field.set(result, fieldsValues.get(jsonName));
                    }

                }
            }
        }
        return result;
    }
}
