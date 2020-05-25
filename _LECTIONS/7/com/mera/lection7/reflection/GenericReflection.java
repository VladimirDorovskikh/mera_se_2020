package com.mera.lection7.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GenericReflection {

    public static class ClassWithGenericFieldAndMethod {
        public Map<String,Integer> genericField;
        public List<Number> genericMethod(Map<Long,Long> map){
            return new ArrayList<>();
        }
    }


    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        final Type genericField = ClassWithGenericFieldAndMethod.class.getField("genericField").getGenericType();
       /* if (genericField instanceof ParameterizedType) {
            final ParameterizedType paramterizedType = (ParameterizedType) genericField;
            System.out.println(Arrays.toString(paramterizedType.getActualTypeArguments()));//String, Integer
        }*/

        final Method genericMethod = ClassWithGenericFieldAndMethod.class.getMethod("genericMethod",Map.class);
        if (genericMethod.getGenericReturnType() instanceof ParameterizedType) {
            final ParameterizedType paramterizedType = (ParameterizedType) genericMethod.getGenericReturnType();
            System.out.println(Arrays.toString(genericMethod.getGenericParameterTypes()));
           // System.out.println(Arrays.toString(paramterizedType.getActualTypeArguments()));//Number

        }

        final Type genericParameterType = genericMethod.getGenericParameterTypes()[0];//Long,Long*/


    }

}
