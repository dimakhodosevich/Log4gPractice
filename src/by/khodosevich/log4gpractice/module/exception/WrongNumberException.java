package by.khodosevich.log4gpractice.module.exception;

public class WrongNumberException extends Exception{
    public WrongNumberException() {
    }

    public WrongNumberException(String message) {
        super(message);
    }
}
