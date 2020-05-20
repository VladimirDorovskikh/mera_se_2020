package mera.generics;

public class MyArrayStoreException extends IllegalArgumentException {
    private String message;

    public MyArrayStoreException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
