package com.mera.lection6;

public class BoundedGenerics {


    public static Comparable<?> maxNonGeneric(Comparable one, Comparable another) {
        return one.compareTo(another) > 0 ? one : another;
    }

    public static <T extends Comparable<T>> T max(T one, T another) {
        return one.compareTo(another) > 0 ? one : another;
    }

    public static void main(String[] args) {
        Integer one = 42;
        Integer another = 100;
        final Comparable<?> comparable = maxNonGeneric(one, another);
        final Integer max = max(one, another);
        final String maxString = max("ABC", "ZZZ");

    }
}
