package ru.javarush.java.core.level26.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (ArrayList) для названий фильмов
        List<String> films = new ArrayList<>();
        films.add("Титаник");
        films.add("Матрица");
        films.add("Интерстеллар");
        films.add("Матрица");
        System.out.println(1 + films.indexOf("Матрица"));
        System.out.println(films.contains("Аватар"));
        films.clear();
        System.out.println(films);


        // Добавляем фильмы в список
        // по ошибке добавили снова
        // Ищем первое вхождение "Матрица"
        // Проверяем наличие "Аватар" в списке
        // contains возвращает true/false
        // Очищаем список
        // Выводим содержимое списка после очистки — должен быть пустым: []

    }
}