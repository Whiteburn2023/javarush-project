package ru.javarush.java.core.level24.task19;

public class Solution {
    public static void main(String[] args) {

        // Передаём заведомо некорректную строку: содержит буквы и не может быть преобразована в int
        try {
            parseMeasurementValue("123abc");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования числа: введены некорректные данные");
        }


        // В этой задаче выполнение сюда не дойдёт, но оставим строку для полноты примера


        // Перехватываем ошибку преобразования и сообщаем пользователю понятным текстом


    }

    /** @throws NumberFormatException если входная строка не является корректным
     *          представлением числа (например, содержит буквы, несколько точек,
     *          пустая строка или {@code null})
     */
    //    Преобразует строковое значение измерения в целое число.
    public static int parseMeasurementValue(String measurement) {
        // Стандартный способ преобразовать строку в int; при некорректном формате бросает NumberFormatException

        return Integer.parseInt(measurement);
    }
}