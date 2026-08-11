package ru.javarush.java.core.level27.task05;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Создаем очередь задач на основе LinkedList
        // Добавляем идентификаторы задач в указанном порядке
        // Получаем первый элемент без удаления из очереди (peek не изменяет очередь)
        // Выводим идентификатор следующей задачи
        // Выводим текущий размер очереди

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(15);
        queue.add(25);
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }
}