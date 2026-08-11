package ru.javarush.java.core.level27.task04;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        // Создаем множество HashSet<String> для хранения технологий
        // Добавляем названия технологий
        // Удаляем элементы, содержащие символ '+', используя итератор
        // Выводим оставшиеся элементы множества, каждый на новой строке (порядок не гарантируется)

        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("javascript");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.contains("+")){
                iterator.remove();
            }
        }
        set.forEach((i) -> System.out.println(i));
    }
}