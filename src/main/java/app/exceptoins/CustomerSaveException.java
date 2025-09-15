package app.exceptoins;

public class CustomerSaveException extends RuntimeException {
    public CustomerSaveException(String message) {
        super(message);
    }
}
