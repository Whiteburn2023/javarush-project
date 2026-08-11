package ru.javarush.java.core.level27.task06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Очередь печати на базе ArrayDeque (FIFO)
        // Стек истории действий на базе ArrayDeque (LIFO)
        // Используем push для добавления на вершину стека
        // Вывод очереди: сначала заголовок, затем извлекаем (poll) элементы в порядке FIFO
        // Вывод стека: сначала заголовок, затем снимаем (pop) элементы в порядке LIFO

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Кот");
        queue.add("Пёс");
        queue.add("Мышь");

        Deque<Character> deque = new ArrayDeque<>();
        deque.push('X');
        deque.push('Y');
        deque.push('Z');

        System.out.println("Очередь:");
        while (queue.peek() != null){
            System.out.println(queue.poll());
        }

        System.out.println("Стек:");
        while (deque.peek() != null){
            System.out.println(deque.pop());
        }
    }
}