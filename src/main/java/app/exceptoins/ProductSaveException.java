package app.exceptoins;

public class ProductSaveException extends RuntimeException {
    public ProductSaveException(String message) {
        super(message);
    }
}
