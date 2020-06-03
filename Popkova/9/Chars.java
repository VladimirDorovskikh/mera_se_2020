package com.katepopkova;

public enum Chars {
    NEW_STRING('\n'),
    SLASH('/'),
    SPACE(' ');

    private char ch;

    Chars(char ch) {
        this.ch = ch;
    }

    public char getValue() {
        return ch;
    }
}