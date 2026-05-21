package ru.javarush.java.core.level62.task03;

import ru.javarush.java.core.level20.task04.Soundable;

import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        // Получаем объект Class исследуемого "устройства"
        // getFields() возвращает все public-поля
        // Выводим только имена найденных public-полей

        Class<?> clazz = Example.class;
        System.out.println("Public fields:");
        for (Field field : clazz.getFields()) {
            System.out.println(field.getName() + " " + field.getType().getSimpleName());
        }

//        System.out.println("\nDeclared fields:");
//        for (Field field : clazz.getDeclaredFields()){
//            System.out.println(field.getName() + " : " + field.getType().getSimpleName());
//        }

    }
}

// Класс "устройство" с нужными полями
class Example {
    public int x;         // общедоступный счетчик (должен попасть в вывод)
    private String y;     // секретный код (не должен появиться)
    protected double z;   // защищенный показатель (не должен появиться)
}