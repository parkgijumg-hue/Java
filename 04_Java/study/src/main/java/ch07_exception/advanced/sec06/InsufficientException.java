package main.java.ch07_exception.advanced.sec06;

public class InsufficientException extends Exception {
    public InsufficientException() {}
    public InsufficientException(String message) {
        super(message);
    }
}
