package ru.mera;

public class ObjectsAndPrimitivs {

    public static void main(String[] args) {
        int primInt = 42;
        Integer objectInt = new Integer(primInt);

        long primLong = 42L;
        Long objectLong = primLong;

        char primChar = 'a';
        Character objectChar = primChar;
    }
}
