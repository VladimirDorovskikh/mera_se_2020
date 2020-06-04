package com.mera.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {


    public static void main(String[] args) {

        String str = "Привет, (Вася!";
        Pattern p = Pattern.compile("(.*?),(.*)");

        final Matcher matcher = p.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }


        final String[] split = str.split("\\(");
        System.out.println(split);
    }

}
