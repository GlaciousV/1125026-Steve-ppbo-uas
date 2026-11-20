package exceptions;

public class InvalidOSException extends Exception {
    public InvalidOSException(int osChoice) {
        super("Salah pilihan operating system: " + osChoice);
    }
}