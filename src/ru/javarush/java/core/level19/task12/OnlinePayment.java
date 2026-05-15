package ru.javarush.java.core.level19.task12;

public class OnlinePayment extends Payment{

    @Override
    void process() {
        System.out.println("Онлайн-оплата");
    }
}
