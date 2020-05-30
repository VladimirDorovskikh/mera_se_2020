package com.mera.lection4.ex2;

import com.mera.lection4.Fruit;
import com.mera.lection4.Apple;

public class RedApplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Apple(0);
    }
}
