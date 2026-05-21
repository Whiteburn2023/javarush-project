package ru.javarush.java.core.level62.task04;

import ru.javarush.java.core.level20.task04.Soundable;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Получаем объект Class для класса Sample
        // getDeclaredMethods() возвращает все методы, объявленные непосредственно в классе, включая private
        // Собираем только имена методов
        // Сортируем для стабильного, предсказуемого вывода
        // Печатаем имена всех объявленных методов класса Sample

        Class<?> clazz = Sample.class;
//        for (Method method : clazz.getMethods()){
//            System.out.println(method.getName());
//        }

        for (Method method : clazz.getDeclaredMethods()){
            System.out.println(method.getName());
        }

    }
}

class Sample {
    // Общеизвестный ритуал: публичный метод без возвращаемого значения
    public void foo() {
        // Пустая реализация: нам важен факт существования метода
    }

    // Скрытый ритуал: приватный метод, возвращает int
    private int bar() {
        return 42; // Любое значение, чтобы метод компилировался
    }
}