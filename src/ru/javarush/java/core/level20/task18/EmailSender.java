package ru.javarush.java.core.level20.task18;

public class EmailSender implements MessageSender{

    @Override
    public void send(String text) {
        System.out.println("Email отправлен: " + text);
    }
}
