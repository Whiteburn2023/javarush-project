package ru.javarush.java.core.level20.task16;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реализация: преобразует строку к нижнему регистру

        StringTransformer st = s -> s.toLowerCase();

        st.printTransformed("JAVA ROCKS");
        



        // Вызываем default-метод для строки "JAVA ROCKS"

    }
}