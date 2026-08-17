package ru.javarush.java.core.level28.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution {
    public static void main(String[] args) {
        // Формируем исходный список животных
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");

        // Получаем ListIterator для безопасного прохода и модификации списка
        ListIterator<String> iterator = animals.listIterator();

        // Итерируемся по списку
        while (iterator.hasNext()){
            String pet = iterator.next();
            if (pet.length() == 3){
                iterator.remove();
                iterator.add("pet");
            }
        }

        

        // После обработки выводим итоговый список на экран
        System.out.println(animals);
    }
}