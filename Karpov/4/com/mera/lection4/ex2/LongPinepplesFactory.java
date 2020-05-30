package com.mera.lection4.ex2;

import com.mera.lection4.Pineapple;
import com.mera.lection4.Fruit;

public class LongPinepplesFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
        return new Pineapple(10, Pineapple.MAX_GREENTOP);
    }
}
