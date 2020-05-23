public class MyArrayStoreException extends RuntimeException {
    private String message;

    public MyArrayStoreException(String message) {
        this.message = message;
    }
}