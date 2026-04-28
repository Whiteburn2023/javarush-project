package ru.javarush.java.core.level17.task08;

public class AppleBasket extends Basket{
    @Override
    Fruit getFruit() {
        return new Apple();
    }
}
