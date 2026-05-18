package ru.javarush.java.core.level19.task16;

public class OnlineOrder extends Order{

    double amount;

    public OnlineOrder(double amount) {
        this.amount = amount;
    }

    @Override
    void process() {
        System.out.println("Обработка онлайн-заказа на сумму " + amount);
    }
}
