package mera.bycicle;

public class WrongBicycleSpeedException extends IllegalArgumentException {
    public WrongBicycleSpeedException(String message) {
        super(message);
    }
}
