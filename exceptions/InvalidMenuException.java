package exceptions;

public class InvalidMenuException extends Exception {
    public InvalidMenuException(int menu) {
        super("Salah menu: " + menu);
    }
}
