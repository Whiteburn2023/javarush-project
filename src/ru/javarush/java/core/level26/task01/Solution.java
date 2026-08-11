package ru.javarush.java.core.level26.task01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (реализация ArrayList) для хранения названий фруктов
        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Груша");


        // Добавляем фрукты в заданном порядке
        System.out.println(fruits.toString());


        // Выводим весь список: метод toString() у коллекции показывает все элементы

    }
}