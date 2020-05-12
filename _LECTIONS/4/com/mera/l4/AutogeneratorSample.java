package com.mera.l4;

public class AutogeneratorSample {
    private int number = 42;
    private String someString;
    private String another;



    public AutogeneratorSample(int number, String someString) {
        this.number = number;
        this.someString = someString;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutogeneratorSample{");
        sb.append("number=").append(number);
        sb.append(", someString='").append(someString).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
