package com.pradedov.lab8.serialization;

import java.lang.reflect.Field;
import java.util.*;

public class SimpleJsonSerializer {
    public SimpleJsonSerializer() {
    }

    /*
     * [
     *  {
     *      "key":"value",
     *      "key":"value"
     *  },
     *  {
     *      "key":"value",
     *      "key":"value"
     *  }
     * ]
     */
    public <T> String serialize(List<T> input) throws IllegalAccessException {
        StringBuilder output = new StringBuilder();

        if (input.size() > 0) {
            output.append("[\n");

            for (Iterator<T> listIter = input.iterator(); listIter.hasNext(); ) {
                T listItem = listIter.next();
                output.append("\t{\n");

                List<Field> serializableFields = new ArrayList<>();
                for (Field field: listItem.getClass().getDeclaredFields()) {
                    if (null != field.getAnnotation(JsonName.class)) {
                        serializableFields.add(field);
                    }
                }

                for (Iterator<Field> fieldIter = serializableFields.iterator(); fieldIter.hasNext(); ) {
                    Field fieldItem = fieldIter.next();

                    fieldItem.setAccessible(true);
                    String jsonKey = fieldItem.getAnnotation(JsonName.class).key();
                    output.append("\t\t").append("\"").append(jsonKey).append("\":");

                    if (String.class == fieldItem.getType()) {
                        output.append("\"").append(fieldItem.get(listItem)).append("\"");
                    }
                    else if (double.class == fieldItem.getType()) {
                        output.append(fieldItem.get(listItem));
                    }
                    else {
                        throw new IllegalArgumentException("Unsupported parameter type: " + fieldItem.getType().toString());
                    }

                    if (fieldIter.hasNext()) {
                        output.append(",");
                    }

                    output.append("\n");
                }

                output.append("\t}");
                if(listIter.hasNext()) {
                    output.append(",");
                }
                output.append("\n");
            }

            output.append("]\n");
        }
        return output.toString();
    }


    public <T> List<T> deserialize(String input, Class<T> outputKlass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        List<T> output = new ArrayList<>();
        List<Field> allKlassFields = new ArrayList<>(Arrays.asList(outputKlass.getDeclaredFields()));

        // Get list of all fields that take part in serialization
        List<Field> serializableFields = new ArrayList<>();
        for(Field field: allKlassFields) {
            if (null != field.getAnnotation(JsonName.class)) {
                serializableFields.add(field);
            }
        }

        // Parse JSON file
        List<Map<String,String>> entries = getJsonEntries(input);


        // Prepare JSON based instances
        for (Map<String, String> stringStringMap : entries) {
            // 1. Create new instance of outputKlass
            Object newKlassItem = Class.forName(outputKlass.getName()).newInstance();

            // 2. Take all the key:value pairs from the JSON and assign proper values to outputKlass object
            for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                for (Field field : serializableFields) {
                    if (field.getAnnotation(JsonName.class).key().equals(key)) {
                        field.setAccessible(true);
                        if (field.getType() == String.class) {
                            field.set(newKlassItem, value);
                        } else if (field.getType() == double.class) {
                            field.set(newKlassItem, Double.parseDouble(value));
                        }
                    }
                }
            }

            // 3. Add outputKlass object to the output list
            //noinspection unchecked
            output.add(((T) newKlassItem));
        }

        return output;
    }

    /**
     * @param json - is a single line Sting representing all json items:  "key1":"value1","key2":"value2"...
     * @return output - is a list of Maps <String key, String value> for each json item
     */
    private List<Map<String, String>> getJsonEntries(String json) {
        List<Map<String, String>> output = new ArrayList<>();

        if (json.length() > 0) {
            boolean hasNext = true;
            int startIdx = 0;
            int endIdx;
            do {
                startIdx = json.indexOf("{", startIdx);
                endIdx = json.indexOf("}", startIdx);
                if (startIdx >= 0 && endIdx >=0) {
                    String item;
                    item = json.substring(startIdx + 1, endIdx - 1);
                    startIdx = endIdx;
                    item = item.replaceAll("\\s", "");
                    Map<String, String> itemOutput = getJsonEntry(item);

                    output.add(itemOutput);
                }
                else {
                    hasNext = false;
                }
            } while(hasNext);
        }
        return output;
    }

    /**
     * @param input - is a single line string representing one json item:   "key1":"value1","key2":"value2"...
     * @return output - is a map of pairs <String key, String value>
      */
    private Map<String,String> getJsonEntry(String input) {
        Map<String, String> output = new HashMap<>();
        int startIdx = 0;
        int itemSeparatorIdx;
        int keyValueSeparatorIdx;
        boolean hasNext = true;

        // Add (,") to the input in order to process all items in the same way
        input = input + ",\"";

        // Go through all items
        do {
            // Make a decision if we have the only item or several ones
            itemSeparatorIdx = input.indexOf(",\"", startIdx);
            if (itemSeparatorIdx > 0) {
                String item = input.substring(startIdx, itemSeparatorIdx);

                // process separate "key":"value" item
                keyValueSeparatorIdx = item.indexOf(":");
                String key = item.substring(1, keyValueSeparatorIdx - 1);

                int indexValueFrom = keyValueSeparatorIdx + 1;
                int IndexValueTo = item.length();
                if (item.indexOf("\"", keyValueSeparatorIdx) > 0 ) {
                    // means value is a string in form "value" and we need to cut double quotes off
                    indexValueFrom += 1;
                    IndexValueTo -= 1;
                }
                String value = item.substring(indexValueFrom, IndexValueTo);

                output.put(key, value);

                startIdx = itemSeparatorIdx + 1;
            }
            else {
                hasNext = false;
            }
        } while (hasNext);

        return output;
    }
}
