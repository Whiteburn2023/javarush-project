package ru.javarush.java.core.level34.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Изменяемая корзина товаров
        List<String> cart = new ArrayList<>();
        cart.add("товар X");
        cart.add("товар Y");

        // Защищенное представление (обертка) над корзиной:
        List<String> list = Collections.unmodifiableList(cart);

        // Независимая копия корзины (снимок на текущий момент):
        List<String> listCopy = List.copyOf(cart);

        // Добавляем новый товар в исходную корзину уже после создания представлений
        cart.add("товар Z");

        // Демонстрация различий:
        // Обертка покажет добавленный элемент, снимок — нет.
        System.out.println(list);
        System.out.println(listCopy);

        // Будет ошибка (UnsupportedOperationException), т.к. protectedView — только для чтения:

    }
}