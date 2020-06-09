package com.mera.training.dorovskikh.json;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.mera.training.dorovskikh.json.ReadJsonObject.fromJson;

/**
 * класс может записывать любой объект в упрощенном формате JSON:
 * - Объект начинается с { и заканчивается }
 * - Свойство это пара "ключ:значение"
 * - Все свойства отделены друг от друга точкой с запятой
 * - Все названия свойств в двойных кавычках
 * - Значениями свойств могут быть только строки ( в двойных кавычках) или числа (с плавающей точкой, без кавычек)
 * будет выглядеть так
 * {
 * "name":"Vasya",
 * "age":12
 * }
 */
public class WriteJson
{
    public static String toJson(Object o)
    {
        String result = "";
        boolean found = false;
        boolean first = true;

        for (Field f: o.getClass().getDeclaredFields())
        {
            JsonField a = f.getAnnotation(JsonField.class);
            if (a != null)
            {
                if( first )
                {
                    result = "{\n";
                    first = false;
                    found = true;
                }
                else
                {
                    result += ";\n";
                }
                if (f.getType().equals(double.class))
                {
                    result += "\t\"";
                    result += a.value();
                    result += "\":";
                    try
                    {
                        result += String.format("%.1f", f.get(o));
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (f.getType().equals(java.lang.String.class))
                {
                    result += "\t\"";
                    result += a.value();
                    result += "\":\"";
                    try
                    {
                        result += f.get(o);
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                    result += "\"";
                }
            }
        }
        if (found)
        {
            result += "\n}";
        }
        return result;
    }
}
