package ru.javarush.java.core.level21.task04;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Фиксированный префикс для всех отчётных строк
        // Лямбда-выражение — "функция форматирования":
        // Вызов функции с аргументом 7 и вывод результата

        String string = "Результат: ";

        IntFunction<String> concat = s -> {
            String result = string + (s * 2);
            return result;
        };

        System.out.println(concat.apply(7));



    }
}