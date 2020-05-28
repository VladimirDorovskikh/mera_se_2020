import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class JsonDeserialise {
    public static <T> List<T> deserialise(String json, Class<T> clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object object = clazz.getDeclaredConstructor().newInstance();
        List<T> resultList = new ArrayList<>();
        System.out.println(json);
        String[] splitStrings = json.split("\n");
        List<String> finalStrings = new ArrayList<>();
        for (String uniqueLine : splitStrings) {
            uniqueLine = uniqueLine.replace("\"", "");
            uniqueLine = uniqueLine.replace(";", "");
            finalStrings.add(uniqueLine);
        }
        System.out.println(finalStrings);
        for (String uniqueLine : finalStrings) {
            for (Field field : clazz.getFields()) {
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
            if (uniqueLine.equals("}")) {
                resultList.add(clazz.cast(object));
                object = clazz.getDeclaredConstructor().newInstance();
            }
        }

//        clazz.cast(object);
        return resultList;
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
