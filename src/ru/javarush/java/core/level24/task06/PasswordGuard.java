package ru.javarush.java.core.level24.task06;

public class PasswordGuard {

    public void enforcePasswordStrength(String pass) throws WeakPasswordException {
        if (pass.length() < 6){
            throw new WeakPasswordException("Пароль слишком короткий!");
        }
    }
}
