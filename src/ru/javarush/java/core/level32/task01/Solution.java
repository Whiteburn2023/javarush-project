package ru.javarush.java.core.level32.task01;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные: список групп, у каждой группы — список увлечений
        List<List<String>> studentGroupsAndHobbies = List.of(
                List.of("Плавание", "Шахматы"),
                List.of("Футбол"),
                List.of("Программирование", "Чтение", "Кино")
        );

        // flatMap "расплющивает" поток списков в поток строк (хобби),
        // после чего собираем всё в единый List<String>
        List<String> allStudentHobbies = studentGroupsAndHobbies.stream().flatMap(Collection::stream).toList();


        // Выводим итоговый список на экран
        System.out.println(allStudentHobbies);
    }
}