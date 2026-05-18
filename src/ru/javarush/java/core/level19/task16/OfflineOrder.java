package ru.javarush.java.core.level19.task16;

public class OfflineOrder extends Order{

    double amount;

    public OfflineOrder(double amount) {
        this.amount = amount;
    }

    @Override
    void process() {
        System.out.println("Обработка оффлайн-заказа на сумму " + amount);
    }
}
