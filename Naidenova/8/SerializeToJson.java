import java.lang.reflect.Field;
import java.util.List;

public class SerializeToJson {

    static public String serializeObject(List<?> persons) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        final Object person = persons.get(0);
        final EnclosingTag annotation = person.getClass().getAnnotation(EnclosingTag.class);
        final String JsonName = annotation.JsonName();
        //stringBuilder.append(JsonName+":\n");

        for (Object onePerson : persons) {
            stringBuilder.append(onePerson.getClass().getSimpleName()+"\n{\n");

            for (Field field : onePerson.getClass().getDeclaredFields()){
                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);

                if (fieldAnnotation != null) {
                    stringBuilder.append("\"" + fieldAnnotation.fieldJsonName() + "\":"
                            + "\""+ field.get(onePerson).toString() +"\"" +"; \n");
                }
            }
            stringBuilder.append("}\n\n");
        }
        return stringBuilder.toString();
    }
}
