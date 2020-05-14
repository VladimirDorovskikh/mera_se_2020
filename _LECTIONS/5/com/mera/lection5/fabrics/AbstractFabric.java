package com.mera.lection5.fabrics;

public abstract class AbstractFabric {

    private final static String SOME_CONSTANT = "54";

    public void makeAndPrint() {
        final Object item = makeSomething();
        System.out.println(item.toString());
    }


    abstract Object makeSomething();
}
