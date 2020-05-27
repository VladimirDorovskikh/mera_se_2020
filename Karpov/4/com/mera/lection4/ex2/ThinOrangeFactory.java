package com.mera.lection4.ex2;

import com.mera.lection4.Fruit;
import com.mera.lection4.Orange;


public class ThinOrangeFactory extends AbstractFabric{

    @Override
    public Fruit makeFruit() {
        return new Orange(1, 5);
    }
}

