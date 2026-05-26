package ru.javarush.java.core.level21.task05;

import jdk.dynalink.Operation;
import ru.javarush.java.core.level20.task04.Soundable;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Создаем "конвертер" через ссылку на статический метод Integer.toHexString(int)
        // Применяем конвертер к числу 255
        // Выводим шестнадцатеричное представление на экран

        IntFunction<String> convert = Integer::toHexString;

        System.out.println(convert.apply(255));

    }
}