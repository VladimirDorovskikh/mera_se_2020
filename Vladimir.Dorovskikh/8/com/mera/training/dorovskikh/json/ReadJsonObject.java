package com.mera.training.dorovskikh.json;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * Создайте класс, который может читать любой объект в упрощенном формате JSON.
 * например ,deserialize(<пример выше>, Person.class) вернет экземпляр Person{name="Vasya",age=12,password=null}
 */
public class ReadJsonObject
{
    static public Object fromJson(String objectData, Class className)
    {
        Object result = null;
        Constructor[] ctors = className.getConstructors();
        Constructor ctor = null;
        for (int i = 0; i < ctors.length; i++)
        {
            ctor = ctors[i];
            if(ctor.getParameterTypes().length == 0)
            {
                break;
            }
        }

        try
        {
            result = ctor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e)
        {
            e.printStackTrace();
        }

        String[] dataPairs = objectData.replaceAll("[ {}\t\n\"]", "").split(";");
        HashMap jsonData = new HashMap();

        for (int i = 0; i < dataPairs.length; i++)
        {
            String[] pair = dataPairs[i].split(":");
            jsonData.put(pair[0], pair[1]);
        }

        for (Field f: className.getDeclaredFields())
        {
            JsonField a = f.getAnnotation(JsonField.class);
            if (a != null)
            {
                try
                {
                    if(f.getType().equals(double.class))
                    {
                        f.set(result, Double.valueOf( (String) jsonData.get(a.value())));
                    }
                    else
                    {
                        f.set(result, jsonData.get(a.value()));
                    }
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }
}
