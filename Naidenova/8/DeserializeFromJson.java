import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class DeserializeFromJson {
    static public Object deserializeObject(String jsonObject, Class<?> jsonClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object objectFromJson = Class.forName(jsonClass.getName()).newInstance();
        String[] separations = jsonObject.split("\n");
        for (String separation : separations) {

            for (Field field : jsonClass.getDeclaredFields()) {
                field.setAccessible(true);
                separation = separation.replace("\"", "");
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if (fieldAnnotation != null) {
                    if (separation.contains(fieldAnnotation.fieldJsonName())) {
                        List<String> element = Arrays.asList(separation.split(":"));
                        if (field.getAnnotatedType().getType() == float.class) {
                            field.set(objectFromJson, Float.parseFloat(element.get(1)));
                        } else {
                            field.set(objectFromJson, element.get(1));
                        }

                    }
                }
            }
        }
    return objectFromJson;
    }

}
