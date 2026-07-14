package ru.javarush.java.core.level24.task11;

public class Solution {
    public static void main(String[] args) {
        try {
            // Симулируем "внешнюю ошибку" с конкретной причиной (цепочка исключений)
            throw new InputValidationException("Внешняя ошибка обработки ввода",
                    new IllegalArgumentException("Передан некорректный формат данных"));

        } catch (InputValidationException e) {
            // 1) сообщение внешнего исключения
            System.out.println(e.getMessage());

            // 2) сообщение исключения-источника (корня)
            System.out.println(e.getCause().getMessage());

            // 3) имя класса исключения-источника
            System.out.println(e.getCause().getClass().getName());
        }
    }
}