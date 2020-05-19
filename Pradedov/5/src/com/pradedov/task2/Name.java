package com.pradedov.task2;

enum Name {
    ALEXEY("Alexey"),
    ANDREY("Andrey"),
    VALENTINA("Valentina"),
    MAXIM("Maxim"),
    MIKHAIL("Nataly"),
    ANTON("Anton"),
    ALEXANDER("Alexander"),
    OLGA("Olga"),
    LEONA("Leona"),
    IRINA("Irina"),
    MARIA("Maria"),
    MARINA("Marina"),
    ARTYOM("Artyom");


    private final String name;

    Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
