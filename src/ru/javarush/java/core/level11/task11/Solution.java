package ru.javarush.java.core.level11.task11;

public class Solution {
    public static void main(String[] args) {
        // Намеренно вызываем арифметическую ошибку, деля 5 на 0
        try{
            System.out.println(5 / 0);
        } finally {
            System.out.println("Датчик сообщает: Работа finally завершена. Даже в случае аварии.");
        }


        // Блок finally выполняется в любом случае, даже если произошло исключение

    }
}