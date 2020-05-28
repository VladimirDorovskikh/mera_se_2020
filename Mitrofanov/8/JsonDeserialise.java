import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class JsonDeserialise {
    public static <T> T deserialise(String json, Class<T> clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object object = clazz.getDeclaredConstructor().newInstance();
        System.out.println(json);
        String[] splitStrings = json.split(";");
        for (String uniqueLine : splitStrings) {
            for (Field field : clazz.getFields()) {
                uniqueLine = uniqueLine.replace("\"", "");
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if (uniqueLine.contains(fieldAnnotation.jName())) {
                    List<String> strings2 = Arrays.asList(uniqueLine.split(":"));
                    String result = strings2.get(1);
                    if (isNumeric(result)) {
                        field.set(object, Double.valueOf(strings2.get(1)));
                    } else {
                        field.set(object, result);
                    }
                }
            }
        }
        return clazz.cast(object);
    }

    public static boolean isNumeric(String testStr) {
        if (testStr == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(testStr);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
