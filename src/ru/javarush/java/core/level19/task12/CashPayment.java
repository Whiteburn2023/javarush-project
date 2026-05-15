package ru.javarush.java.core.level19.task12;

public class CashPayment extends Payment{

    @Override
    void process() {
        System.out.println("Оплата наличными");
    }
}
