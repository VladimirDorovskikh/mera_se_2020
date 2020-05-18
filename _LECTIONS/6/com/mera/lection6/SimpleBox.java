package com.mera.lection6;

import java.util.ArrayList;
import java.util.List;

public class SimpleBox<STORED_TYPE> {
    private STORED_TYPE item;

    public STORED_TYPE getItem() { return item; }
    public void setItem(STORED_TYPE item) { this.item = item; }



    public static void main(String[] args) {


        List<SimpleBox<Integer>> listOfBoxesOfInteger = new ArrayList<>();


        System.out.println(listOfBoxesOfInteger);

        SimpleBox<Double> doubleBox = new SimpleBox<Double>();
      //  doubleBox.setItem(40);
        doubleBox.setItem(40d);

        SimpleBox<Integer> integerBox = new SimpleBox<>();
    //    integerBox.setItem(13d);
        integerBox.setItem(13);

        final Integer integerItem = integerBox.getItem();
        addTwoToIntegerAndPrint(integerItem);

        final Double doubleItem = doubleBox.getItem();
        addThreeToDoubleAndPrint(doubleItem);
    }

    public static void addTwoToIntegerAndPrint(Integer value) {
        System.out.println(value + "+2=");
        System.out.println(value + 2);
    }

    public static void addThreeToDoubleAndPrint(Double value) {
        System.out.println(value + "+2=");
        System.out.println(value + 2);
    }



}
