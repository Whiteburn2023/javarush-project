package ru.javarush.java.core.level24.task09;

public class DataProcessingFailure extends Exception{

    public DataProcessingFailure(String message) {
        super(message);
    }

    public DataProcessingFailure(String message, Throwable cause) {
        super(message, cause);
    }
}
