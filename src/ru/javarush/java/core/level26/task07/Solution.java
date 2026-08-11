package ru.javarush.java.core.level26.task07;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует строки по алфавиту и не допускает дубликатов
        // Добавляем первых трёх зарегистрировавшихся (порядок добавления произвольный)
        // Выводим список участников в алфавитном порядке

        TreeSet<String> set = new TreeSet<>();
        set.add("Борис");
        set.add("Алексей");
        set.add("Виктор");

        System.out.println(set);

    }
}