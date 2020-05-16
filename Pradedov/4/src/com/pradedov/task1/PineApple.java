package com.pradedov.task1;

public class PineApple extends Fruit{
    private final int tailLength;

    private static final String type = "Pine Apple";
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 20;

    public PineApple(int weight, int tailLength) {
        super(weight);

        if (tailLength < MIN_LENGTH || tailLength > MAX_LENGTH) {
            throw new IllegalArgumentException(type + " tailLength should be in range ["
                    + MIN_LENGTH + ", " + MAX_LENGTH + "], but you provided: " + tailLength);
        }
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return type + ".  Weight: " + weight + "; Tail length: " + tailLength;
    }
}
