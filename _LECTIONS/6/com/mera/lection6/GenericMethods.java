package com.mera.lection6;

import java.io.Serializable;

public class GenericMethods {



    static public <T> T getFirstNonNull(T  one, T another) {
        if (one != null) {
            return one;
        } else if (another != null) {
            return another;
        }
        return null;
    }


    public static void main(String[] args) {
        final String abc = getFirstNonNull(null, "abc");
        final Integer integerNonNull = getFirstNonNull(null, 1);
        System.out.println(abc);
    }
}
