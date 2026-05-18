package ru.javarush.java.core.level19.task14;

public class SmsMessage extends Message{
    String text;

    public SmsMessage(String text) {
        this.text = text;
    }

    @Override
    void send() {
        System.out.println("Отправка SMS: " + text);
    }
}
