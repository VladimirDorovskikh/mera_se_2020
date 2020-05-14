package com.mera.lection5.exceptions;

import java.util.Arrays;
import java.util.List;

public class Apple {


    public static final String КРАСНЫЙ = "красный";
    public static final String ЖЕЛТЫЙ = "желтый";
    public static final String ЗЕЛЕНЫЙ = "зеленый";

    List<String> VALID_COLORS = Arrays.asList(КРАСНЫЙ, ЖЕЛТЫЙ, ЗЕЛЕНЫЙ);
    String color;
    int weight;

    public Apple(String color, int weight) throws NotValidColorException, NegativeWeightException {
        if (!VALID_COLORS.contains(color)) {
            throw new NotValidColorException("Яблоки не могут быть цвета:" + color + " , правильные цвета " + VALID_COLORS);
        }

        if (weight < 0) {
            throw new NegativeWeightException("Вес не может быть отрицательным, переданный вес " + weight);
        }


        this.color = color;
    }
}
