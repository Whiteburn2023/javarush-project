package ru.javarush.java.core.level37.task05;

import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) {
        // Определяем системную кодировку по умолчанию средствами стандартной библиотеки
        String property = System.getProperty("file.encoding");
        Charset charset = Charset.defaultCharset();


        // Выводим только значение кодировки, без дополнительного текста
//        System.out.println(property);
        System.out.println(charset);

    }
}