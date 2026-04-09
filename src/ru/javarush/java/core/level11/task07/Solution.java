package ru.javarush.java.core.level11.task07;

public class Solution {
    public static void main(String[] args) {
        try {
            // Пробуем поделить 50 на 0 — это вызовет ArithmeticException
            System.out.println(50/0);


        } catch (ArithmeticException e) {
            // Выводим текстовое описание ошибки, сгенерированное JVM
            System.out.println(e.getMessage());

        }
    }
}