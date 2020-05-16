package mera.abstractTask;

public class WrongLengthException extends IllegalArgumentException {
    private String message;

    public WrongLengthException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
