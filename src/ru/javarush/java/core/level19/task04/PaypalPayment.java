package ru.javarush.java.core.level19.task04;

public class PaypalPayment extends Payment{

    @Override
    void process() {
        System.out.println("Обработка платежа через PayPal");
    }

    @Override
    void printInfo() {
        super.printInfo();
    }
}
