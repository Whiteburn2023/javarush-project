package ru.javarush.java.core.level25.task10;

public class AuthenticationFailedException extends SecurityBreachException{


    public AuthenticationFailedException(String wrongPass) {
        super(wrongPass);
    }
}
