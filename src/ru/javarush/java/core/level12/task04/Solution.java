package ru.javarush.java.core.level12.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строк из консоли
        // Динамический список для хранения задач
        // Считываем строки до тех пор, пока не введена пустая строка
        // читаем очередную задачу
        // пустая строка — сигнал завершения ввода
        // добавляем задачу в список
        // Выводим задачи в обратном порядке: от последней к первой

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String str = scanner.nextLine();
            if (!str.equals("")) {
                list.add(str);
            } else {
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }
                return;
            }
        }
    }
}