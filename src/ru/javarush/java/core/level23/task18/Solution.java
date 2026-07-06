package ru.javarush.java.core.level23.task18;

public class Solution {
    // Осмысленные имена полей

    int count = 10;
    String message = "Привет";
    // Переименованный метод: чётко указывает, что выводит сообщение
    void printMessage() {
        System.out.println(message + " " + count); }

    public static void main(String[] args) {
        // Создаем объект и вызываем метод для демонстрации результата
        Solution app = new Solution();
        app.printMessage();
    }
}