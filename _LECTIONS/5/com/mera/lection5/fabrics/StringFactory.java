package com.mera.lection5.fabrics;

public class StringFactory extends AbstractFabric {

    @Override
    Object makeSomething() {
        return "SomeString";
    }
}
