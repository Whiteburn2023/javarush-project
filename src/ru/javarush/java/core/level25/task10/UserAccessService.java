package ru.javarush.java.core.level25.task10;

public class UserAccessService {

    public void authenticateUser(String login, String pass) throws AuthenticationFailedException{

        if (!(login.equals("login") && pass.equals("pass"))){
            throw new AuthenticationFailedException("Неверный логин или пароль");
        }

    }
}
