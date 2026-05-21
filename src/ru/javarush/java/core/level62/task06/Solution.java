package ru.javarush.java.core.level62.task06;

import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем "магическую коробку"
        SecretHolder box = new SecretHolder();
        // Показываем зрителям исходное значение
        System.out.println(box.revealSecret());
        // Находим приватное поле по имени через рефлексию

        Field field = box.getClass().getDeclaredField("secretValue");
        field.setAccessible(true);
        field.set(box, 99);


        // Меняем спрятанное число незаметно для публичного API


        // Показываем зрителям новое значение
        System.out.println(box.revealSecret());
    }
}

// "Волшебная коробка": хранит приватное число и умеет его показывать через публичный метод
class SecretHolder {
    private int secretValue; // По умолчанию 0

    public int revealSecret() {
        return secretValue;
    }
}