package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
        SequentialRandom.resentRandom();
        System.out.println(new SequentialRandom().getValue());
        System.out.println(new SequentialRandom().getValue());
    }
}
