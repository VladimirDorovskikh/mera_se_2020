package com.mera.lection7.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSample {


    public static void main(String[] args) {
        Map<String, Integer> stringToLenght = new HashMap<>();

        final List<String> names = Arrays.asList("Андрей","Вася","Петя","ываываываываыва234234");

        for (String name : names) {
            stringToLenght.put(name, name.length());
        }

        System.out.println(stringToLenght.get("Андрей"));

        for (Entry<String, Integer> strToLength : stringToLenght.entrySet()) {
            System.out.println(strToLength.getKey());
            System.out.println(":");
            System.out.println(strToLength.getValue());
        }


    }
}
