package com.mera.training.dorovskikh.suprematism;

enum pointQuadrant
{
    I("top-right"),
    II("top-left"),
    III("bottom-left"),
    IV("bottom-right");

    String quadrantDescription;
    pointQuadrant(String description)
    {
        this.quadrantDescription = description;
    }

    @Override
    public String toString() {
        return "Quadrant " + this.name() + " is " + this.quadrantDescription;
    }
}
