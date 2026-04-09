package ru.javarush.java.core.level11.task06;

public class Solution {
    public static void main(String[] args) {
        // Рюкзак героя на 3 слота: храним ID предметов
        int[] heroInventory = {101, 102, 103};


        try {
            // Ошибочный доступ к 10-му индексу (за пределами массива из 3 элементов)

            System.out.println(heroInventory[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Сообщение для игрока о выходе индекса за границы массива
            System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");


        }
    }
}