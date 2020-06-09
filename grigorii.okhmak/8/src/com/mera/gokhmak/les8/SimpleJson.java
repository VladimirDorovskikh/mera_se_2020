package com.mera.gokhmak.les8;

import com.mera.gokhmak.les8.annotations.JsonIgnore;
import com.mera.gokhmak.les8.annotations.JsonName;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleJson extends Deserializator<Person, String> {
    @Override
    public String serialize(Person input, Class<?> type) {
        StringBuilder b = new StringBuilder();
        b.append('{');
        Class<?> cls = type;
        List<String> lines = new ArrayList<>();
        if (cls != null) {
            for (Field field : cls.getFields()) {
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length > 0) {
                    if (anns[0] instanceof JsonIgnore) {
                        lines.add(field.getName() + ":" + "null");
                    } else if (anns[0] instanceof JsonName) {
                        JsonName jsonKey = (JsonName) anns[0];
                        try {
                            if (field.getType() == String.class) {
                                lines.add(jsonKey.value() + ":\"" + field.get(input) + "\"");
                            } else {
                                try {
                                    Number n = Double.parseDouble(field.get(input).toString());
                                    lines.add(jsonKey.value() + ":" + n.intValue());
                                } catch (NumberFormatException e) {
                                    lines.add(jsonKey.value() + ":" + field.get(input));
                                }
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            if (!lines.isEmpty()) {
                ListIterator<String> it = lines.listIterator();
                while (it.nextIndex() != lines.size() - 1) {
                    b.append(it.next().toString() + ",");
                }
                b.append(it.next().toString());
            }
        }
        b.append('}');
        return b.toString();
    }

    @Override
    public Person deserialize(String input) {
        return getPerson(input, Person.class);
    }

    @Override
    public Person deserialize(String input, Class<?> type) {
        return getPerson(input, type);
    }

    @Override
    public <T3> T3 deserialize1(String input, Class<?> type, T3 out) {
        T3 result = null;
        Class<?> cls = type;
        Map<String,String> map = getJsonMap(cls);
        if (map == null || out == null) {
            return out;
        }
        String jsonBody = null;
        if ((jsonBody = getJsonBody(input)) != null) {
            for (String line : jsonBody.split(",")) {
                String item[] = line.split(":");
                if (item == null || item.length != 2) {
                    continue;
                }
                String key = item[0].trim();
                String value = item[1].trim();
                String fieldName = map.get(key);
                if (fieldName != null) {
                    try {
                        if (cls.getField(fieldName).getType() == double.class) {
                            Number n = new Double(Double.parseDouble(value));
                            cls.getField(fieldName).set(out, n.intValue());
                        } else if (cls.getField(fieldName).getType() == String.class) {
                            if (value.startsWith("\"") && value.endsWith("\"")) {
                                value = value.substring(1, value.length() - 1);
                            }
                            cls.getField(fieldName).set(out, value);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return out;
    }

    private Person getPerson(String input, Class<?> type) {
        Person result = null;
        Class<?> cls = type;
        Map<String,String> map = getJsonMap(cls);
        if (map == null) {
            return null;
        } else {
            result = new Person(null, 0);
        }
        String jsonBody = null;
        if ((jsonBody = getJsonBody(input)) != null) {
            for (String line : jsonBody.split(",")) {
                String item[] = line.split(":");
                if (item == null || item.length != 2) {
                    continue;
                }
                String key = item[0].trim();
                String value = item[1].trim();
                String fieldName = map.get(key);
                if (fieldName != null) {
                    try {
                        if (cls.getField(fieldName).getType() == double.class) {
                            Number n = new Double(Double.parseDouble(value));
                            cls.getField(fieldName).set(result, n.intValue());
                        } else if (cls.getField(fieldName).getType() == String.class) {
                            if (value.startsWith("\"") && value.endsWith("\"")) {
                                value = value.substring(1, value.length() - 1);
                            }
                            cls.getField(fieldName).set(result, value);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return result;
    }

    private Map<String,String> getJsonMap(Class<?> type) {
        Map<String,String> result = null;
        Class<?> cls = type;
        if (cls != null) {
            result = new HashMap<>();
            for (Field field : cls.getFields()) {
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length > 0) {
                    if (anns[0] instanceof JsonName) {
                        JsonName jsonKey = (JsonName) anns[0];
                        result.put(jsonKey.value(), field.getName());
                    }
                }
            }
            if (result.isEmpty()) {
                result = null;
            }
        }
        return result;
    }

    private String getJsonBody(String serStruct) {
        String result = null;
        String regex = "\\{(.*)\\}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(serStruct);
        boolean found = m.find();
        if (found) {
            result = m.group(1);
        }
        return result;
    }

}

