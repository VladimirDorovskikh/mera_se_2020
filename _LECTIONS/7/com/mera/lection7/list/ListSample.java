package com.mera.lection7.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListSample {
    public static void main(String[] args) {
        List<String> strings = new CopyOnWriteArrayList<>();
        strings.add("Str1");
        strings.add("Str2");
        strings.add("Str3");
        for (String string : strings) {
            System.out.println(string);
        }


        //strings.listIterator().add("new String\n");
        int index = 0;
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext(); ) {
            iterator.next();
            System.out.println(iterator.nextIndex());

            if (iterator.nextIndex() == 2) {
                strings.add("Another string");
            }
        }


        System.out.println(strings);


    }
}
