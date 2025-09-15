package app.exceptoins;

public class CustomerUpdateException extends RuntimeException {
    public CustomerUpdateException(String message) {
        super(message);
    }
}
