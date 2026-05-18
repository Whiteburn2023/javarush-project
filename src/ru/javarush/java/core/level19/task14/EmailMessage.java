package ru.javarush.java.core.level19.task14;

public class EmailMessage extends Message{
    String text;

    public EmailMessage(String text) {
        this.text = text;
    }

    @Override
    void send() {
        System.out.println("Отправка email: " + text);
    }
}
