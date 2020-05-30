import java.lang.reflect.Field;
import java.util.List;

/*
   Person {
        "firstName":"Vasya";
        "lastName":"Petrov";
        "Age":42;
        }
*/
public class JsonSerialise {
    static public String serialise(List<?> listOfObjects) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : listOfObjects) {
            stringBuilder.append("{\n");
            for (Field field : object.getClass().getFields()) {
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                if (fieldAnnotation != null) {
                    stringBuilder.append("\t\"" + fieldAnnotation.jName() + "\":\"" +
                            field.get(object).toString() + "\";\n");
                }
            }
            stringBuilder.append("}\n");
        }
        return stringBuilder.toString();
    }
}
